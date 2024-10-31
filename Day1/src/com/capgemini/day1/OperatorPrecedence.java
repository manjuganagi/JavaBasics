package com.capgemini.day1;

public class OperatorPrecedence {
	public static void main(String[] args) {
		int a=50;
		int b=2;
		int c=100;
		int d=10;
		
		int result = a+b*c/d;
		int result1 = (c-b)*a/b;
		
		System.out.println("result = "+result);
		System.out.println("result1 = "+result1);
		
	}


}
