package WindowsHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.Utils;

public class windowHandlingWithOutNotes extends Utils {

	public static void main(String[] args) {
	

		getBrowser("chrome", "http://tek-school.com/retail/");
        String parentWindow = driver.getWindowHandle();
        WebElement deskTop = driver.findElement(By.xpath("//a[text()='Desktops']"));
        deskTop.click();
        Actions actions = new Actions(driver);
        actions.moveToElement(deskTop).perform();
        WebElement allDesktops = driver.findElement(By.xpath("//a[text()='Show All Desktops']"));
        actions.keyDown(Keys.CONTROL).click(allDesktops).keyUp(Keys.CONTROL).build().perform();
        Set<String> allWindows = driver.getWindowHandles();
        Iterator<String> i = allWindows.iterator();
        while (i.hasNext()) {
            String childWindow = i.next();
            driver.switchTo().window(childWindow);
            hardWait(3000);
            if (!parentWindow.equals(childWindow)) {
                WebElement searchField = driver.findElement(By.xpath("//input[@name='search']"));
                searchField.sendKeys("iphone");
                WebElement searchBttn = driver.findElement(By.xpath("//span[@class='input-group-btn']//button"));
                searchBttn.click();
                driver.close();
            }
        }
        hardWait(3000);
        driver.switchTo().window(parentWindow);
        WebElement searchMonitors = driver.findElement(By.xpath("//input[@name='search']"));
        searchMonitors.sendKeys("monitor");
        WebElement searchBttn = driver.findElement(By.xpath("//span[@class='input-group-btn']//button"));
        searchBttn.click();
        hardWait(6000);
        tearDown();
	}
}



