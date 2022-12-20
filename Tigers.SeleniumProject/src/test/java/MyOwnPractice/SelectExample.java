package MyOwnPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utilities.Utils;

public class SelectExample extends Utils{

	public static void main(String[] args) {
		
		Utils.getBrowser("chrome", "https://www.facebook.com/");
		WebElement months = driver.findElement(By.xpath("//select[@id='month']"));
		Select dropDown = new Select(months);
		dropDown.selectByValue("1");

	}

}
