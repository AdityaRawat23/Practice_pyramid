package sel.trn.pyd;

import java.util.concurrent.TimeUnit;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

@SuppressWarnings("unused")
public class First1point1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//***********
		//for firefox
		//System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();

		//*********************
		//for Internet Explorer 
		//System.setProperty("webdriver.ie.driver","C:\\Program Files\\Selenium\\Drivers\\IEDriver\\IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();

		//********************
		//for chrome browser
		System.setProperty("webdriver.chrome.driver","D:/SELENIUM/Crome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//implicit wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	

		String baseUrl = "https://www.google.co.in/";
		driver.get(baseUrl);
		driver.manage().window().maximize();

		driver.findElement(By.id("gb_70")).click();
		//driver.findElement(By.id("identifierId")).clear();
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//input[starts-with(@name,'identi')]")).sendKeys("diligentselenium");
		driver.findElement(By.xpath("//*[@class='OZliR']//child::div")).click();

		//driver.findElement(By.xpath("//*[@id='headingText']//following::input[3]")).clear();
		String currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("//*[starts-with(@name,'password')]")).sendKeys("diligent");
		driver.findElement(By.xpath("//*[starts-with(text(),'Next')]")).click();
		
		//driver.findElement(By.cssSelector("content.CwaK9")).click();
		

		driver.findElement(By.xpath("//*[@class='gb_P']")).click();

		String s1=driver.getPageSource();
		int i=s1.length();
		System.out.println(i);

		driver.findElement(By.xpath("//*[@class='T-I J-J5-Ji T-I-KE L3']")).click();
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);

		driver.findElement(By.xpath("//*[@class='wA']//following::textarea")).click();
		driver.findElement(By.xpath("//*[@class='wA']//following::textarea")).sendKeys("diligentselenium@gmail.com");


		driver.findElement(By.xpath("//*[@class='aoT']")).submit();

		driver.findElement(By.xpath("//*[@class='aoT']")).sendKeys("diligentsel");

		driver.findElement(By.xpath("//*[@class='Am Al editable LW-avf']")).click();

		driver.findElement(By.xpath("//*[@class='Am Al editable LW-avf']")).sendKeys("Hello world");

		driver.findElement(By.xpath("//*[@class='T-I J-J5-Ji aoO T-I-atl L3']")).click();

		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[contains(text(),'Starred')]")).click();

		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[contains(text(),'Sent Mail')]")).click();

		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[starts-with(@title,'Draft')]")).click();

		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[starts-with(@title,'Inbox')]")).click();

		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//div[@class='gb_Fc']//child::a")).click();

		TimeUnit.SECONDS.sleep(3);
		driver.findElement(By.xpath("//a[@class='gb_O']//following::a[5]")).click();

		 		

		//new tab //***
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		//*************

		System.out.println(driver.getCurrentUrl());

		driver.findElement(By.xpath("//content[@class='z80M1 JQZRxb']//following::span[2]")).click();
		System.out.println(driver.getTitle());

     	//driver.findElement(By.xpath("//div[@class='ThdJC kaAt2']//following::a")).click();
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("//div[@class='mrslJ ZjAUM ']//following::a[3]")).click();
		
		TimeUnit.SECONDS.sleep(2);
		/*driver.findElement(By.xpath("//div[contains(text(),'Suggested For You')]//following::a")).click();
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//input[@class='Ax4B8 ZAGvjd']")).sendKeys("Information Technology");
		driver.findElement(By.xpath("//input[@class='Ax4B8 ZAGvjd']")).submit();*/
		//driver.findElement(By.cssSelector("jslog.31144; track:JIbuQc")).click();
		//driver.findElement(By.xpath("//div[@class='ThdJC kaAt2']//following::a")).click();
		
		driver.switchTo().window(tabs2.get(0));
		driver.findElement(By.xpath("//a[starts-with(@title,'Google Account: Dummy Selenium')]")).click();

		driver.findElement(By.xpath("//a[@id='gb_71']")).click();

		driver.close();

		driver.quit();
	}
}