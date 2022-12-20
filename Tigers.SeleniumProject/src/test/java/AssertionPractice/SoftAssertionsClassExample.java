package AssertionPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import utilities.Utils;

public class SoftAssertionsClassExample extends Utils{

	public static void main(String[] args) {
		
	getBrowser("chrome","http://tek-school.com/retail/");
		
		String expectedText = "TEST ENVIRONMENT nora";
		
		
		WebElement envionmentText = driver.findElement(By.linkText("TEST ENVIRONMENT"));
		String actualText = envionmentText.getText();
		
		SoftAssert object = new SoftAssert();
		object.assertEquals(actualText, expectedText);
		System.out.println("This is soft Assert after test ! " + expectedText  + actualText);
		
		hardWait(2000);
		tearDown();

	}

}
