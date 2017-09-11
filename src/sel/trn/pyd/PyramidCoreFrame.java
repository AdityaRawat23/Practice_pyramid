package sel.trn.pyd;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PyramidCoreFrame {

	/*public static void main(String[] args) throws InterruptedException {*/
	
	WebDriver driver;
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

	@Test(priority=8)
	public void leftframe()
	{
		driver.switchTo().frame("contents");
		driver.findElement(By.xpath("//a[@id='PCIMenun5']/img")).click();
		String str=driver.findElement(By.xpath("//a[@id='PCIMenut5']")).getText();
		if(str.equals("Project Mgmt"))
		{
			System.out.println("in left frame");
		}
		else
		{
			System.out.println("not in the left frame");
		}
	}

	//driver.switchTo().frame("top");
	//gives exception no such frame as we are redirected to the home via default content

	@Test(priority=9)
	public void mainframe() throws InterruptedException

	{
		driver.switchTo().defaultContent();

		driver.switchTo().frame("main");

		driver.findElement(By.xpath("//div[@class='buttons']/a[2]")).click();
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.xpath("//div[@class='buttons']/a[5]")).click();
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.xpath("//div[@class='buttons']/a[9]")).click();

		String str2=driver.findElement(By.xpath("//div[@class='slide-wrapper']")).getAttribute("style");
		//System.out.println(str2);
		if(str2.equals("width: 793px; height: 390px;"))
		{
			System.out.println("in the main frame");
		}
		else
		{
			System.out.println("not in the main frame");
		}

	}

	@Test(priority=3)
	public void topframe()
	{
		driver.switchTo().defaultContent();
		driver.switchTo().frame("top");
		String str3=driver.findElement(By.xpath("//div[@id='other']")).getText();

		if(str3.equals("Trigger the handler"))
		{
			System.out.println("in the top frame");
		}
		else
		{
			System.out.println("not in the top frame");
		}

	}


	//timesheet
	@Test(priority=4)
	public void timesheet()
	{
		driver.switchTo().defaultContent();
		driver.switchTo().frame("contents");
		driver.findElement(By.xpath("//a[@id='PCIMenut41']")).click();
		driver.findElement(By.xpath("//a[@id='PCIMenut42']")).click();

		driver.switchTo().defaultContent();
		driver.switchTo().frame("main");
		
		//fluent Wait
		//****************
		
		Wait wait=new FluentWait(driver.findElement(By.xpath("//select[@id='ddlMstrProj']"))).withTimeout(5,TimeUnit.SECONDS).pollingEvery(1,TimeUnit.SECONDS);
		//****************
		//fluent wait
		
		WebElement ele1=driver.findElement(By.xpath("//select[@id='ddlMstrProj']"));
		Select object=new Select(ele1);
		object.selectByIndex(3);

		WebElement ele2=driver.findElement(By.xpath("//select[@id='ddlGroup']"));
		Select object2=new Select(ele2);
		object2.selectByIndex(4);
	}


	//referral
	@Test(priority=5)
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
		Select objectt=new Select(ele3);
		objectt.selectByIndex(3);

		driver.findElement(By.xpath("//div[@id='multiselect_chosen']//input")).click();
		driver.findElement(By.xpath("//li[contains(text(),'Java')]")).click();
		driver.findElement(By.xpath("//input[@id='Fileupload1']")).sendKeys("C:\\Users\\raditya\\Desktop");

		driver.switchTo().defaultContent();
		driver.switchTo().frame("main");

		driver.findElement(By.xpath("//input[@id='Fileupload1']")).sendKeys("C:\\Users\\raditya\\Desktop");
	}

	@Test(priority=6)
	public void travel()
	{
		driver.switchTo().defaultContent();

		driver.switchTo().frame("contents");
		driver.findElement(By.xpath("//a[@id='PCIMenut73']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Add Request')]")).click();
		driver.switchTo().defaultContent();

		driver.switchTo().frame("main");
		List<WebElement> radiobttn=driver.findElements(By.name("rdoTravelType"));

		boolean value=false;

		value=radiobttn.get(0).isSelected();
		if(value==true)
		{
			radiobttn.get(1).click();
		}
		else
		{
			radiobttn.get(0).click();
		}
		driver.findElement(By.xpath("//input[@id='txtTravelCity']")).sendKeys("North Korea");

		WebElement we3=driver.findElement(By.xpath("//select[@id='ddlClient']"));
		Select obj4=new Select(we3);
		obj4.selectByIndex(2);

		driver.findElement(By.xpath("//input[@id='txtClientManager']")).sendKeys("Aditya");
		driver.findElement(By.xpath("//input[@id='txtArrival']")).sendKeys("2/2/2017");
		driver.findElement(By.xpath("//input[@id='txtDeparture']")).sendKeys("3/04/2017");

		List<WebElement> chkbx=driver.findElements(By.xpath("//input[@id='chkHotelRequired']"));

		boolean asd=false;
		asd=chkbx.get(0).isSelected();
		if(asd==true)
		{
			chkbx.get(1).click();
		}
		else
		{
			chkbx.get(0).click();
		}
		driver.findElement(By.xpath("//textarea[@id='txtRemark']")).sendKeys("hello");

	}

	@Test(priority=7)
	public void masterproject()
	{
		driver.switchTo().defaultContent();
		driver.switchTo().frame("contents");

		driver.findElement(By.xpath("//a[@id='PCIMenut44']")).click();
		driver.findElement(By.xpath("//a[@id='PCIMenut47']")).click();

		driver.switchTo().defaultContent();
		driver.switchTo().frame("main");

		WebElement MasterProject=driver.findElement(By.xpath("//select[@id='ddlMProjName']"));
		Select Mp=new Select(MasterProject);
		Mp.selectByValue("50");


		WebElement Project=driver.findElement(By.xpath("//select[@id='ddlProjName']"));
		Select Pct=new Select(Project);
		Pct.selectByVisibleText("All");


		WebElement Month=driver.findElement(By.xpath("//select[@id='ddlMonth']"));
		Select sce=new Select(Month);
		sce.selectByIndex(3);

		driver.switchTo().defaultContent();
		driver.switchTo().frame("contents");

		driver.findElement(By.xpath("//a[@id='PCIMenut2']")).click();

		driver.switchTo().defaultContent();
		driver.switchTo().frame("main");

		driver.findElement(By.xpath("//input[@id='rdSelf']")).click();

		driver.findElement(By.xpath("//input[@id='rdTeam']")).click();
	}	

	/*ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));*/


	/*driver.switchTo().frame("top");
		driver.findElement(By.xpath("//td[@id='HeaderMenu1_tdAms']//following::a[3]")).click();*/
	@Test(priority=1)
	public void orgcapa()
	{
		driver.switchTo().defaultContent();
		driver.switchTo().frame("contents");
		driver.findElement(By.xpath("//a[@id='PCIMenut89']")).click();
		driver.findElement(By.xpath("//a[@id='PCIMenut90']")).click();
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("main");
		WebElement qwe=driver.findElement(By.xpath("//select[@id='ddlPagetype']"));
		Select svh=new Select(qwe);
		svh.selectByIndex(1);
	}
	@Test(priority=2)
	public void feedback()
	{
		driver.switchTo().defaultContent();
		driver.switchTo().frame("contents");
		driver.findElement(By.xpath("//a[@id='PCIMenut4']")).click();
	}
	@AfterMethod
	public void close()
	{
		driver.switchTo().defaultContent();
		driver.switchTo().frame("top");
		driver.findElement(By.xpath("//td[@id='HeaderMenu1_tdAms']//following::a[3]")).click();
		driver.close();
		driver.quit();
	}
}

