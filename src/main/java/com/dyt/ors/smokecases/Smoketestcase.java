package com.dyt.ors.smokecases;

public class Smoketestcase {


@Test
public static void TC001_addMainCategory()
{		
	String[] data = ExcelLib.getRowData("TC001_addMainCategory", "Smoke");	
	Login login = PageFactory.initElements(driver, Login.class);
	Home home = PageFactory.initElements(driver, Home.class);
	AddMainCategory addMainCategory= PageFactory.initElements(driver, AddMainCategory.class);
	
	home.navLoginpage();;
	login.loginApp(data[0],data[1]);
	addMainCategory.navAddmainCategory();
	addMainCategory.addMainCategory(data[2], data[3],data[4]);
			
}

@Test
public static void TC002_addSubCategory()
{		
	String[] data = ExcelLib.getRowData("TC001_addMainCategory", "Smoke");	
	Login login = PageFactory.initElements(driver, Login.class);
	Home home = PageFactory.initElements(driver, Home.class);
	AddMainCategory addMainCategory= PageFactory.initElements(driver, AddMainCategory.class);
	
	home.navLoginpage();;
	login.loginApp(data[0],data[1]);
	addMainCategory.navAddmainCategory();
	addMainCategory.addMainCategory(data[2], data[3],data[4]);
			
}
}