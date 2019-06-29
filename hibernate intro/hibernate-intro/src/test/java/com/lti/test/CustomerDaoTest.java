package com.lti.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lti.dao.CustomerDao;
import com.lti.entity.Customer;

public class CustomerDaoTest {

	@Test
	public void testAdd() {
		Customer c=new Customer();
		c.setName("aaa");
		c.setEmail("aaa@gmail.com");
		c.setCity("chennai");
		//c.setDateOfBirth(null);
		
		CustomerDao dao=new CustomerDao();
		dao.databaseIlAddSeiyavum(c);
	}


	@Test
	public void testFetch() {
		CustomerDao dao=new CustomerDao();
		Customer cust=dao.databaseIlVanguthal(22);
		
		System.out.println(cust.getName());
		System.out.println(cust.getEmail());
		System.out.println(cust.getDateOfBirth());
		System.out.println(cust.getCity());
		
	}
	
	@Test
	public void testUpdate() {
		CustomerDao dao=new CustomerDao();
		Customer cust=dao.databaseIlVanguthal(22);
		
		cust.setCity("us");
		dao.databaseIlThirutham(cust);
		
		
	}
		
		
}
