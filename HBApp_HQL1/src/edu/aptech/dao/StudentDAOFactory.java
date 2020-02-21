package edu.aptech.dao;

public class StudentDAOFactory
{
	public static StudentDAO getInstance()
	{
		return new StudentDAOImpl();
	}
}
