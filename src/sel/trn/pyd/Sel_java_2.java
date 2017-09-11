package sel.trn.pyd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_java_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sc1="HelloWorld";
		System.setProperty("webdriver.chrome.driver","D:/SELENIUM/Crome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);	

		String baseUrl = "https://www.google.co.in/";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.findElement(By.id("lst-ib")).sendKeys(sc1);
		driver.findElement(By.id("lst-ib")).submit();
		String str="\"//div[@class='srg']//child::div[1]/div/div/h3/a\"";
		System.out.println(str);
		driver.findElement(By.xpath(str)).click();
		
		
	}

}
