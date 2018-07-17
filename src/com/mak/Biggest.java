package com.mak;

import java.util.Scanner;

public class Biggest {
	public static void main(String[] args) {
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 NUmbers: ");
		num1=sc.nextInt();
		num2=sc.nextInt();
		sc.close();
		if(num1==0 && num2==0)
			System.out.println("At least one number should be Non Zero");
		else if(num1==num2)
			System.out.println("Numbers are Equal");
		else if(num1>num2)
			System.out.println("Number1("+num1+") is Bigger");
		else
			System.out.println("Number2("+num2+") is Bigger");
	}
}
