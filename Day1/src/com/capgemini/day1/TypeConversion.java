package com.capgemini.day1;

public class TypeConversion {
	public static void main(String[] args) {
		short s = 2;
		long l = 5;

		//widening
		int p = s;

		//error
		// Unresolved compilation problem
		//short s = d;  

		//narrowing
		short s1 = (short)l;
		
		System.out.println("s ="+s);
		System.out.println("s1 ="+s1);



	}

}
