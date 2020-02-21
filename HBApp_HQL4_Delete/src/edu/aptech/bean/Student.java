package edu.aptech.bean;

public class Student 
{
	//Bean Properties
	private int sid;
	private int marks;
	private String name;
	private String address;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", marks=" + marks + ", name=" + name + ", address=" + address + "]";
	}


}
