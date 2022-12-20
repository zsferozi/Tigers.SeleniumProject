package AssertionPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import utilities.Utils;

public class hardAssertionPractice extends Utils{

	public static void main(String[] args) {
		
     
   Utils.getBrowser("chrome","http://tek-school.com/retail/");
   //if expectedText wont much to the actualText the code will run but Chrome wont close however if it will be the same it will close  
   String expectedText = "TEST ENVIRONMENT TekScool";
   WebElement text = driver.findElement(By.linkText("TEST ENVIRONMENT"));
   String actualText = text.getText();
   
   Assert.assertEquals(actualText, expectedText);
   
		System.out.println("This will print if it passes");
		
		Utils.hardWait(5000);
		
		Utils.tearDown();
		
		
	}

}
