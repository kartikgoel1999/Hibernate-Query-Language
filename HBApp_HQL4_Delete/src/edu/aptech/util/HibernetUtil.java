package edu.aptech.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernetUtil 
{

	private static SessionFactory factory=null;
	private static ThreadLocal<Session> threadLocal=new ThreadLocal<Session>();
	static
	{
		factory=new Configuration().configure("edu/aptech/cfg/hibernate.cfg.xml").buildSessionFactory();
	}
	public static Session getSession()
	{
		Session session=null;
		if(threadLocal.get()==null) 
		{
			session=factory.openSession();
			threadLocal.set(session);
		}
		else
		{
			session=threadLocal.get();
		}
		return session;
	}
	public static void closeSession()
	{
		if(threadLocal.get()!=null) 
		{
			Session session=threadLocal.get();
			session.close();
			threadLocal.remove();
		}
	}
	public static void closeSessionFactory()
	{
		if(factory!=null)
		{
			factory.close();
		}
	}
}
