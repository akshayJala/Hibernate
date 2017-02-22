package com.hibernate.chapter1;

import java.sql.Date;
import java.util.GregorianCalendar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import org.hibernate.tool.hbm2ddl.SchemaExport;

public class TestEmployee {

	public static void main(String[] args) {
		AnnotationConfiguration config=new AnnotationConfiguration();
		config.addAnnotatedClass(Employee.class);
		config.configure("hibernate.cfg.xml");//reads hibernate.cfg.xml
		
		new SchemaExport(config).create(true, true);
		//to create tables(use only once)
		
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		session.beginTransaction();
		
		Employee alex = new Employee();
		//alex.setEmpId(100);
		//if we use @Generatedvalue
		alex.setEmpName("Alex Berry");
		alex.setEmpEmailAddress("alex@hibernate.com");
		alex.setEmpPassword("alexpass");
		alex.setEmpJoinDate(new GregorianCalendar(2009, 05, 26));
		alex.setEmpLoginTime(Date.valueOf("2016-02-22"));
		session.save(alex);
		
		session.getTransaction().commit();
	
	}

}
