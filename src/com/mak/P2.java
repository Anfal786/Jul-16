package com.mak;

public class P2 {

	public static void main(String[] args) {
		double sal = 55555.55;
		double tax =sal*0.2;
		double bon = sal*.15;
		double util = sal*0.15;
		double lunch = sal*0.5;
		double net = sal-tax-util-lunch+bon;
		System.out.println(net);
	}

}
