package Interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JamilCalculator {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.calculator.net/");
		tearDown();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		WebElement five = driver.findElement(By.xpath("(//span[@class='scinm'])[5]"));
		five.click();
		tearDown();
		WebElement adding = driver.findElement(By.xpath("(//span[@class='sciop'])[1]"));
		adding.click();
		tearDown();
		WebElement eight = driver.findElement(By.xpath("(//span[@class='scinm'])[2]"));
		eight.click();
		tearDown();
		WebElement equals = driver.findElement(By.id("scimrc"));
		equals.click();
		WebElement validate = driver.findElement(By.id("sciOutPut"));
		String expected = " 13";
	   String actual =	validate.getText();
	
	    Assert.assertEquals(expected, actual);
	    
      System.out.println("The test pass after Validation");
	  	
		
		driver.close();
		driver.quit();

	}
	//I create this to pause for each parts 
	public static void tearDown() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
