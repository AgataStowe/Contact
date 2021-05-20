package br.com.contacts.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.contacts.connection.ConnectionFactory;
import br.com.contacts.model.entity.Person;

public class GenericDao<T extends Person> {
	
	private static EntityManager manager = ConnectionFactory.getEntityManager();
	
	
	public T findById(Class<T> clazz, Long id){
		return manager.find(clazz, id);
	}
	
	public void saveOrUpdate(T obj){
		try{
			manager.getTransaction().begin();
			if(obj.getId() == null){
				manager.persist(obj);
			}else{
				manager.merge(obj);
			}
			manager.getTransaction().commit();
		}catch(Exception e){
			manager.getTransaction().rollback();
		}
	}
	
	public void remove(Class<T> clazz, Long id){
		T t = findById(clazz, id);
		try{
			manager.getTransaction().begin();
			manager.remove(t);
			manager.getTransaction().commit();
		}catch (Exception e) {
			manager.getTransaction().rollback();
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<T> listAll(Class<T> clazz){
	    return (List<T>) manager.createQuery("select t from " + clazz.getName() + " t").getResultList();
	}
}
