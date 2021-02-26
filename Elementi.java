package objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Elementi {
	
	public static final String URL2 = "https://babaipile.humanity.com/app/dashboard/";
	public static final String XDASHBOARD = "/html/body/table/tbody/tr/td/div[7]/div/div[2]/ul/li[1]/a/span";
	public static final String XSHIFTPLANNING = "/html/body/table/tbody/tr/td/div[7]/div/div[2]/ul/li[2]/a/span";
	public static final String XTIMECLOCK = "/html/body/table/tbody/tr/td/div[7]/div/div[2]/ul/li[3]/a/span/i";
	public static final String XLEAVE = "/html/body/table/tbody/tr/td/div[7]/div/div[2]/ul/li[4]/a/span/i";
	public static final String XTRAINING = "/html/body/table/tbody/tr/td/div[7]/div/div[2]/ul/li[5]/a/span/i";
	public static final String XSTAFF = "/html/body/table/tbody/tr/td/div[7]/div/div[2]/ul/li[6]/a/span";
	public static final String XAVAILABILITY = "/html/body/table/tbody/tr/td/div[7]/div/div[2]/ul/li[7]/a/span";
	public static final String XPAYROLL = "/html/body/table/tbody/tr/td/div[7]/div/div[2]/ul/li[8]/a/span";
	public static final String XREPORTS = "/html/body/table/tbody/tr/td/div[7]/div/div[2]/ul/li[9]/a/span/p";
	private static final String FILE = null;
	private static final String STAFF = "https://lukvoda2.humanity.com/app/staff/list/position/true/";
	private static final String BTN_UPLOAD = "/html/body/table/tbody/tr/td/div[9]/div[5]/div[2]/div[2]/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td[2]/span[1]/input";
	private static final String SAVE_BTN = "/html/body/table/tbody/tr/td/div[9]/div[5]/div[2]/div[2]/div[2]/table/tbody/tr/td[2]/form/table/tbody/tr[39]/td/input";
	
	public static void dashboard(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement we = driver.findElement(By.xpath(XDASHBOARD));
		we.click();
	}
	public static void shiftPlanning(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement we = driver.findElement(By.xpath(XSHIFTPLANNING));
		we.click();
	}
	
	public static void timeClock(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement we = driver.findElement(By.xpath(XTIMECLOCK));
		we.click();
	}
	
	public static void leave(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement we = driver.findElement(By.xpath(XLEAVE));
		we.click();
	}
	public static void training(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement we = driver.findElement(By.xpath(XTRAINING));
		we.click();
	}
	public static void staff(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement we = driver.findElement(By.xpath(XSTAFF));
		we.click();
	}
	public static void availability(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement we = driver.findElement(By.xpath(XAVAILABILITY));
		we.click();
	}
	public static void payRoll(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement we = driver.findElement(By.xpath(XPAYROLL));
		we.click();
	}
	public static void reports(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement we = driver.findElement(By.xpath(XREPORTS));
		we.click();
	}
	public static void dodatiZaposlenog(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://lukvoda2.humanity.com/app/staff/list/position/true/");
		
		Home.shooting(driver, "foto.");
		try {
			Thread.sleep(4000);
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/div[5]/button[3]")).click();
		
		WebElement we1 =driver.findElement(By.xpath("/html/body/table/tbody/tr/td/div[9]/div[5]/div[2]/div[2]/div/table/tbody/tr/td/div[2]/table/tbody/tr[2]/td[2]/input"));
		we1.click();
		we1.sendKeys("Pera");
		WebElement we2 =driver.findElement(By.xpath("/html/body/table/tbody/tr/td/div[9]/div[5]/div[2]/div[2]/div/table/tbody/tr/td/div[2]/table/tbody/tr[2]/td[3]/input"));
		we2.click();
		we2.sendKeys("Mitic");
		WebElement we3 =driver.findElement(By.xpath("/html/body/table/tbody/tr/td/div[9]/div[5]/div[2]/div[2]/div/table/tbody/tr/td/div[2]/table/tbody/tr[2]/td[4]/input"));
		we3.click();
		we3.sendKeys("davitelj@protiv.davitelja");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/div[9]/div[5]/div[2]/div[2]/div/table/tbody/tr/td/div[2]/table/tbody/tr[9]/td[2]/button")).click();
		driver.navigate().to("https://lukvoda2.humanity.com/app/staff/list/load/true/");
		Home.shooting(driver, "foto1.");
	
	}
		public static void promenaImena(WebDriver driver) {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.navigate().to("https://lukvoda2.humanity.com/app/staff/list/load/true/");
			WebElement we = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/div[9]/div[5]/div[2]/div[2]/div[2]/div/div[2]/div[2]/div[2]/a"));
			we.click();
			driver.navigate().to("https://lukvoda2.humanity.com/app/staff/detail/6087528/");
			driver.findElement(By.xpath("/html/body/table/tbody/tr/td/div[9]/div[5]/div[2]/div[2]/div[1]/a[2]")).click();
			WebElement we1 =driver.findElement(By.xpath("//*[@id=\"first_name\"]"));
			we1.click();
			we1.clear();
			we1.sendKeys("Zoki");
			driver.findElement(By.xpath("/html/body/table/tbody/tr/td/div[9]/div[5]/div[2]/div[2]/div[2]/table/tbody/tr/td[2]/form/table/tbody/tr[39]/td/input")).click();
}
		
		public static void newUserFromApache(WebDriver driver, String file) {
			driver.navigate().to("https://lukvoda2.humanity.com/app/staff/list/load/true/");
			driver.findElement(By.xpath("/html/body/table/tbody/tr/td/div[5]/button[3]")).click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			for(int i = 1; i<6 ;i++) {
				WebElement wn = driver.findElement(By.id("_asf"+i));
				wn.sendKeys(Home.citajPodatak(file, i , 0));
				WebElement wl = driver.findElement(By.id("_asl"+i));
				wl.sendKeys(Home.citajPodatak(file, i , 1));
				WebElement we = driver.findElement(By.id("_ase" +i));
				we.sendKeys(Home.citajPodatak(file, i , 2));
			}
			Home.pressButton1(driver);
		}
			
			public static boolean ap(WebDriver driver) {
				driver.navigate().to("https://lukvoda2.humanity.com/app/staff/list/load/true/");
				boolean isto = true;
				for(int i = 1;i<6; i++) {
					String ime = Home.citajPodatak("Employee.xlsx", i, 3).toString();
					String name = driver.findElement(By.linkText(ime)).toString();
					if(ime == name) {
						isto = true;
					}else {
						isto = false;
					}
				}
				return isto;
			
			}
			
			public static void setPicture(WebDriver driver) {
				driver.navigate().to("https://lukvoda2.humanity.com/app/staff/detail/6087528/");
				driver.findElement(By.xpath("/html/body/table/tbody/tr/td/div[9]/div[5]/div[2]/div[2]/div[1]/a[2]")).click();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.findElement(By.xpath(BTN_UPLOAD)).sendKeys("C:\\Users\\HP\\eclipse-workspace\\theLastDance\\slika.jpg");
				driver.findElement(By.xpath(SAVE_BTN)).click();
}
			public static boolean porediSlike(WebDriver driver) {
				driver.navigate().to("https://lukvoda2.humanity.com/app/staff/edit/6087528/");
				WebElement slika = driver.findElement(By.tagName("img"));
				driver.navigate().to("https://lukvoda2.humanity.com/app/staff/detail/6089685/");
				WebElement pct  = driver.findElement(By.tagName("img"));
				boolean postoji = true;
				if(slika != pct) {
					postoji = true;
				}else {
					postoji = false;
				}
				return postoji;	
			}	
			
			public static boolean languageChanged(WebDriver driver) {
				driver.navigate().to("https://lukvoda2.humanity.com/app/admin/settings/");
				WebElement we = driver.findElement(By.linkText("Availability"));
				boolean izmenjen = true;
				if(we == null) {
					izmenjen = true;
				}else {
					izmenjen = false;
				}
				return izmenjen;
			}
			
			public static void changeLan(WebDriver driver) {
				driver.navigate().to("https://lukvoda2.humanity.com/app/admin/settings/");
				
				//JavascriptExecutor js = (JavascriptExecutor) driver;
				//js.executeScript("window.scrollBy(0,100)");
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.findElement(By.xpath("//*[@id=\"pref_pref_email\"]")).click();
				driver.findElement(By.xpath("//*[@id=\"pref_pref_sms\"]")).click();
				driver.findElement(By.xpath("//*[@id=\"pref_pref_mobile_push\"]")).click();
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				driver.findElement(By.xpath("[@id=\"adminSettingsForm\"]/div[1]/table/tbody/tr[3]/td[2]/select")).click();
				driver.findElement(By.xpath("[@id=\"adminSettingsForm\"]/div[1]/table/tbody/tr[3]/td[2]/select/option[5]")).click();
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				driver.findElement(By.id("_save_settings_button")).click();
				driver.findElement(By.xpath("[@id=\"adminSettingsForm\"]/div[1]/table/tbody/tr[3]/td[1]/label/a")).click();
				}

			
			public static void profileAjust(WebDriver driver) {
				driver.navigate().to("https://lukvoda2.humanity.com/app/staff/list/load/true/");
				
				//driver.navigate().to().;
				driver.findElement(By.xpath("\"/html/body/table/tbody/tr/td/div[9]/div[5]/div[2]/div[2]/div[1]/a[2]\"")).click();
				
				WebElement we = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/div[9]/div[5]/div[2]/div[2]/div[2]/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[2]/input"));
				we.click();
				we.clear();
				we.sendKeys("Bonja");
				
				WebElement we1 = driver.findElement(By.xpath("//*[@id=\"job_title\"]"));
				we1.click();
				we1.clear();
				we1.sendKeys("kriminalac");
				
				driver.findElement(By.xpath("//*[@id=\"NewEmployeeForm\"]/table/tbody/tr[39]/td/input")).click();
				
				
			}
			
			public static boolean isThereaChange(WebDriver driver,String name, String url) {
				driver.navigate().to(url);
				WebElement we = driver.findElement(By.linkText(name));
				boolean postoji = true;
				if(we != null) {
					postoji = true;
				}else {
					postoji = false;
				}
				return postoji;	
			}
			public static boolean compareImg(WebDriver driver) {
				driver.navigate().to("https://lukvoda2.humanity.com/app/staff/detail/6087528/");
				WebElement slika = driver.findElement(By.tagName("img"));
				driver.navigate().to("https://lukvoda2.humanity.com/app/staff/detail/6087421/");
				WebElement pct  = driver.findElement(By.tagName("img"));
				boolean postoji = true;
				if(slika != pct) {
					postoji = true;
				}else {
					postoji = false;
				}
				
				
				return postoji;	
			}
			
}
			
			
		
	
			
			
		

