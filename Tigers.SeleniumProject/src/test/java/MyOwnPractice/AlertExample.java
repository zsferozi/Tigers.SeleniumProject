package MyOwnPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.Utils;

public class AlertExample extends Utils{

	public static void main(String[] args) {
		
		Utils.getBrowser("chrome","https://demo.guru99.com/test/delete_customer.php");
		
		WebElement textField = driver.findElement(By.cssSelector("input[name='cusid']"));
		
		textField.sendKeys("42345");
		hardWait(5000);
		
		WebElement submitButton = driver.findElement(By.xpath("//input[@name='submit']"));
		
		submitButton.click();
		hardWait(5000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		hardWait(5000);
		alert.accept();
		hardWait(5000);
		
		
		
		
		
		
		
		
		
		
		
		
		tearDown();
		
		
		
		
		
		
		

	}

}
