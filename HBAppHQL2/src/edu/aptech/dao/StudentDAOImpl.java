package edu.aptech.dao;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import edu.aptech.bean.Employee;

import edu.aptech.util.HibernetUtil;

public class StudentDAOImpl implements StudentDAO
{

	@Override
	public void userCheck() 
	{
		System.out.println("Enter username and password:: ");
		Scanner sc=new Scanner(System.in);
		String uname=sc.next();
		String pass=sc.next();
		Session session=HibernetUtil.getSession();
		Query query=session.createQuery("from Employee");
		List<Employee> list=query.list();
		int i=0;
		while(list!=null)
		{	
			System.out.println("Hello");
			Employee emp=list.get(0);
			if(uname.equals(emp.getUname()) && pass.equals(emp.getPass()))
			{
				System.out.println("Login Successful!!");
				break;
			}
			else
			{
				System.out.println("Failed...");
			}
			i++;
		}

		HibernetUtil.closeSession();
		HibernetUtil.closeSessionFactory();
	}
 
}
