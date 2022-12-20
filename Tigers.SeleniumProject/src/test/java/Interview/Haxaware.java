package Interview;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Haxaware {

	public static void main(String[] args) {
	
		
		WebDriverManager.chromedriver().setup();
	
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://demoqa.com/");
		
		//driver.findElement(By.xpath("(//div[@class='card-body'])[2]")).click();
		WebElement forms= driver.findElement(By.xpath("//h5[text()='Forms']"));
		JavascriptExecutor myJS = (JavascriptExecutor) driver;
		myJS.executeScript("arguments[0].click;", forms);
		
//		driver.navigate().refresh();
//		hardWait();
		WebElement practice = driver.findElement(By.xpath("//span[text()='Practice Form']"));
		//myJS.executeScript("arguments[1].click;", practice);
		practice.click();
		hardWait();
		driver.findElement(By.id("firstName")).sendKeys("Zahal");
		hardWait();
		driver.findElement(By.id("lastName")).sendKeys("Ferozi");
		hardWait();
		driver.findElement(By.cssSelector("id#userEmail")).sendKeys("SomeOne@gmail.com");
		hardWait();
		driver.findElement(By.xpath("(//input[@name='gender'])[2]")).click();
		hardWait();
		driver.findElement(By.id("userNumber")).sendKeys("66783456");
		hardWait();
		driver.findElement(By.id("dateOfBirthInput")).click();
		hardWait();
		
		
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
