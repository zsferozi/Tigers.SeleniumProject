package ActionsVsAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.Utils;

public class ActionsClassPractice extends Utils {

	public static void main(String[] args) {
		
		Utils.getBrowser("chrome", "https://www.ebay.com/");
		
	
		WebElement electronics = driver.findElement(By.cssSelector("li[data-hover-track='p2481888.m1380.l6435']>a:first-child"));
		Actions actions = new Actions (driver);
		actions.moveToElement(electronics).perform();
		hardWait(6000);
		tearDown();
		

	}

}
