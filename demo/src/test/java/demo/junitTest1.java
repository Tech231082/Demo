package demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class junitTest1 {
	@BeforeEach
	
	void beforeTest(){
	
	System.out.println("Running before test");
	
	}


	@Test
	void test() {
		System.out.println("Running Junit test");

	}

}
