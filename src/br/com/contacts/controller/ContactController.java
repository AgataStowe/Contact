package br.com.contacts.controller;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.contacts.dao.GenericDao;
import br.com.contacts.enums.ActionsEnum;
import br.com.contacts.interfaces.Logic;
import br.com.contacts.model.entity.Contact;

public class ContactController implements Logic{
	
	GenericDao<Contact> dao = new GenericDao<Contact>();

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		
		Integer action  = Integer.parseInt(req.getParameter("action"));
		Long id  = Long.valueOf(req.getParameter("id"));
		
		if(action.compareTo(ActionsEnum.SAVE.getKey()) == 0 || action.compareTo(ActionsEnum.UPDATE.getKey()) == 0) {
			this.saveOrUpdateContact(req);
		} else if(action.compareTo(ActionsEnum.DELETE.getKey()) == 0) {
			this.remove(req, id);
		} else {
			this.list(req, id);
		}
		return null;
	}
	
	private Contact montarObjeto(HttpServletRequest req) {
		Contact contact = new Contact();
		
		contact.setFullName(req.getParameter("fullName"));
		contact.setAlias(req.getParameter("alias"));
		contact.setEmail(req.getParameter("email"));
		contact.setPhoneNumber(!req.getParameter("phoneNumber").isEmpty() ? Integer.parseInt(req.getParameter("phoneNumber").toString()) : null);
		contact.setPlace(req.getParameter("place"));
		contact.setRelation(req.getParameter("relation"));
		contact.setRegisterDate(LocalDateTime.now());
		
		return contact;
	}
	
	private void saveOrUpdateContact(HttpServletRequest  req) {
		try {
			dao.saveOrUpdate(this.montarObjeto(req));
			req.setAttribute("msgm", "Contato salvo com sucesso");
		} catch (Exception e) {
			e.printStackTrace();
			e.getCause();
			e.getMessage();
			req.setAttribute("msgm", "Erro ao salvar o contato");
		}
	}
	
	private void remove(HttpServletRequest  req, Long id) {
		try {
			Class cls = Class.forName("Contact");
			dao.remove(cls, id);
			req.setAttribute("msgm", "Contato removido com sucesso");
		} catch (Exception e) {
			e.printStackTrace();
			e.getCause();
			e.getMessage();
			req.setAttribute("msgm", "Erro ao remover o contato");
		}
	}
	
	private void list(HttpServletRequest  req, Long id) {
		try {
			Class cls = Class.forName("Contact");
			
			if(id == null) {
				dao.listAll(cls);
			}else {
				dao.findById(cls, id);
			}
		} catch (Exception e) {
			e.printStackTrace();
			e.getCause();
			e.getMessage();
		}
	}

}
