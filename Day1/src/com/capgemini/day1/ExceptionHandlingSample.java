package com.capgemini.day1;

public class ExceptionHandlingSample {
	public static void main(String[] args) {
		try{  
			int j=10/0;  
		}catch(ArithmeticException e){
			System.out.println("cannot divide by zero");
		}  

	}

}
