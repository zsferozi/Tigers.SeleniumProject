package MyOwnPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.Utils;

public class WindowHandlingPractice extends Utils{
  public static String parentWindow;
	public static void main(String[] args) {
		
		getBrowser("chrome", "http://tek-school.com/retail/");
		parentWindow = driver.getWindowHandle();
		WebElement text1 = driver.findElement(By.linkText("TEST ENVIRONMENT"));
		System.out.println(text1.getText());
		WebElement desktop = driver.findElement(By.xpath("//a[text()='Desktops']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(desktop).perform();
		
		WebElement allDesktopItems = driver.findElement(By.linkText("Show All Desktops"));
		actions.keyDown(Keys.CONTROL).click(allDesktopItems).keyUp(Keys.CONTROL)
		.build().perform();
		
		//child window
		switchToNewWindow();
		WebElement searchField = driver.findElement(By.xpath("//input[@name='search']"));
		searchField.sendKeys("iphone");
		WebElement searchBttn = driver.findElement(By.xpath("//span[@class='input-group-btn']//button"));
		searchBttn.click();
		hardWait(7000);
		driver.close();
		
		// parent window actions
	    hardWait(7000);
	    driver.switchTo().window(parentWindow);
	    WebElement searchMonitors = driver.findElement(By.xpath("//input[@name='search']"));
	    searchMonitors.sendKeys("Monitors");
	    WebElement searchBttn2 = driver.findElement(By.xpath("//span[@class='input-group-btn']//button"));
	    searchBttn2.click();
	    
	    hardWait(6000);
	    tearDown();
	    
	}
		
		public static void switchToNewWindow() {
			Set <String> allWindows = driver.getWindowHandles();
			Iterator<String> i = allWindows.iterator();
			while(i.hasNext()) {
				String childWindow = i.next();
				if(!parentWindow.equals(childWindow)) {
					driver.switchTo().window(childWindow);
				}
			}
			
		}
		
		
		
		
		
		
		
	}


