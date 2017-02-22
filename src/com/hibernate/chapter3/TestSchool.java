package com.hibernate.chapter3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import com.hibernate.chapter2.Customer;

public class TestSchool {
	public static void main(String[] args) {
		AnnotationConfiguration config=new AnnotationConfiguration();
		config.addAnnotatedClass(School.class);
		config.configure("hibernate.cfg.xml");//reads hibernate.cfg.xml
		
		new SchemaExport(config).create(true, true);
		//to create tables(use only once)
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		session.beginTransaction();
		SchoolDetail ann=new SchoolDetail();
		ann.setSchoolAddress("Hyderabad");
		ann.setStudentCount(300);
		
		School stan=new School();
		stan.setSchoolName("school");
		stan.setSchoolDetail(ann);
		session.save(stan);
		session.getTransaction().commit();
	}

}
