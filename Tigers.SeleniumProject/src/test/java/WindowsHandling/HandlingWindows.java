package WindowsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.Utils;

public class HandlingWindows extends Utils {
 public static void main(String[] args) {
	
	 Utils.getBrowser("chrome","http://tek-school.com/retail/");
	 
	 WebElement desktop = driver.findElement(By.xpath("//a[text()='Desktops']"));
	 desktop.click();
	 
	  Actions actions = new Actions(driver);
	 actions.moveToElement(desktop);
	 
	 WebElement allDesktops= driver.findElement(By.xpath("//a[text()='Show All Desktops']"));
	 
	 actions.keyDown(Keys.CONTROL)
	 .click(allDesktops)
	 .keyUp(Keys.CONTROL)
	 .build().perform();
	 hardWait(5000);
	 tearDown();
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
}
