package sel.trn.pyd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pyramidwebsite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:/SELENIUM/Crome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://www.google.co.in/";
		driver.get(baseUrl);
		driver.findElement(By.id("lst-ib")).sendKeys("pyramid it");
		driver.findElement(By.id("lst-ib")).submit();
		//driver.findElement(By.xpath("//*[@class='jsb']//following::input")).click();
		
		driver.findElement(By.xpath("//div[@class='rc']//following::a")).click();
	}

}
