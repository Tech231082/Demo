package demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class junitTest2 {
@BeforeEach
	
	void beforeTest(){
	
	System.out.println("Running before test");
	
	}

	@Test
	void test() {
		System.out.println("Running Junit test");
	}
	@Test
	void test1() {
		System.out.println("Running Junit test1");
	}
	

}
