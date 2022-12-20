package launchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.Utils;

public class TestFacebook extends Utils {

	public static void main(String[] args) {
		
		Utils.getBrowser("edge", "https://www.facebook.com");
		
	 WebElement createNew = driver.findElement(By.linkText("Create new account"));
	 
	 createNew.click();
	 
	 WebElement name= driver.findElement(By.name("firstname"));
	 name.sendKeys("Adam");
	 
		WebElement lastName = driver.findElement(By.name("lastname"));
	    lastName.sendKeys("Ferozi");
	    
	    WebElement email = driver.findElement(By.name("reg_email__"));
	    email.sendKeys("adam@gmail.com");
	    
	    WebElement reEnterEmail = driver.findElement(By.name("reg_email_confirmation__"));
	    reEnterEmail.sendKeys("adam@gmail.com");
	    
	    WebElement password = driver.findElement(By.id("password_step_input"));
	    password.sendKeys("Adam");
			
	 
		
		
		
		
		
		
		//	WebElement createNew = driver.findElement(By.linkText("Create new account"));
	//	createNew.click();
		
	//	WebElement firstName = driver.findElement(By.name("firstname")); 
	//	firstName.sendKeys("Zahal");
		
	//	WebElement lastName = driver.findElement(By.name("lastname"));
	//	lastName.sendKeys("Ferozi");
		
	 // WebElement emailPhone = driver.findElement(By.name("reg_email__"));
	//	emailPhone.sendKeys("someone@gmail.com");
		
	// //WebElement reentryEmail= driver.findElement(By.name("reh_email__"));
		//reentryEmail.sendKeys("someone@gmail.com");
		
	Utils.hardWait(3000);
	Utils.tearDown();
		
	}
	

}
