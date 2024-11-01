package com.capgemini.day19;

public class FactorialSample {
	public int fact(int x) {
		int fact = 1;
		if(x<0) {
			return 0;
		}
		for(int i = 1;i<= x;i++) {
			fact = fact*i;
		}
		return fact;
	}

}
