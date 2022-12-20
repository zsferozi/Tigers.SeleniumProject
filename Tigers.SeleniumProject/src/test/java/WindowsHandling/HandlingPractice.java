package WindowsHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.Utils;

public class HandlingPractice extends Utils{

	public static void main(String[] args) {
		
		getBrowser ("chrome","http://tek-school.com/retail/");

		//We used the getWindowHanlde and stored the name of parent window in a String variable
		String parentWindow = driver.getWindowHandle();
		//we got and printed the TEST ENVIRONEMTN text from parent window and printed it
		WebElement text1 = driver.findElement(By.linkText("TEST ENVIRONMENT"));
		System.out.println(text1.getText());
		//We stored the locator for Desktops field drop-down
		WebElement desktop = driver.findElement(By.xpath("//a[text()='Desktops']"));
		//We used the Actions class to hover our mouse over that desktop field drop-down
		Actions actions = new Actions (driver);
		actions.moveToElement(desktop).perform();

		WebElement AllDesktopItem = driver.findElement(By.xpath("//a[text()='Show All Desktops']"));
		//
		actions.keyDown(Keys.CONTROL)
		.click(AllDesktopItem)
		.keyUp(Keys.CONTROL)
		.build().perform();
		//We used the getWindowHandles and store the name of open windows in a Set<String >

		Set <String> allWindows = driver.getWindowHandles();
		//We used the ITerator to iterate through the list of window names stored in the Set<String>
		Iterator<String> i = allWindows.iterator();
		//We used the while loop to loop through the list of open windows and the condition we passed
		// if i.hasNext() which means, if there is a next value/window name stored in the iterator
		while (i.hasNext()) {
		//Then by using the i.next() which will return a String value, we will store that next
		//window name in a String value and the reference we are using in childWindow
		String childWindow = i.next();
		//since we have to make sure that the name of parent and child windows are different
		//We used an if-statement to check and make sure the names are not equals
		if (!parentWindow.equals(childWindow)) {
		//we switch to child window

		WebElement searchField = driver.findElement(By.xpath("//input[@name='search']"));
		searchField.sendKeys("iphone");
		WebElement searchBttn = driver.findElement(By.xpath("//span[@class='input-group-btn']//button"));
		searchBttn.click();
		//close the child window
		driver.close();
		}
		}
		//switch back to parent window and perform the remaining actions on the parent window
		hardWait(3000);
		driver.switchTo().window(parentWindow);
		WebElement searchMonitors = driver.findElement(By.xpath("//input[@name='search']"));
		searchMonitors.sendKeys("Monitors");
		WebElement searchBttn = driver.findElement(By.xpath("//span[@class='input-group-btn']//button"));
		searchBttn.click();
		hardWait(6000);
		tearDown();

	}

}
