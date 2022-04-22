package com.employee;

public class Employee {
	private String name;
	private int id;
	private String dept;
	
	public void getName()
	{
		System.out.print(this.name);
	}
	public void getId()
	{
		System.out.print(this.id);
	}
	public void getDept()
	{
		System.out.print(this.dept);
	}
	public void setName(String nam)
	{
		this.name=nam;
	}
	public void setId(int i)
	{
		this.id=i;
	}
	public void setDept(String dep)
	{
		this.dept=dep;
	}
}
