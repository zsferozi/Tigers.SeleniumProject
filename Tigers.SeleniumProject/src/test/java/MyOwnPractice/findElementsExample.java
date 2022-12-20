package MyOwnPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.Utils;

public class findElementsExample extends Utils {

	public static void main(String[] args) {
		/*
		 * when we use findElements() it works with list and for loop to iterate and it
		 * is used to drop-down.
		 */

		Utils.getBrowser("chrome", "https://www.facebook.com/");

		driver.findElement(By.linkText("Create new account")).click();

		hardWait(5000);

		List<WebElement> months = driver.findElements(By.cssSelector("select#month>option"));

		for (int i = 0; i <= months.size(); i++) {
			if (months.get(i).getText().equals("Sep")) {
				months.get(i).click();
				break;

			}

		}
		
		hardWait(5000);
		
		List<WebElement> year = driver.findElements(By.cssSelector("select#year>option"));
		for (int i = 0; i < year.size(); i++) {
			if(year.get(i).getText().equals("2000")) {
				year.get(i).click();
				break;
			}
			
		}

		hardWait(5000);
		Utils.tearDown();

	}

}
