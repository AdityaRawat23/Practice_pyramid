package sel.trn.pyd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationAssignment {

	public WebDriver driver;

	@BeforeMethod
	public void open()
	{
		System.setProperty("webdriver.chrome.driver","D:/SELENIUM/Crome/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		String baseUrl="http://10.4.32.66:1234/Home/PCIhome.aspx";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='pydLogin_txtUserid']")).sendKeys("pyramidadmin");
		driver.findElement(By.xpath("//input[@id='pydLogin_txtUserPwd']")).sendKeys("Password@1");
		driver.findElement(By.id("pydLogin_btnLogin")).click();
	}

	@AfterMethod
	public void close()
	{
		driver.close();
		driver.quit();
	}
	@Test(priority=1)
	public void timesheet()
	{
		driver.switchTo().frame("contents");
		driver.findElement(By.xpath("//a[@id='PCIMenut41']")).click();
		driver.findElement(By.xpath("//a[@id='PCIMenut42']")).click();

		driver.switchTo().defaultContent();
		driver.switchTo().frame("main");

		WebElement ele1=driver.findElement(By.xpath("//select[@id='ddlMstrProj']"));
		Select object=new Select(ele1);
		object.selectByIndex(3);

		WebElement ele2=driver.findElement(By.xpath("//select[@id='ddlGroup']"));
		Select object2=new Select(ele2);
		object2.selectByIndex(4);

		driver.switchTo().defaultContent();
	}
	@Test(priority=2)
	public void referral()
	{
		driver.switchTo().defaultContent();

		driver.switchTo().frame("contents");
		driver.findElement(By.xpath("//a[@id='PCIMenut1']")).click();

		driver.switchTo().defaultContent();
		driver.switchTo().frame("main");

	
		driver.findElement(By.xpath("//input[@id='rName']")).sendKeys("ADITYA");
		driver.findElement(By.xpath("//input[@id='remail']")).sendKeys("aditya.rawat");
		driver.findElement(By.xpath("//input[@id='rContactNo']")).sendKeys("9999999999");
		driver.findElement(By.xpath("//input[@id='rCompany']")).sendKeys("pyramidItConsulting");
				
		WebElement ele3=driver.findElement(By.xpath("//select[@id='ddlLocation']"));
		Select object=new Select(ele3);
		object.selectByIndex(3);
		
		driver.findElement(By.xpath("//div[@id='multiselect_chosen']//input")).click();
		driver.findElement(By.xpath("//li[contains(text(),'Java')]")).click();
		driver.findElement(By.xpath("//input[@id='Fileupload1']")).sendKeys("C:\\Users\\raditya\\Desktop");
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("top");
		driver.findElement(By.xpath("//td[@id='HeaderMenu1_tdAms']//following::a[3]")).click();
	}
}
