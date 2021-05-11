package br.com.contacts.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

public class ConnectionFactory {
	
	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("contacts");
	
	public static EntityManager getEntityManager() {
		return factory.createEntityManager();
	}
}
