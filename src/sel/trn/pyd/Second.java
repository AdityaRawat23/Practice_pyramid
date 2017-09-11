package sel.trn.pyd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class Second {
	public static void main(String args[])
	{
		//System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","D:/SELENIUM/Crome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://www.google.co.in/";
		driver.get(baseUrl);
		driver.findElement(By.id("lst-ib")).sendKeys("Wikipedia");
		driver.findElement(By.name("btnK")).click();
		driver.findElement(By.linkText("Wikipedia, the free encyclopedia")).click();
		driver.findElement(By.linkText("Main page")).click();
		//driver.findElement(By.cssSelector(selector)).click();
		//assertEquals(driver.findElement(By.id("firstHeading")).getText(), "Portal:Current events");

		driver.close();
		driver.quit();
	}
}