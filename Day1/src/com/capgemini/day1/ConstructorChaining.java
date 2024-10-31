package com.capgemini.day1;

public class ConstructorChaining {
	
		ConstructorChaining(){
			System.out.println("hello world");
		}
		
		ConstructorChaining(int j){
			this();
		}
	

}
