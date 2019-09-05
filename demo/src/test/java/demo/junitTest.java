package demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class junitTest {

	@Test
	void test() {
		System.out.println("Running Junit test");
		
		Assert.assertEquals(1,1);
		Assert.assertEquals("ABC","ABC"); 
		Assert.assertEquals("Strings are not equal", "ABC","DEF"); 

	}

}
