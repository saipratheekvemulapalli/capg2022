package com.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

class CrudOperation {

	private static SessionFactory sessionFactory = null;
	Transaction transcation = null;
	Integer empployeeid = null;
	Session session1=null;

	// business logic part for insert
	public Integer addEmployee(String firstname, String lastname, String salary) {
		// intilize the session
		Session session = null;
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();

		// begin transcation

		transcation = session.beginTransaction();
		Employee employee = new Employee(firstname, lastname, salary);
		empployeeid = (Integer) session.save(employee);// this save() will form "insert into table " query
														// automaticall// in db"
		transcation.commit();
		return empployeeid;

	}

	// read the list of employees from table // business logic part for insert
	public void readEmployee() {
		// intilize the session
		Session session = null;
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();

		// begin transcation
		transcation = session.beginTransaction();

		Query query = session.createQuery("FROM Employee");

		List<Employee> employeelist = query.list();

		for (Employee newlist : employeelist) {

			System.out.println("first name is " + newlist.getFirstname());
			System.out.println("last name is " + newlist.getLastname());
			System.out.println("salary is " + newlist.getSalary());
			System.out.println(" ");

		}
	}
	public Employee updateEmployee(Employee empobj, int id) {
		Session session=null;
		sessionFactory =new Configuration().configure().buildSessionFactory();
		session =sessionFactory.openSession();
		
		transcation=session.beginTransaction();
		Employee employee = (Employee) session.get(Employee.class, id);
		employee.setFirstname(empobj.getFirstname());
		employee.setLastname(empobj.getLastname());
		employee.setSalary(empobj.getSalary());
		session.update(employee);
		transcation.commit();
		return employee;
	}
	public Employee findbyId(int empid) {
		sessionFactory =new Configuration().configure().buildSessionFactory();
		session1 =sessionFactory.openSession();
		
		transcation=session1.beginTransaction();
		
		Employee findid= (Employee) session1.load(Employee.class, empid);
		
		return findid;
		}
	public void deleteEmployeeById(int id) {
		sessionFactory= new Configuration().configure().buildSessionFactory();
		session1=sessionFactory.openSession();
		transcation=session1.beginTransaction();
		Employee deleteobj= findbyId(id);
		session1.delete(deleteobj);
		transcation.commit();
	}
		
	 
}

public class MainClass {

	public static void main(String[] args) {
		CrudOperation crudOperation = new CrudOperation();
		
		// for inserting values in db
		// Integer result = crudOperation.addEmployee("kishore", "kumar", "30000");
		// for reading values from
		
		// System.out.println(" result is" + result);
		// System.out.println("Done....");
		crudOperation.readEmployee();
	
		// update method is ur assignment
/*		Employee updtls= new Employee();
		updtls.setFirstname("lal");
		updtls.setLastname("singh");
		updtls.setSalary("10000");
		Employee employee= crudOperation.updateEmployee(updtls,4);
		String firstname= employee.getFirstname();
		System.out.println("updated name is "+firstname);
	*/	
		
/*		Employee gotid=crudOperation.findbyId(4);
		gotid.getId();
		System.out.println("is.."+gotid.getId());
		crudOperation.deleteEmployeeById(4); 
	*/	
	}

}
