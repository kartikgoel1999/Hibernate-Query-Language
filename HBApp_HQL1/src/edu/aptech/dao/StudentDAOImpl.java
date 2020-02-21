package edu.aptech.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import edu.aptech.bean.Student;

import edu.aptech.util.HibernetUtil;

public class StudentDAOImpl implements StudentDAO
{

	@Override
	public void printAllStudent() 
	{
		Session session=HibernetUtil.getSession();
		/* Using Placeholder
		  Query query=session.createQuery("from Student where marks>=?");
		//set param values
		query.setInteger(0,6001); //hibernate 5.4.3 doesn't support this
		
		List<Student> list=query.list();
		
		for(Student s : list)
		{
			System.out.println(s);
		}*/
		// Named Parameter
		 Query query=session.createQuery("from Student where sid in(:name1)");
		 // set Param values
		 query.setInteger("name1",1001);
		
		  //execute  the Query
		   List<Student> list=query.list();
		  //process the result
		   for(Student s: list)
		   {
		   	System.out.println(s);
		   }
		 
		
		HibernetUtil.closeSession();
		HibernetUtil.closeSessionFactory();
	}
 
}
