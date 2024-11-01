package com.capgemini.day19;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class CharacterTest {
	@Test
	void stringTest1(){
		Library l = new Library();
		String actual = l.myStr("hii");
		String expected="hii";
		assertEquals(expected, actual);
		}
	
	@Test
	void stringTest2(){
		Library l = new Library();
		String actual = l.myStr(null);
		String expected="hii";
		assertEquals(expected, actual);
	}	
	
	@Test
	void stringLenTest1(){
		Library l = new Library();
		int actual = l.myStrlen("ash");
		int expected=3;
		assertEquals(expected, actual);
	}	


}
