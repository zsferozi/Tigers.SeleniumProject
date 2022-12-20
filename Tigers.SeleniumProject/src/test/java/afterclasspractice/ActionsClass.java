package afterclasspractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.Utils;

public class ActionsClass extends Utils{

	public static void main(String[] args) {
		getBrowser("chrome", "http://tek-school.com/retail/");
		
		WebElement desktoplink = driver.findElement(By.xpath("//a[text()='Desktops']"));
		WebElement showAlldestop = driver.findElement(By.xpath("//a[text()='Show All Desktops']"));
		
		
		Actions actions = new Actions(driver);
		actions.moveToElement(desktoplink).perform();
		actions.keyDown(Keys.CONTROL)
		.click(showAlldestop)
		.keyUp(Keys.CONTROL)
		.build().perform();
		
		Set<String> allWindows = driver.getWindowHandles();
		Iterator <String> i = allWindows.iterator();
		String parentWindow = i.next();
		String childWindow = i.next();
		driver.switchTo().window(childWindow);
		WebElement softWareLink = driver.findElement(By.xpath("//a[text()='Software']"));
		actions.click(softWareLink);
		hardWait(3000);
		driver.switchTo().window(parentWindow);
		
		
		
		hardWait(3000);
		tearDown();

	}

}
