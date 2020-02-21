package edu.aptech.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import edu.aptech.bean.Student;
import edu.aptech.util.HibernetUtil;

public class StudentDAOImpl implements StudentDAO
{

	@Override
	public void printAllStudent() 
	{
		Session session=HibernetUtil.getSession();
		Transaction tx=session.beginTransaction();
	
		// Updating with Named Parameters...
		 Query query=session.createQuery("update Student s set s.address='Jaipur'where s.sid= :name1");
		 // set Param values
		 query.setInteger("name1",1001);
		 
		 int count=query.executeUpdate();
		 if(count!=0)
		 {
			 System.out.println("Record(s) updated: "+count);
		 }
		  
		tx.commit();
		HibernetUtil.closeSession();
		HibernetUtil.closeSessionFactory();
	}
 
}
