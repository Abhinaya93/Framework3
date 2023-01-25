package com.Test;

import org.testng.annotations.Test;

import com.Pages.AnotherLoginPage;
import com.genericUtils.DriverUtils;

public class LoginTest extends BaseTest {
		@Test
		public void Login() throws InterruptedException
		{
		/*DriverUtils.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		LoginPage lp=new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.clickLogin();
		Admin pt=new Admin();
		pt.clickAdmin();
		pt.clickAdd();*/
		
		
		
		DriverUtils.getDriver().get("https://demowebshop.tricentis.com/login");
		AnotherLoginPage lp1 = new AnotherLoginPage();
		lp1.enterEmail("muvvalaabhinaya@gmail.com");
		lp1.enterPassword("Abhikanna@93");
		lp1.clickLogin();





		}
	}

	





