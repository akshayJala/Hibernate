package com.hibernate.chapter2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import com.hibernate.chapter1.Employee;

public class TestCustomer {

	public static void main(String[] args) {
		AnnotationConfiguration config=new AnnotationConfiguration();
		config.addAnnotatedClass(Customer.class);
		config.configure("hibernate.cfg.xml");//reads hibernate.cfg.xml
		
		new SchemaExport(config).create(true, true);
		//to create tables(use only once)
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		session.beginTransaction();
		Customer alex=new Customer();
		alex.setCustomerName("Alex");
		alex.setCustomerAddress("Hyderabad");
		alex.setCreditScore(780);
		alex.setRewardPoints(12000);
		
		session.save(alex);
		session.getTransaction().commit();

	}

}
