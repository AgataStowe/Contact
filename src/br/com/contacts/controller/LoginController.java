package br.com.contacts.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.contacts.dao.GenericDao;
import br.com.contacts.enums.ActionsEnum;
import br.com.contacts.interfaces.Logic;
import br.com.contacts.model.entity.Contact;

public class LoginController implements Logic {
	
	GenericDao<Contact> dao = new GenericDao<Contact>();

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		Integer action  = Integer.parseInt(req.getParameter("action"));

		if(action.compareTo(ActionsEnum.LOGIN.getKey()) == 0) {
			return "home.jsp";			
		}
		return null;

		
	}
	
	
}
