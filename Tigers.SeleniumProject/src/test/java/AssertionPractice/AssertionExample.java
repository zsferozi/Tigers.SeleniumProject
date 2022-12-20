package AssertionPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import utilities.Utils;

public class AssertionExample extends Utils{

	public static void main(String[] args) {
	
		
		getBrowser("chrome","http://tek-school.com/retail/");
		
		String expectedText = "TEST ENVIRONMENTs";
		
		WebElement envionmentText = driver.findElement(By.linkText("TEST ENVIRONMENT"));
		
		String actualText = envionmentText.getText();
		
		Assert.assertEquals(actualText, expectedText);
		System.out.println("the asseriton passed " + actualText);
		
		
		hardWait(2000);
		tearDown();
		
		
		

	}

}
