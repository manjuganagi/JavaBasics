package com.capgemini.day1;

public class MainAbstractSample extends AbstractSample {
	public void b1() {
		System.out.println("mb1 method..");
	}
	public static void main(String[] args) {
		MainAbstractSample b = new MainAbstractSample();
		b.b1();
		b.b2();
		int n=5;
		for(int i=1 ; i<=5; i++ ){
			for (int j=1 ; j<=i ; j++){
				System.out.println("*");
			}
			System.out.println(" ");
		}
		
	}

}
