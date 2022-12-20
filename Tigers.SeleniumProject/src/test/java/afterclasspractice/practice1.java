package afterclasspractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import utilities.Utils;

public class practice1 extends Utils{

	public static void main(String[] args) {
//	//	System.setProperty("WebDriver.driver. chromedriver", "C:\\Users\\zsfer\\Downloads\\chromedriver_win32 (2).exe");
//		
//		getBrowser("chrome","http://tek-school.com/retail/");
//		WebElement desktop = driver.findElement(By.xpath());
//		driver.findElement(By.xpath("//a[text()='Desktops']")).click();
//		driver.findElement(By.xpath("//a[text()='Show All Desktops']")).click();
		
		getBrowser("chrome", "https://shop.demoqa.com/");
		WebElement text = driver.findElement(By.id("slide-6-layer-4"));
		
//		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		FluentWait <WebDriver> wait = new FluentWait<WebDriver>(driver)
			.withTimeout(30,TimeUnit.SECONDS)
			.pollingEvery(5,TimeUnit.SECONDS)
			.withMessage("The element did not show the expected time!");
		wait.until(ExpectedConditions.visibilityOf(text));
		System.out.println("this is the UI text: " + text.getText());
		tearDown();

	}

}
