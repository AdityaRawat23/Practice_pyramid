package sel.trn.pyd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//	import org.openqa.*;
public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","D:/SELENIUM/Crome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://www.codechef.com/";
		driver.get(baseUrl);
		driver.findElement(By.id("edit-name")).clear();
		driver.findElement(By.id("edit-name")).sendKeys("asd");
		driver.findElement(By.id("edit-pass")).clear();
		driver.findElement(By.id("edit-pass")).sendKeys("zxc");
		driver.findElement(By.id("edit-submit")).click();

		driver.close();
		driver.quit();
	}

}