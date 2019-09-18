package TestNg.demo.wpeverest.com;

import org.testng.annotations.BeforeTest;

public class DataProvider {
	
	@org.testng.annotations.DataProvider(name = "data-provider")
	public Object[][] dp() {
	   
	     Object[][] data =  new Object[1][2];
	     
	     data[0][0] = "neyhasingh0809@gmail.com";
	     data[0][1] = "Gravity@0809";
	     
	     return data;
	    
	  }

	
}
