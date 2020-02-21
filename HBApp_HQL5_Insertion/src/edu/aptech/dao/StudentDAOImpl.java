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
	
		// Deletion with Positional Parameters...
		 Query query=session.createQuery("insert into Student (SID,NAME,ADDRESS,MARKS)"+"select sd.sid,sd.name,sd.address,sd.marks from StudentDetails sd where sd.sid=?");
		 // set Param values
		 query.setParameter(0,1001);
		 
		 int count=query.executeUpdate();
		 if(count!=0)
		 {
			 System.out.println("Record(s) inserted: "+count);
		 }
		  
		tx.commit();
		HibernetUtil.closeSession();
		HibernetUtil.closeSessionFactory();
	}
 
}
