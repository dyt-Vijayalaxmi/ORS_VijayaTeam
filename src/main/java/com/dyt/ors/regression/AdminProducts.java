package com.dyt.ors.regression;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.dyt.generic.BaseClass;
import com.dyt.ors.Screenpages.Home;
import com.dyt.ors.Screenpages.Login;


public class AdminProducts extends BaseClass {

	@Test
	public static void TC001_addMainCategory()
	{		
		Login login = PageFactory.initElements(driver, Login.class);
		Home home = PageFactory.initElements(driver, Home.class);
		//Step 1: Login as an admin
		Home.navLoginpage();
		login.loginApp("admin","admin@123");
		
		//Step 2: Navigate to Main Category page		
		
		
		// Step n : Logout		
	}
	//=============================================
	@Test
	public static void TC002_addSubCategory()
	{		
		Login login = PageFactory.initElements(driver, Login.class);
		Home home = PageFactory.initElements(driver, Home.class);
		//Step 1: Login as an admin
		Home.navLoginpage();
		login.loginApp("admin","admin@123");
		
		
		
		
	}
	//=============================================
	
	
}
