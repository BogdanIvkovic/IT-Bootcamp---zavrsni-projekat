package testovi;


	
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;
	import objects.Elementi;
	import objects.Home;
	public class TestoviElemenata {
		
	    public static final String KORISNIK_UNET = "https://babaipile.humanity.com/app/staff/assignstaff&new=1&first=6085580/";
		
		public static final String DASHBOARD = "https://babaipile.humanity.com/app/dashboard/";
		public static final String SHIFTPLANNING = "https://babaipile.humanity.com/app/schedule/employee/week/overview/overview/24%2c1%2c2021/";
		public static final String TIMECLOCK = "https://babaipile.humanity.com/app/timeclock/";
		public static final String LEAVE = "https://babaipile.humanity.com/app/requests/vacation/";
		public static final String TRAINING = "https://babaipile.humanity.com/app/training/";
		public static final String STAFF = "https://babaipile.humanity.com/app/staff/list/load/true/";
		public static final String AVAILABILITY = "https://babaipile.humanity.com/fe/availability/#/requests/week/2021-02-21/1";
		public static final String PAYROLL = "https://babaipile.humanity.com/app/payroll/scheduled-hours/";
		public static final String REPORTS = "https://babaipile.humanity.com/app/reports/dashboard/";
		public static WebDriver driver;
		@BeforeClass
		public void postaviDriver() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\driver\\ChromeDriver.exe");
			driver = new ChromeDriver();
		}
		
		@Test(priority = 1)
		public void testComercial(){
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Home.comercial(driver);
			String actual = driver.getCurrentUrl();
			String expected ="https://www.humanity.com/";
			Assert.assertEquals(actual, expected);
			
		}
		@Test(priority = 2)
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
		
		
		@Test(priority = 3)
		public void testReports() {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Elementi.reports(driver);
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String actual = driver.getCurrentUrl();
			String expected = REPORTS;
			Assert.assertEquals(actual, expected);
		}
		@Test(priority = 4)
		public void testPayRoll() {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Elementi.payRoll(driver);
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String actual = driver.getCurrentUrl();
			String expected = PAYROLL;
			Assert.assertEquals(actual, expected);
		}
		@Test(priority = 5)
		public void testStaff() {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Elementi.staff(driver);
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String actual = driver.getCurrentUrl();
			String expected = STAFF;
			Assert.assertEquals(actual, expected);
		}
		@Test(priority = 6)
		public void testTraining() {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Elementi.training(driver);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String actual = driver.getCurrentUrl();
			String expected = TRAINING;
			Assert.assertEquals(actual, expected);
		}
		@Test(priority = 7)
		public void testLeave() {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Elementi.leave(driver);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String actual = driver.getCurrentUrl();
			String expected = LEAVE;
			Assert.assertEquals(actual, expected);
		}
		@Test(priority = 8)
		public void testTimeClock() {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Elementi.timeClock(driver);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String actual = driver.getCurrentUrl();
			String expected = TIMECLOCK;
			Assert.assertEquals(actual, expected);
		}
		@Test(priority = 9)
		public void testShiftPlanning() {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Elementi.shiftPlanning(driver);
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String actual = driver.getCurrentUrl();
			String expected = SHIFTPLANNING;
			Assert.assertEquals(actual, expected);
		}
		@Test(priority = 10)
		public void testDashBoard() {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Elementi.dashboard(driver);
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String actual = driver.getCurrentUrl();
			String expected = DASHBOARD;
			Assert.assertEquals(actual, expected);
		}
		@Test(priority = 11)
		public void testAvailability() {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Elementi.availability(driver);
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String actual = driver.getCurrentUrl();
			String expected = AVAILABILITY;
			Assert.assertEquals(actual, expected);
		}
		
		
		@Test(priority=12)
		public void testDodatiZaposlenog() {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Elementi.dodatiZaposlenog(driver);
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
				
	
		
		}
			
			
			

}
	}
