package com.mak;

import java.util.Scanner;

public class Products {

	public static void main(String[] args) {
		int prod[] = new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5  Product Price: ");
		for(int i=0;i<5;i++) {
			try {
				prod[i]=sc.nextInt();
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		sc.close();
		int max=prod[0];
		for(int i=1;i<5;i++) {
			if(prod[i]>max)
				max=prod[i];
		}
		System.out.println("Highest Price is: "+max);
	}

}
