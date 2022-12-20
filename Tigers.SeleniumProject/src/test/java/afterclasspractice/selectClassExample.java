package afterclasspractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utilities.Utils;

public class selectClassExample extends Utils {

	public static void main(String[] args) {

		getBrowser("chrome", "https://www.facebook.com/");

		driver.findElement(By.xpath("//a[@data-testid ='open-registration-form-button']")).click();

        WebElement months = driver.findElement(By.cssSelector("select#month"));
        Select select = new Select(months);
        select.selectByVisibleText("Nov");
        
        
        hardWait(2000);
        tearDown();

	}

}
