package sel.trn.pyd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAdvertisement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:/SELENIUM/Crome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

		String baseUrl="https://www.w3schools.com/js/js_ajax_intro.asp";
		
		driver.get(baseUrl);
		driver.switchTo().frame("google_ads_iframe_/16833175/MainLeaderboard_0");
		driver.findElement(By.xpath("//div[@id='cbb']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("google_ads_iframe_/16833175/WideSkyScraper_0");
		driver.findElement(By.xpath("//div[@id='cbb']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("google_ads_iframe_/16833175/MidContent_0");
		driver.findElement(By.xpath("//div[@id='cbb']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("google_ads_iframe_/16833175/StickySkyScraper_0");
		driver.findElement(By.xpath("//div[@id='cbb']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("google_ads_iframe_/16833175/BottomMediumRectangle_0");
		driver.findElement(By.xpath("//div[@id='cbb']")).click();
		driver.switchTo().defaultContent();
	
	}
}
