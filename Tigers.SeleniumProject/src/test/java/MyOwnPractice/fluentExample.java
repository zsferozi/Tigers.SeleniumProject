package MyOwnPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import utilities.Utils;

public class fluentExample extends Utils {

	public static void main(String[] args) {


		getBrowser("chrome", "https://shop.demoqa.com/");
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(20, TimeUnit.SECONDS)
				.pollingEvery(2,TimeUnit.SECONDS)
				.withMessage("Within 20 seconds, the element was not interactable");
		WebElement text = driver.findElement(By.cssSelector("div#slide-6-layer-4"));
		wait.until(ExpectedConditions.visibilityOf(text));
		System.out.println(text.getText());
		
		driver.close();
		driver.quit();
		
		

	}

}
