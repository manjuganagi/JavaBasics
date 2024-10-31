package com.capgemini.day1;

public class FibSeries {
	public static int fibS(int  N){
		int s =0 ;
		if (N <= 0)
		return 0;
		int fib [ ] = new int [2*N +1];
		fib [0]= 0;
		fib [1]= 1;
		for (int j =2 ; j<= N ; j++){
			fib [j] = fib[j-1]+ fib [j-2];
			
		if (j % 2 == 0)
			s += fib [j];
			
		}
		return s;
		
	}


	public static void main(String[] args) {
		
		int s = FibSeries.fibS(10);
		System.out.println("sum is " +s);
		
	}

}
