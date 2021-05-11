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
	
	public ContactController() {}

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		
		Integer action  = Integer.parseInt(req.getParameter("action"));
		
		if(action.compareTo(ActionsEnum.SAVE.getKey()) == 0) {
			try {
				dao.saveOrUpdate(this.montarObjeto(req));
			} catch (Exception e) {
				e.printStackTrace();
				e.getCause();
				e.getMessage();
			}
			
		} else if(action.compareTo(ActionsEnum.UPDATE.getKey()) == 0) {
			
		} else if(action.compareTo(ActionsEnum.DELETE.getKey()) == 0) {
			
		} else {
			
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

}
