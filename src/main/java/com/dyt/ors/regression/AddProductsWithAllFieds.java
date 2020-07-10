package com.dyt.ors.regression;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.dyt.generic.BaseClass;
import com.dyt.ors.Screenpages.AddProducts;
import com.dyt.ors.Screenpages.Home;
import com.dyt.ors.Screenpages.Login;

public class AddProductsWithAllFieds extends BaseClass{

	/*	@Test
		public static void TC013_addProducts()
		{		
			Login login = PageFactory.initElements(driver, Login.class);
			Home home = PageFactory.initElements(driver, Home.class);
			//Step 1: Login as an admin
			Home.navLoginpage();
			login.loginApp("admin","admin@123");
			AddProducts addproduct= PageFactory.initElements(driver, AddProducts.class);
			addproduct.navAddProducts();
			addproduct.addProducts("SINAREST", "PARACIP", "201", "For Cold", "C", "For Cold", "706", "CIPLA", "6/6",
			"20", "224150", "150", "B", "C:\\Users\\DELL\\Downloads\\Img.jpg", 
					"C:\\Users\\DELL\\Downloads\\SDS.jpg", "C:\\Users\\DELL\\Downloads\\PSS.jpg");			
		}
		*/
	     @Test
		public static void TC014_addProductswithoutMaindatoryFields()
		{		
			Login login = PageFactory.initElements(driver, Login.class);
			Home home = PageFactory.initElements(driver, Home.class);
			//Step 1: Login as an admin
			Home.navLoginpage();
			login.loginApp("admin","admin@123");
			AddProducts addproduct= PageFactory.initElements(driver, AddProducts.class);
			addproduct.navAddProducts();
			addproduct.addProductswithoutMaindarory("c", "Fever", "301", "4/4", "50", "706", "S", "C:\\Users\\DELL\\Downloads\\Img.jpg", "C:\\Users\\DELL\\Downloads\\SDS.jpg", "C:\\Users\\DELL\\Downloads\\PSS.jpg");
				
		}
		/*
		public static void TC015_addProductWithoutSubCategory()
		{		
			Login login = PageFactory.initElements(driver, Login.class);
			Home home = PageFactory.initElements(driver, Home.class);
			//Step 1: Login as an admin
			Home.navLoginpage();
			login.loginApp("admin","admin@123");
			AddProducts addproduct= PageFactory.initElements(driver, AddProducts.class);
			addproduct.navAddProducts();
			addproduct.addProductwithoutSubCategory("SINAREST","201", "For Cold", "C", "For Cold", "706", "CIPLA", "6/6",
			"20", "224150", "150", "B", "C:\\Users\\DELL\\Downloads\\Img.jpg", 
					"C:\\Users\\DELL\\Downloads\\SDS.jpg", "C:\\Users\\DELL\\Downloads\\PSS.jpg");	
		}
		
		public static void TC016_addProductwithDuplicateProduct()
		{		
			Login login = PageFactory.initElements(driver, Login.class);
			Home home = PageFactory.initElements(driver, Home.class);
			//Step 1: Login as an admin
			Home.navLoginpage();
			login.loginApp("admin","admin@123");
			AddProducts addproduct= PageFactory.initElements(driver, AddProducts.class);
			addproduct.navAddProducts();
			addproduct.addProducts("SINAREST", "PARACIP", "201", "For Cold", "C", "For Cold", "706", "CIPLA", "6/6",
			"20", "224150", "150", "B", "C:\\Users\\DELL\\Downloads\\Img.jpg", 
					"C:\\Users\\DELL\\Downloads\\SDS.jpg", "C:\\Users\\DELL\\Downloads\\PSS.jpg");			
		} 
	@Test
		public static void TC017_EditProducts()
		{		
			Login login = PageFactory.initElements(driver, Login.class);
			Home home = PageFactory.initElements(driver, Home.class);
			//Step 1: Login as an admin
			Home.navLoginpage();
			login.loginApp("admin","admin@123");
			AddProducts addproduct= PageFactory.initElements(driver, AddProducts.class);
			addproduct.EditAddProducts();
			boolean BTag=true;
			for(int row=1;row<=10;row++)
			{
				String cellText=driver.findElement(By.xpath("//*[@id='dataTable']/tbody/tr["+row+"]/td[3]")).getText();
				
				////*[@id="dataTable"]/tbody/tr[3]/td[3]
				
				if((cellText.contains("dimethy")))
						
						{
					
					addproduct.EditProduct();
					addproduct.addProducts("SINAREST", "PARACIP", "201", "For Cold", "C", "For Cold", "706", "CIPLA", "6/6",
					"20", "224150", "150", "B", "C:\\Users\\DELL\\Downloads\\Img.jpg", 
							"C:\\Users\\DELL\\Downloads\\SDS.jpg", "C:\\Users\\DELL\\Downloads\\PSS.jpg");
					
				
				}
				BTag=false;
				break;
				
					
						}
		
		
			
			if(BTag=true)

			{
				System.out.println("Details Edited Succesfully");
			}
			else
			{
				System.out.println("Details Not Edited");
			
	       }
		}
	*/
	
	
	
}
			
		
