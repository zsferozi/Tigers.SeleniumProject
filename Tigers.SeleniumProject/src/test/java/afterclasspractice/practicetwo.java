package afterclasspractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.Utils;

public class practicetwo extends Utils {

	public static void main(String[] args) {

		getBrowser("chrome", "http://tek-school.com/retail/");
		// WebElement desktop = driver.findElement(By.xpath());
		WebElement desktoplink = driver.findElement(By.xpath("//a[text()='Desktops']"));
		WebElement showAlldestop = driver.findElement(By.xpath("//a[text()='Show All Desktops']"));
		
		driver.navigate().to("https://www.facebook.com/");
		hardWait(3000);
		driver.navigate().back();
		driver.navigate().refresh();
		
		
		
		
//		Actions actions = new Actions(driver);
//		actions.moveToElement(desktoplink).perform();
//		actions.keyDown(Keys.CONTROL)
//		.click(showAlldestop)
//		.keyUp(Keys.CONTROL)
//		.build().perform();
//		hardWait(2000);
		hardWait(3000);
		tearDown();

	}

}
