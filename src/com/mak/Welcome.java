package com.mak;

import java.util.Scanner;

public class Welcome {
	public static void main(String[] args) {
		int a[] = new int[5];
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 subject marks: ");
		for(int i=0;i<5;i++) {
			try {
				a[i]=sc.nextInt();
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		for(int i=0;i<5;i++)
			sum+=a[i];
		double avg=(double)sum/5;
		System.out.println("Sum: "+sum+"\n Avg: "+avg+"%");
	}
}
