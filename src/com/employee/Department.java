package com.employee;

import java.util.*;

public class Department {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			Employee e=new Employee();
			e.setName(sc.next());
			e.setId(sc.nextInt());
			e.setDept(sc.next());
			e.getName();
			e.getId();
			e.getDept();
		}

	}
	

}