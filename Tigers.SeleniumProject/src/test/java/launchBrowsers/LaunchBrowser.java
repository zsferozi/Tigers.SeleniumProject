
package launchBrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import Base.Utils;;

public class LaunchBrowser extends Utils{

	public static void main(String[] args) {
		
		openBrowser("chrome","http://tek-school.com/retail/");
		driver.findElement(By.linkText("Desktops")).click();
		WebElement allDesktops = driver.findElement(By.linkText("Show All Desktops"));
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).click(allDesktops).keyUp(Keys.CONTROL).build().perform();
		toNextWindow();
		
		
	 Utils.toSleep(6000);
	 close();
	}

}
