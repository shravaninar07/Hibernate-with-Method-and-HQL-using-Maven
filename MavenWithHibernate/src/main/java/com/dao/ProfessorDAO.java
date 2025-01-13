package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;
import org.hibernate.query.criteria.JpaCriteriaQuery;
import org.hibernate.query.criteria.JpaRoot;

import com.entity.Professor;

public class ProfessorDAO {
	
	public void insert() {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Professor.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr =ss.beginTransaction();
	    
		Professor pro= new Professor();
		pro.setPro_name("Shravani");
		pro.setSubject("English");
		pro.setAadharno(988967675656L);
		pro.setMobileno(8978675645l);
		ss.persist(pro);
		tr.commit();
		ss.close();
		System.out.println("data inserted");
		
	}
	
	public void update() {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Professor.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		int id=1;
		Professor update= ss.get(Professor.class, id);
		update.setPro_name("Priya");
		update.setSubject("Maths");
		update.setMobileno(8767678677l);
		update.setAadharno(56767677867l);
		ss.merge(update);
		tr.commit();
		ss.close();
		System.out.println("Data updated");
	}
	
	public void delete() {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Professor.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		int id=2;
		Professor delete=ss.get(Professor.class, id);
		ss.remove(delete);
		tr.commit();
		ss.close();
		System.out.println("Data deleted");
		
	}
	public void fetchAll() {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Professor.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		HibernateCriteriaBuilder hcb = ss.getCriteriaBuilder();
		JpaCriteriaQuery<Object> cq = hcb.createQuery();
		JpaRoot<Professor> root = cq.from(Professor.class);
		cq.select(root);

		Query query = ss.createQuery(cq);
		List<Professor> list = query.getResultList();

		for (Professor emp : list) {
			System.out.println(emp);

		}
		
		ss.close();
		
	}
}
