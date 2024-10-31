package com.capgemini.day1;

public class Loops {
	public static void main(String[] args) {
		int[] p = {1,2,3,4};
		char[] q = {'a','b','c','d'};
		
		//for loop
		for(int i=0;i<p.length;i++) {
			System.out.println(p[i]);
		}
		
		//for each
		for(int j:p) {
			System.out.println(j);
		}
		
		//while loop
		int k=10;
		while(k>9) {
			k++;
		}
		System.out.println("not greater than nine...");
	}
	
}
