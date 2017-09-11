package sel.trn.pyd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pydcore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:/SELENIUM/Crome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://www.google.co.in/";
		driver.get(baseUrl);
		driver.findElement(By.id("lst-ib")).clear();
	    driver.findElement(By.id("lst-ib")).sendKeys("pyramidcore");
	    driver.findElement(By.name("btnK")).click();
	    driver.findElement(By.linkText("PyramidCore-Login")).click();
	    driver.findElement(By.id("pydLogin_txtUserid")).clear();
	    driver.findElement(By.id("pydLogin_txtUserid")).sendKeys("asd");
	    driver.findElement(By.id("pydLogin_txtUserPwd")).clear();
	    driver.findElement(By.id("pydLogin_txtUserPwd")).sendKeys("asd");
	    driver.findElement(By.id("pydLogin_btnLogin")).click();
	    //driver.findElement(By.xpath(".//*[@id=’tabs-1′]/div/p/a")).click();


		driver.close();
		driver.quit();
	}

}
