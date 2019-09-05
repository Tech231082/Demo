package demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class junitTest3 {
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
		System.out.println("Running Junit test second");

	}

	


	

}
