package sel.trn.pyd;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class java_assignment2{
	public static void main(String args[]) throws InterruptedException{

		String sc1="test";
		sc1=sc1.toLowerCase();
		System.setProperty("webdriver.chrome.driver","D:/SELENIUM/Crome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);	

		String baseUrl = "https://www.google.co.in/";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.findElement(By.id("lst-ib")).sendKeys(sc1);
		driver.findElement(By.id("lst-ib")).submit();
		int flag=0;

		List<WebElement> links = driver.findElements(By.xpath("//h3[@class='r']/a"));

		ArrayList<String> al2=new ArrayList<>();

		int count=0;
		WebElement we;
		ArrayList<WebElement> pr=new ArrayList<>();
		Iterator itr=links.iterator();
		while(itr.hasNext())
		{			
			we=(WebElement) itr.next();
			String str=we.getText();
			
			String str2=we.getAttribute("href");
			if(str.toLowerCase().contains(sc1))
			{

				al2.add(str2);
				count=count+1;
				pr.add(we);
				
			}
		}

		for(String s:al2)
		{
			System.out.println(s);
			//driver.navigate().to(s);
			//driver.navigate().back();

		}
		System.out.println(count);	
		for(int i=0;i<pr.size();i++)
		{
			pr.get(i).click();
			driver.navigate().back();
			TimeUnit.SECONDS.sleep(4);
		}		
	}
}