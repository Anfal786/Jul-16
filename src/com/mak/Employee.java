package com.mak;

public class Employee {

	public static void main(String[] args) {
		double sal = 15000,taxRate=10,allowRate=15;
		System.out.println("Net Salary: "+(sal-(taxRate*sal/100)+(sal*allowRate/100)));
	}

}
