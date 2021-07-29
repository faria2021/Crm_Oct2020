package tfTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//main= ctrl+spaces

    

public class LoginTest {
	
	static WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException {
		
		launchBBrowser();
		loginTest1();
		tearDown();
		
		launchBBrowser();
		loginTest2();
		tearDown();
		
		launchBBrowser();
		loginTest3();
		tearDown();
	
	}
	public static void launchBBrowser() {
		 
		 //set system property
			System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		 
			//create object of webdriver
			 driver = new ChromeDriver();
		 
		   //go to the website
			driver.get("https://techfios.com/billing/?ng=admin/");
		  
			//maximizing the window
			driver.manage().window().maximize();
		 
	 }
	
	
	
	
		
  public static void loginTest1() throws InterruptedException {
	
	 
	
	//identify user name box and pass user name
	driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
	
	//identify password box and type password
	driver.findElement(By.id("password")).sendKeys("abc123");
	
	//identify singin button and click
	driver.findElement(By.name("login")).click();
	
	//wait for 2 sec
	Thread.sleep(4000);
	
	
}
  public static void loginTest2() throws InterruptedException {
		
		 
		
		//identify user name box and pass user name
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		
		//identify password box and type password
		driver.findElement(By.id("password")).sendKeys("abc123");
		
		//identify singin button and click
		driver.findElement(By.name("login")).click();
		
		//wait for 2 sec
		Thread.sleep(4000);
		
		
	}
  public static void loginTest3() throws InterruptedException {
		
		 
		
		//identify user name box and pass user name
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		
		//identify password box and type password
		driver.findElement(By.id("password")).sendKeys("abc123");
		
		//identify singin button and click
		driver.findElement(By.name("login")).click();
		
		//wait for 2 sec
		Thread.sleep(4000);
		
		
	}
  public static void loginTest4() throws InterruptedException {
		
		 
		
		//identify user name box and pass user name
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		
		//identify password box and type password
		driver.findElement(By.id("password")).sendKeys("abc123");
		
		//identify singin button and click
		driver.findElement(By.name("login")).click();
		
		//wait for 2 sec
		Thread.sleep(4000);
		
		
	}
  
  
  
  public static void tearDown() {
	//close browser
		driver.close();
	  
  }
 
  
  
  
  
  
  
  
  
 
  
  
  
//  public static void invalidloginTest() throws InterruptedException{
//  //set system property
//	System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
// 
//	//create object of webdriver
//	WebDriver driver = new ChromeDriver();
// 
//   //go to the website
//	driver.get("https://techfios.com/billing/?ng=admin/");
//  
//	//maximizing the window
//	driver.manage().window().maximize();
//	
//	//identify user name box and pass user name
//	driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
//	
//	//identify password box and type password
//	driver.findElement(By.id("password")).sendKeys("abc1234");
//	
//	//identify singin button and click
//	driver.findElement(By.name("login")).click();
//	
//	//wait for 2 sec
//	Thread.sleep(4000);
//	
//	//close browser
//	driver.close();
//  
//}
	

}
