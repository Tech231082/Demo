package demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class junitTest4 {
@BeforeAll
	
	public static void beforeClassTest(){
	
	System.out.println("Executed before class method");
	
	
	}

	@Test
	void test() {
		System.out.println("Running Junit test");

	}
	@Test
	void test1() {
		System.out.println("Running second Junit test");

	}
	@AfterAll
	public static void afterClassTest() {
		System.out.println("Executed after all method");
	}

}
