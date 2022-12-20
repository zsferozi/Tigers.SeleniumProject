package launchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utilities.Utils;

public class SelectMultiItem extends Utils {

	public static void main(String[] args) {
		
		Utils.getBrowser("edge", "https://selenium08.blogspot.com/2019/11/dropdown.html");
		
	WebElement multiSelect = driver.findElement(By.cssSelector("select[name='Month']"));
		
	Select select = new Select(multiSelect);
	
	select.selectByIndex(0);
	select.selectByIndex(1);
	select.selectByIndex(2);
	select.selectByIndex(3);
	select.selectByIndex(6);
	
	Utils.hardWait(2000);
	
	select.deselectByIndex(2);
	select.deselectByIndex(3);
	
	Utils.hardWait(2000);
	Utils.tearDown();
	

	}

}
