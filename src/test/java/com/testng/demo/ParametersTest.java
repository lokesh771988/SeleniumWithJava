package com.testng.demo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {

	@Parameters({ "first-name" })
	@Test
	public void testSingleString(String firstName) {
	  System.out.println("Invoked testString " + firstName);
	  assert "Cedric".equals(firstName);
	}
	
	@Parameters({ "brower" })
	@Test
	public void test(@Optional("chrome")String brower) {
	  
		if(brower.equalsIgnoreCase("chrome")){
			System.out.println("Chrome brower");
		}else if(brower.equalsIgnoreCase("firefox")) {
			System.out.println("Firefox");
		}else {
			System.out.println("IE");
		}
	}

}
