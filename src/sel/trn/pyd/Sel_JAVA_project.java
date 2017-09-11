package sel.trn.pyd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_JAVA_project {

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
		int flag=0;


		String s1=driver.findElement(By.xpath("//div[@class='srg']//child::div[1]/div/div/h3/a")).getText();
		String s2=driver.findElement(By.xpath("//div[@class='srg']//child::div[2]/div/div/h3/a")).getText();
		String s3=driver.findElement(By.xpath("//div[@class='srg']//child::div[3]/div/div/h3/a")).getText();
		String s4=driver.findElement(By.xpath("//div[@class='srg']//child::div[4]/div/div/h3/a")).getText();
		String s5=driver.findElement(By.xpath("//div[@class='srg']//child::div[5]/div/div/h3/a")).getText();
		String s6=driver.findElement(By.xpath("//div[@class='srg']//child::div[6]/div/div/h3/a")).getText();
		String s7=driver.findElement(By.xpath("//div[@class='srg']//child::div[7]/div/div/h3/a")).getText();
		String s8=driver.findElement(By.xpath("//div[@class='srg']//child::div[8]/div/div/h3/a")).getText();
		String s9=driver.findElement(By.xpath("//div[@class='srg']//child::div[9]/div/div/h3/a")).getText();



		Map<Integer,String> map=new HashMap<Integer,String>();

		map.put(1,s1);
		map.put(2,s2);
		map.put(3,s3);
		map.put(4,s4);
		map.put(5,s5);
		map.put(6,s6);
		map.put(7,s7);
		map.put(8,s8);
		map.put(9,s9);

		System.out.println(map.size());

		Iterator<Map.Entry<Integer,String>> entries=map.entrySet().iterator();		

		int count=0;

		for (Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
			String str=entry.getValue();
			if(str.contains(sc1))
			{
				count=count+1;
				switch(entry.getKey())
				{
				case 1:
					driver.findElement(By.xpath("//div[@class='srg']//child::div[1]/div/div/h3/a")).click();
					driver.navigate().back();
					break;
				case 2:
					driver.findElement(By.xpath("//div[@class='srg']//child::div[2]/div/div/h3/a")).click();
					driver.navigate().back();
					break;
				case 3:
					driver.findElement(By.xpath("//div[@class='srg']//child::div[3]/div/div/h3/a")).click();
					driver.navigate().back();
					break;
				case 4:
					driver.findElement(By.xpath("//div[@class='srg']//child::div[4]/div/div/h3/a")).click();
					driver.navigate().back();
					break;
				case 5:
					driver.findElement(By.xpath("//div[@class='srg']//child::div[5]/div/div/h3/a")).click();
					driver.navigate().back();
					break;
				case 6:
					driver.findElement(By.xpath("//div[@class='srg']//child::div[6]/div/div/h3/a")).click();
					driver.navigate().back();
					break;
				case 7:
					driver.findElement(By.xpath("//div[@class='srg']//child::div[7]/div/div/h3/a")).click();
					driver.navigate().back();
					break;
				case 8:
					driver.findElement(By.xpath("//div[@class='srg']//child::div[8]/div/div/h3/a")).click();
					driver.navigate().back();
					break;
				case 9:
					driver.findElement(By.xpath("//div[@class='srg']//child::div[9]/div/div/h3/a")).click();
					
					break;
				}

			}
		}

		System.out.println(count);

	}


}
