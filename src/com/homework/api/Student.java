package com.homework.api;


public class Student {
	private int roolNo;
	private String name;
	private String address;
	public int getRoolNo() {
		return roolNo;
	}
	public void setRoolNo(int roolNo) {
		this.roolNo = roolNo;
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
	
	  @Override public String toString() { return "roolNo=" + roolNo +
	  ", name=" + name + ", address=" + address; 
	  }
	/*
	 * public void printAllStudent(List<Student> student) { for(Student studentlist:
	 * student) { System.out.println(studentlist); } }
	 */
	 
}
