package com.mak;

public class Student {
	String name, result;
	int m1, m2, m3;
	char grade;

	public Student(String name, int m1, int m2, int m3) {
		super();
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		int sum = m1 + m2 + m3;
		 
		if (sum >= 90)
			grade = 'A';
		else if (sum >= 80)
			grade = 'B';
		else
			grade = 'C';
		
		if (m1 >= 35 && m2 >= 35 && m3 >= 35)
			this.result = "Pass";
		else
			this.result = "Fail";
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	
}
