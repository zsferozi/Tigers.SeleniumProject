package Interview;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HexaWare {


	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		driver.get("https://demoqa.com/");
		hardWait();
		JavascriptExecutor myJSE = (JavascriptExecutor) driver;
		WebElement form = driver.findElement(By.xpath("//h5[text()='Forms']"));
	    myJSE.executeScript("arguments[0].click;", form);
	    hardWait();
	    
	   JavascriptExecutor myJS = (JavascriptExecutor) driver;
	    WebDriverWait wait = new WebDriverWait(driver, 10);
	    WebElement practice = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Practice Form']")));
	    driver.findElement(By.partialLinkText("Practice")).click();
	    driver.findElement(By.id("item-0")).click();
	
	    myJS.executeScript("arguments[0].click;", practice);

		
		
		
		
		
		
		
		
		driver.close();
		driver.quit();

	}
	
	public static void hardWait() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		

	}
}
