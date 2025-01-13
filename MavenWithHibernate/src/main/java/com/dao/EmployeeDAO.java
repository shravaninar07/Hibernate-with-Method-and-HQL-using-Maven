package com.dao;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.entity.Employee;

public class EmployeeDAO {
	public void insert() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter name");
		String Name = sc.nextLine();

		System.out.println("Enter dept");
		String Dept = sc.nextLine();

		System.out.println("Enter salary");
		int Salary = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter mobile no");
		long MN = sc.nextLong();
		sc.nextLine();

		String hqlQuery = "insert into Employee(name,dept,salary,mobileNo)values(:myname, : mydept, :mysalary,:mymobilenNO)";
		MutationQuery query = ss.createMutationQuery(hqlQuery);
		query.setParameter("myname", Name);
		query.setParameter("mydept", Dept);
		query.setParameter("mysalary", Salary);
		query.setParameter("mymobilenNO", MN);
		query.executeUpdate();
		tr.commit();
		ss.close();
		System.out.println("Data Inserted succesfully..");

	}

	public void update() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter id to update");
		int ID = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter name");
		String Name = sc.nextLine();

		System.out.println("Enter dept");
		String Dept = sc.nextLine();

		System.out.println("Enter salary");
		int Salary = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter mobile no");
		long MN = sc.nextLong();
		sc.nextLine();

		String hqlQuery = "update Employee set name=:myname,dept=:mydept,salary=:mysalary,mobileNo=:mymobilenNO where id=:myid";
		MutationQuery query = ss.createMutationQuery(hqlQuery);
		query.setParameter("myname", Name);
		query.setParameter("mydept", Dept);
		query.setParameter("mysalary", Salary);
		query.setParameter("mymobilenNO", MN);
		query.setParameter("myid", ID);
		query.executeUpdate();
		tr.commit();
		ss.close();
		System.out.println("Data Updated succesfully..");
	}

	public void delete() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter id to delete");
		int ID = sc.nextInt();
		sc.nextLine();

		String hqlQuery = "delete from Employee where id=:myid";
		MutationQuery query = ss.createMutationQuery(hqlQuery);
		query.setParameter("myid", ID);
		query.executeUpdate();
		tr.commit();
		ss.close();
		System.out.println("Data deleted succesfully..");
	}

	public void fetchAll() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "from Employee";
		Query<Employee> emp = ss.createQuery(hqlQuery, Employee.class);
		List<Employee> list = emp.getResultList();
		for (Employee employee : list) {
			System.out.println(employee);
		}

	}
}