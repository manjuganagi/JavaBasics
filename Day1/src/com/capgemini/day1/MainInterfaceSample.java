package com.capgemini.day1;

public class MainInterfaceSample implements InterfaceSample {

	@Override
	public void b1() {
		System.out.println("b1 method....");
	}
	public static void main(String[] args) {
		MainInterfaceSample b = new MainInterfaceSample();
		b.b1();
	}

}
