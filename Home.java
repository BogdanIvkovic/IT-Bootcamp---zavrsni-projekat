package objects;

import java.awt.AWTException;



import java.awt.Robot;

import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import javax.imageio.ImageIO;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ru.yandex.qatools.ashot.Screenshot;

import org.openqa.selenium.Dimension;

//import java.awt.Dimension;

import org.apache.commons.io.FileUtils;

public class Home {

	public static final String URL = "https://www.humanity.com/";
	public static final String USERNAME = "/html/body/div[1]/header/div[2]/div/div/div/div/form/div/div[1]/input";
	public static final String PASSWORD = "/html/body/div[1]/header/div[2]/div/div/div/div/form/div/div[2]/input";
	public static final String BUTTON = "//*[@id=\"free-trial-link-01\"]";
	public static final String USERNAME1 = "/html/body/div[5]/div/div/div/div/div/div[2]/form/div[1]/input";
	public static final String PASSWORD1 = "/html/body/div[5]/div/div/div/div/div/div[2]/form/div[2]/input";
	public static final String SEARCH_BUTTON1 = "/html/body/div[1]/header/div[1]/div/div/div/nav/div[2]/div/a[3]";
	public static final String BUTTON1 = "/html/body/div[5]/div/div/div/div/div/div[2]/form/input";
	public static final String COMERICAL_APPLE = "/html/body/div[4]/div/div/div[1]/button/span";
	public static final String MENU_RIGHT = "/html/body/div[6]";
	public static String text = "ABOUT US";
	public static String file = " Employee.xlxs";
	private static Object finaly;
	public static final String LOGIN_BUTTON = "/html/body/div[1]/header/div[1]/div/div/div/nav/div[2]/div/a[2]/p";
	public static final String EMAIL_LOGIN = "/html/body/div[1]/div[2]/div/form[1]/div[1]/div[2]/div/input";
	public static final String PASSWORD_LOGIN = "/html/body/div[1]/div[2]/div/form[1]/div[1]/div[3]/div/input";
	public static final String BUTTON_LOGIN = "/html/body/div[1]/div[2]/div/form[1]/div[3]/div/button[1]";
  
	public static void goTo(WebDriver driver) {
		driver.navigate().to(URL);

	}
	
	public static void comercial(WebDriver driver) {
		goTo(driver);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div[2]/div[2]/div[2]/button")).click();
		
		}
	

	public static void firstLogIn(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		goTo(driver);

		WebElement we = driver.findElement(By.xpath(USERNAME));
		we.click();
		we.sendKeys("Yugica Titi");

		WebElement wp = driver.findElement(By.xpath(PASSWORD));
		wp.click();
		wp.sendKeys("YuTi@gmail.com");
		driver.findElement(By.xpath(BUTTON)).click();

	}

	public static void pressButton(WebDriver driver) {
		driver.findElement(By.xpath(BUTTON)).click();
		
		

	}
	public static void pressButton1(WebDriver driver) {
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/div[9]/div[5]/div[2]/div[2]/div/table/tbody/tr/td/div[2]/table/tbody/tr[9]/td[2]/button")).click();

	}

	public static void secondLogIn(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		goTo(driver);
		driver.findElement(By.xpath(SEARCH_BUTTON1)).click();
		WebElement we = driver.findElement(By.linkText("Full Name"));
		we.click();
		we.sendKeys("Yuga Tito");

		WebElement wp = driver.findElement(By.linkText("Work Email"));
		wp.click();
		wp.sendKeys("YugaTito@gmail.com");

		driver.findElement(By.linkText("START MY FREE TRIAL")).click();

	}

	public static void existingUser(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		goTo(driver);
		driver.findElement(By.xpath(LOGIN_BUTTON)).click();
		WebElement we = driver.findElement(By.xpath(EMAIL_LOGIN));
		we.click();
		we.sendKeys("zacetiriosobe@gmail.com");

		WebElement wp = driver.findElement(By.xpath(PASSWORD_LOGIN));
		wp.click();
		wp.sendKeys("udrimile");

		driver.findElement(By.xpath(BUTTON_LOGIN)).click();
	}
		public static void aboutus(WebDriver driver){
			driver.navigate().to(URL);
			driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/div/div/nav/div[2]/ul/li[6]/a")).click();
			driver.navigate().to("https://www.humanity.com/about");
			shooting(driver, "slika.");
		
		}
	public static String citajPodatak(String file, int r, int c) {
		File d = new File(file);
		InputStream inp = null;
		try {
			inp = new FileInputStream(d);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		XSSFWorkbook wb = null;
		try {
			wb = new XSSFWorkbook(inp);
		} catch (IOException e) {

			e.printStackTrace();
		}
		Sheet sheet1 = wb.getSheetAt(0);
		Row row = sheet1.getRow(r);
		Cell cell = row.getCell(c);
		String credentials = cell.getStringCellValue();

		return credentials.toString();
	}

	public static void menueRight(WebDriver driver) {
		WebElement we = driver.findElement(By.xpath(MENU_RIGHT));
		we.click();
	}




	public static void shooting(WebDriver driver, String name) {
		 
		
		Screenshot scr = ((Screenshot)driver);
		File file = ((TakesScreenshot) scr).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("./bole/.jpg"));
		}
		
		catch (IOException e){e.printStackTrace();
		
		}
		
	}

	
		
		
	}
	
	

		
	



		
	
		
	
	
	
