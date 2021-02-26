package testovi;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.Home;

public class HomePTest {
	
	public static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
		//WebDriverWait wait = new WebDriverWait(driver,5);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\driver\\ChromeDriver.exe");
		driver = new ChromeDriver();
}
	@Test(priority = 1)
	public void testHomepageGo() {
		Home.goTo(driver);
		
		String actual = driver.getCurrentUrl();
		String expected ="https://www.humanity.com/";
		
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority =2)
	public void testComercial(){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Home.comercial(driver);
		String actual = driver.getCurrentUrl();
		String expected ="https://www.humanity.com/";
		Assert.assertEquals(actual, expected);
		
	}
	
	@Test (priority = 2 )
	public void testAboutUs(WebDriver driver) {
	Home.goTo(driver);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	Home.aboutus(driver);
	String actual = driver.getCurrentUrl();
	String expected ="https://www.humanity.com/about";
	
	Assert.assertEquals(actual, expected);
	}
	
	
	@Test (priority = 3)
	public void testLoginFirst() {
		driver.manage().timeouts().implicitlyWait(13,TimeUnit.SECONDS);
		Home.firstLogIn(driver);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String actual = driver.getCurrentUrl();
		String expected = "https://www.humanity.com/";
		Assert.assertEquals(actual, expected);
}
	
	@Test (priority = 4)
	public void testSecondLogIn() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Home.secondLogIn(driver);
		String actual = driver.getCurrentUrl();
		String expected = "https://www.humanity.com/wizard-setup2/";
		Assert.assertEquals(actual, expected);	
		
	}

	@Test (priority = 4)
	public void testExistingUser() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Home.existingUser(driver);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String actual = driver.getCurrentUrl();
		String expected = "https://lukvoda2.humanity.com/app/dashboard/";
		Assert.assertEquals(actual, expected);
}
	
}
