package MyOwnPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.Utils;

public class ExplicitExample extends Utils{

	public static void main(String[] args) {
		
		Utils.getBrowser("chrome", "https://shop.demoqa.com/");
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		WebElement text = driver.findElement(By.cssSelector("div#slide-6-layer-4"));
		wait.until(ExpectedConditions.visibilityOf(text));
		System.out.println(text.getText());
		
		driver.close();
		driver.quit();
		
		
	}

}
