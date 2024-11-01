package com.capgemini.day19;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class FactorialSampleTest {
	@Test
	void factNegTest() {
		FactorialSample fs = new FactorialSample();
		assertEquals(0, fs.fact(-5));
	}

	@Test
	void factTest() {
		FactorialSample fs = new FactorialSample();
		assertEquals(120, fs.fact(5));
	}
	@Test
	void factZeroTest() {
		FactorialSample fs = new FactorialSample();
		assertEquals(1, fs.fact(0));
	}
}
