package br.com.contacts.application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.contacts.model.entity.Contact;

public class main {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("contacts");
		EntityManager entity =  factory.createEntityManager();
		
			Contact pessoa = new Contact();
			
			pessoa.setFullName("Stowe");
			entity.persist(pessoa);
			
			System.out.println("Entidades salvas com sucesso!");
			
		}

	}


