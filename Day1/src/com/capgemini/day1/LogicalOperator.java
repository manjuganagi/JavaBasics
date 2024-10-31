package com.capgemini.day1;

public class LogicalOperator {
	public static void main(String[] args) {
		int p = 150;
		int q = 0;
		if(q>0 & p>30) {
			System.out.println("false");
		}
		else if(q>0 | p>30) {
			System.out.println("true");
		}
		else {
			System.out.println("invalid");
		}
		
	}

}
