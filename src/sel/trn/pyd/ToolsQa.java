package sel.trn.pyd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToolsQa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:/SELENIUM/Crome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		String baseUrl="http://toolsqa.wpengine.com/automation-practice-form/";
		driver.get(baseUrl);
		WebElement element = driver.findElement(By.xpath("//select[@id='continents']"));
		Select obj=new Select(element);
		//obj.selectByIndex(4);
		//obj.selectByVisibleText("Antartica");
		obj.selectByValue("");
	}

}
