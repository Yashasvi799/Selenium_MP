package com.abc.TS;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.abc.JS.Home;
import com.abc.JS.Login;
import com.abc.JS.Welcome;

public class TestScript1 {
	
	@Test
	public void validLogin() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.magento.com");
		Welcome w = new Welcome(driver);
		w.clickOnMyAccount();
		Login l = new Login(driver);
		l.typeEmail();
		l.typePwd();
		l.typeLogin();
		Home h = new Home(driver);
		h.clickOnLogout();
		driver.quit();
		
	}

}
