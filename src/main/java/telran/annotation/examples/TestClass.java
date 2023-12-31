package telran.annotation.examples;

import telran.test.annotation.BeforeEach;
import telran.test.annotation.Test;

public class TestClass {
	private void f1(int b) { 
		System.out.println("test f1 passed " + b);
	}
	private void f1() {
		System.out.println("test f1 failed ");
	}
	@Test(nRuns = 2)
	void test1() {
		f1(10);
	}
	@Test
	void test10() {
		f1();
	}
	@BeforeEach
	void setUp() {
		System.out.println("set up");
	}
	
}
