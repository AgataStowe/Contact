package br.com.contacts.application;

import br.com.contacts.dao.GenericDao;
import br.com.contacts.model.entity.Contact;

public class main {

	public static void main(String[] args) {
			
			Contact pessoa = new Contact();
			
			GenericDao<Contact> daoPessoa = new GenericDao<Contact>();
			
			
			pessoa.setFullName("Stowe");
			daoPessoa.saveOrUpdate(pessoa);
			
			System.out.println("Entidades salvas com sucesso!");
			
		}

	}


