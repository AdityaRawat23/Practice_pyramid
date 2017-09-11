package sel.trn.pyd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:/SELENIUM/Crome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		String baseUrl="https://docs.google.com/forms/d/e/1FAIpQLSf9hn5thjHYV07W9_HHWss1CB9TIZJZ30snXuPBwLj7rMTz6w/viewform?c=0&w=1";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[contains(text(),' Sign in ')]")).click();
		driver.findElement(By.xpath("//input[starts-with(@name,'identi')]")).sendKeys("diligentselenium");
		driver.findElement(By.xpath("//*[@class='OZliR']//child::div")).click();

		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("//*[starts-with(@name,'password')]")).sendKeys("diligent");
		driver.findElement(By.xpath("//*[starts-with(text(),'Next')]")).click();
			

		driver.findElement(By.xpath("//*[@class='gb_P']")).click();
		
	}

}
