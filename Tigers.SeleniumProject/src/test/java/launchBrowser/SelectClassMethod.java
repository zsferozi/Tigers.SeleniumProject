package launchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import utilities.Utils;

public class SelectClassMethod extends Utils {

	public static void main(String[] args) {

		Utils.getBrowser("chrome", "https://www.facebook.com/");

		driver.findElement(By.linkText("Create new account")).click();
		selectMonthByValue("1");
		selectDayByValue("10");
		selectYearByValue("1991");

		
		}

		public static void selectMonthByValue(String value) {
		Select select = new Select(driver.findElement(By.cssSelector("select#month")));
		select.selectByValue(value);
		}

		public static void selectDayByValue(String value) {
		Select select = new Select(driver.findElement(By.cssSelector("select#day")));
		select.selectByValue(value);
		}

		public static void selectYearByValue(String value) {
		Select select = new Select(driver.findElement(By.cssSelector("select#year")));
		select.selectByValue(value);
		
		Utils.hardWait(3000);
		Utils.tearDown();
		
		}
		}
