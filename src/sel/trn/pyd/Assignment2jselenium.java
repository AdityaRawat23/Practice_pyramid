package sel.trn.pyd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2jselenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:/SELENIUM/Crome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "https://www.google.co.in/";
		driver.get(baseUrl);
		
		driver.findElement(By.id("lst-ib")).sendKeys("wikipedia");
		//FOLLOWING
		String str1=driver.getCurrentUrl();
		driver.findElement(By.xpath("//*[@class='jsb']//following::input")).click();
		//FOLLOWING SIBLING
		int i=driver.getPageSource().length();
		driver.findElement(By.xpath("//*[@id='pt-anontalk']//following-sibling::li[3]")).click();
		
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		//CHILD
		String str2=driver.getTitle();
		driver.findElement(By.xpath("//*[@class='mw-input']//child::input")).sendKeys("Diligent Selenium");
		
		driver.findElement(By.id("wpPassword1")).sendKeys("diligent");
		//driver.findElement(By.xpath("//*[@id='wpname1']//ancester::form/div[4]/input")).sendKeys("diligent");
		//ANCESTOR
		driver.findElement(By.xpath("//*[@class='mw-input mw-htmlform-nolabel']//ancestor::div/button")).click();
		//DESCENDENT
		
		driver.findElement(By.xpath("//*[@id='n-randompage']//descendant::a")).click();
		driver.navigate().back();
		//CONTAINS
		String str3=driver.getWindowHandle();
		driver.findElement(By.xpath("//*[contains(text(),'Technology')]")).click();
		//PRECEDING
		String str4=driver.findElement(By.xpath("//*[@id='science_portalbar']//preceding::a[5]")).getAttribute("style");
		driver.findElement(By.xpath("//*[@id='science_portalbar']//preceding::a[5]")).click();
		//PRECEDING-SIBLING
		
		driver.findElement(By.xpath("//*[contains(text(),'Igbo')]//preceding-sibling::a[7]")).click();
		//PARENT
		driver.findElement(By.xpath("//*[contains(text(),'Brain')]//parent::li/a")).click();
				
		driver.findElement(By.xpath("//*[contains(text(),'Log out')]")).click();
		
		driver.close();
		driver.quit();
		
		 System.out.println(str1);
		 System.out.println(str2);
		 System.out.println(i);
		 System.out.println(str3);
		 System.out.println(str4);
		 
	}
}