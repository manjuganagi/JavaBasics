package com.capgemini.day19;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
@DisplayName("testing mathematical operations")
public class MathOperationsTest {
	@Test
	void addTest() {
		MathOperations mo = new MathOperations();
		int actual = mo.add(20, 10);
		int expected = 30;
		assertEquals(expected, actual);
	}

	@Test
	void addNegTest() {
		MathOperations mo = new MathOperations();
		int actual = mo.add(-20,- 10);
		int expected =- 30;
		assertEquals(expected, actual);
	}

	@Test
	void subTest() {
		MathOperations mo = new MathOperations();
		int actual = mo.sub(20, 10);
		int expected = 10;
		assertEquals(expected, actual);
	}

	@Test
	void mulTest() {
		MathOperations mo = new MathOperations();
		int actual = mo.mul(20, 10);
		int expected = 200;
		assertEquals(expected, actual);
	}

	@Test
	void mulNegTest() {
		MathOperations mo = new MathOperations();
		int actual = mo.mul(20, -10);
		int expected =- 200;
		assertEquals(expected, actual);
	}

	@Test
	void divTest() {
		MathOperations mo = new MathOperations();
		int actual = mo.div(20, 5);
		int expected = 4;
		assertEquals(expected, actual);
	}
}
