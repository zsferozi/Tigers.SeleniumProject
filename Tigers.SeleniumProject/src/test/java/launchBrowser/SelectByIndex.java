package launchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import utilities.Utils;

public class SelectByIndex extends Utils {
	public static void main(String[] args) {

		Utils.getBrowser("chrome", "https://www.facebook.com/");

		driver.findElement(By.linkText("Create new account")).click();
		
		selectMonthByIndex(3);
		selectYearByIndex(30);
		selectDayByIndex(4);

		Utils.hardWait(3000);
		Utils.tearDown();

	}

	public static void selectMonthByIndex(int index) {
		Select select = new Select(driver.findElement(By.cssSelector("select#month")));
		select.selectByIndex(index);
	}

	public static void selectDayByIndex(int index) {
		Select select = new Select(driver.findElement(By.cssSelector("select#day")));
		select.deselectByIndex(index);

	}

	public static void selectYearByIndex(int index) {
		Select select = new Select(driver.findElement(By.cssSelector("select#year")));
		select.selectByIndex(index);

	}

}
