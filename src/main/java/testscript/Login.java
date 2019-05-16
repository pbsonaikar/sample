package testscript;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import locators.Loginpage;
import utility.Suitebase;

public class Login extends Suitebase {
	
	
	@Test
	public void login(){
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
	    Loginpage page = PageFactory.initElements(driver, Loginpage.class);
		page.useracclink.click();
		page.signIn.click();
		
	}

}
