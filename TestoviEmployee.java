package testovi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.Elementi;
import objects.Home;

public class TestoviEmployee {
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
	
	@Test(priority = 2)
	public void testComercial(){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Home.comercial(driver);
		String actual = driver.getCurrentUrl();
		String expected ="https://www.humanity.com/";
		Assert.assertEquals(actual, expected);
		
	}
	
	@Test (priority = 4)
	public void testExistingUser() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Home.existingUser(driver);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		String actual = driver.getCurrentUrl();
		String expected = "https://lukvoda2.humanity.com/app/dashboard/";
		Assert.assertEquals(actual, expected);
}
	
	@Test(priority=5)
	public void testDodatiZaposlenog() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Elementi.dodatiZaposlenog(driver);
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
			//Home.shooting(driver, "prilika.");
		}
	}
	@Test(priority = 6)
	public void  testPromenaImena() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Elementi.promenaImena(driver);
		driver.navigate().to("https://lukvoda2.humanity.com/app/staff/assignstaff&new=1&first=6087528/");
		String actual = driver.getCurrentUrl();
		String expected = "https://lukvoda2.humanity.com/app/staff/assignstaff&new=1&first=6087528/";
		Assert.assertEquals(actual, expected);
	
	}
	
//	@Test( priority = 7)
//	public static void testPostaviSliku() {
//		Elementi.postaviSliku(driver);
	

	
	@Test(priority = 7)
	public void testAddEmployee() {
	Elementi.newUserFromApache(driver,"Employee.xlsx");
	
	boolean actual = Elementi.ap(driver);
	boolean expected = true;
	Assert.assertEquals(actual, expected);
		
	}
	
	@Test (priority = 8)
	public void testSetPicture() {
	Elementi.setPicture(driver);
	
	boolean actual = Elementi.porediSlike(driver);
	boolean expected = true;
	Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 13)
	public void testChangeLanAndUncheck() {
	Elementi.changeLan(driver);
	
	boolean actual = Elementi.languageChanged(driver);
	boolean expected = true;
	Assert.assertEquals(actual, expected);
	
	}
	
	@Test(priority = 14)
	public void testProfileAjust() {
	Elementi.profileAjust(driver);
	
	boolean actual = Elementi.isThereaChange(driver,"Bonjo","https://lukvoda2.humanity.com/app/staff/edit/6087421/");
	boolean expected = true;
	boolean actual1 = Elementi.isThereaChange(driver,"kriminalac","https://lukvoda2.humanity.com/app/staff/edit/6087421/");
	boolean expected1 = true;
	Assert.assertEquals(actual, expected);
	Assert.assertEquals(actual1, expected1);
	}
	
	
	
}
	
	
	
	
	
	



	


