package edu.aptech.client;

import edu.aptech.bean.Employee;
import edu.aptech.dao.StudentDAO;
import edu.aptech.dao.StudentDAOFactory;

import edu.aptech.util.HibernetUtil;

public class ClientApp 
{
	public static void main(String[] args)
	{
		StudentDAO dao=StudentDAOFactory.getInstance();
		dao.userCheck();
		
	}
}
