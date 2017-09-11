package sel.trn.pyd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:/SELENIUM/Crome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		String baseUrl="https://www.google.co.in/";
		driver.get(baseUrl);
		driver.findElement(By.xpath("//div[@id='gb']//a")).click();
		driver.findElement(By.xpath("//div[@class='AIu8h']//div")).click();
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.xpath("//div[contains(text(),'Create account')]")).click();
		//driver.findElement(By.xpath("//div[@id='SIGNUP']")).click();
		
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("selenium");
		
		String str=driver.getPageSource();
		System.out.println(str.length());
		String str2=driver.getTitle();
		if(str2.equals("Create your Google Account"))
		{
			System.out.println("title matching");
		}
		String str3=driver.findElement(By.xpath("//div[@class='side-content']//h2")).getText();
		if(str3.equals("One account is all you need"))
		{
			System.out.println("text is compared");
		}
		
		driver.findElement(By.xpath("//input[@id='GmailAddress']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@id='Passwd']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@id='PasswdAgain']")).sendKeys("Selenium");
		
		driver.findElement(By.xpath("//span[@id='BirthMonth']//div")).click();
		driver.findElement(By.xpath("//div[@id=':1']")).click();
		
		driver.findElement(By.xpath("//input[@id='BirthDay']")).sendKeys("4");
		driver.findElement(By.xpath("//input[@id='BirthYear']")).sendKeys("1998");
		
		WebElement ele=driver.findElement(By.xpath("//input[@id='BirthDay']"));
		Point obj2=ele.getLocation();
		System.out.println("x cordinate "+obj2.getX());
		System.out.println("y cordinate "+obj2.getY());
		
		
		driver.findElement(By.xpath("//div[@id='Gender']")).click();
		driver.findElement(By.xpath("//div[@id=':f']")).click();
		
		driver.findElement(By.xpath("//input[@id='RecoveryPhoneNumber']")).sendKeys("7011218158");
		driver.findElement(By.xpath("//input[@id='RecoveryEmailAddress']")).sendKeys("asda7@gmail.com");
		
		String str5=driver.findElement(By.xpath("//input[@id='GmailAddress']")).getAttribute("maxlength");
		//int a=Integer.parseInt(str5);
		System.out.println(str5);
		WebElement element = driver.findElement(By.id("lang-chooser"));
		Select obj=new Select(element);
		
		
		
		obj.selectByIndex(24);
		//obj.selectByValue("af");
		//obj.selectByVisibleText("Italiano");
		
		TimeUnit.SECONDS.sleep(5);
		
		/*driver.close();
		driver.quit();*/
	}

}
