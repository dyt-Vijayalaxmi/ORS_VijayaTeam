package com.dyt.ors.Config;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;

public class Config {
	
		public static WebDriver driver = null;
		public static final String URL = "http://13.233.50.231:8080/ORS_SIT/";
		public static String Browser = "chrome";
		public static String CurrentTestCaseName = "";
		public static String TestDataPath = "C:\\Users\\DELL\\Desktop\\BHANU Work space\\ORS_VijayaTeam-master\\ORS_VijayaTeam\\TestData\\OrbitScience.xlsx";
		public static String ResultsPath = System.getProperty("user.dir")+"//Results//";
	//	public static String SmokeSheetName = "Smoke";
	}


