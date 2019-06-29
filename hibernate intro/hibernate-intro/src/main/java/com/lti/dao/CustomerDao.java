package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.lti.entity.Customer;

public class CustomerDao {

	public void databaseIlAddSeiyavum(Customer customer) {
		//step 1. load/Create EntityManagerFactory object
	    //During this step, META-INF/persistence.xml is read		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("oracle-pu");
		
		//step 2. load/create EntityManager object
		EntityManager em=emf.createEntityManager();
		
		//step 3. Start/Participate in a transaction
		EntityTransaction tx= em.getTransaction();
		tx.begin();
		
		//Now we Can insert/update/delete/select Whatever we want
		em.persist(customer); //persist method generates insert query
		
		tx.commit();
		
		//below code should be in finally block
		em.close();
		emf.close();
		
	}
	
	public Customer databaseIlVanguthal(int  custId) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("oracle-pu");
		EntityManager em = emf.createEntityManager();
		
		//find method generate the select query
		Customer c = em.find(Customer.class, custId);
		
		em.close();
		emf.close();
		
		return c;
		
		
	}
	public void databaseIlThirutham(Customer customer) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("oracle-pu");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction tx= em.getTransaction();
		tx.begin();
		
		em.merge(customer);
		tx.commit();
		
		
		em.close();
		emf.close();
	}
	
}
