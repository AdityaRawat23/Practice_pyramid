package sel.trn.pyd;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ÌframeTestQa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:/SELENIUM/Crome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		String baseUrl="http://toolsqa.wpengine.com/iframe-practice-page/";
		driver.get(baseUrl);
		
		List<WebElement> lst=(List<WebElement>) driver.findElements(By.tagName("iframe"));
		System.out.println(lst.size());
		
		driver.switchTo().frame("IF2");
		
		String s1=driver.findElement(By.xpath("//h1[contains(text(),'Home')]")).getText();
		if(s1.equals("Home"))
		{
			System.out.println("FRAME 2 CONFIRMED");
		}
		else
		{
			System.out.println("NOt in frame 2");
		}
		System.out.println(s1);
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("IF1");
		
		String str2=driver.findElement(By.xpath("//h1[contains(text(),'Practice Automation Form']")).getText();
		if(str2=="Practice Automation Form")
		{
			System.out.println("in frame 1");
			
		}
		else
		{
			System.out.println("NOt in frame 1");
		}
		driver.switchTo().defaultContent();
		String s=driver.getTitle();
		System.out.println(s);
		
	}

}
