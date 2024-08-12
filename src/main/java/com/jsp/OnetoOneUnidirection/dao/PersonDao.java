package com.jsp.OnetoOneUnidirection.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.OnetoOneUnidirection.model.Pancard;
import com.jsp.OnetoOneUnidirection.model.Person;

public class PersonDao {

	private Object person;
	
	public EntityManager getEntityManager()
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Omkarr");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		return entityManager;
	}
	
	public void savePerson(Person person)
	{
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Pancard pancard=person.getPancard();
		
		entityTransaction.begin();
		entityManager.persist(pancard);
		entityManager.persist(person);
		entityTransaction.commit();
		
	}
	
	public void updateperson(int id,Person person)
	{
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Person persondb=entityManager.find(Person.class, id);
		
		if(persondb!=null)
		{
			person.setId(id);
		}
		entityTransaction.begin();
		entityManager.merge(person);
		entityTransaction.commit();
	}
	
}
