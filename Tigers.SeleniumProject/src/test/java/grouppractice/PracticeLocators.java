package grouppractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeLocators {

	public static void main(String[] args) {
	
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://tek-school.com/retail/");
		
		WebElement text= driver.findElement(By.xpath("//a[text()='TEST ENVIRONMENT']"));
		//System.out.println(text.getText());
		Assert.assertEquals(text.getText(), "TEST ENVIRONMENT");
		driver.findElement(By.linkText("My Account")).click();
		////span[text()='My Account']
		driver.findElement(By.partialLinkText("Register")).click();
		hardWait();
		//our actual locator is register Account since we use partial linktext, we use Account as partial 
		WebElement registerForm= driver.findElement(By.partialLinkText("Account"));
		registerForm.click();
		hardWait();
		Assert.assertEquals(driver.findElement(By.xpath("//h1[text()='Register Account']")).getText(), "Register Account");
		System.out.println(registerForm.getText());
		hardWait();
		driver.findElement(By.id("input-firstname")).sendKeys("Jacob");
		hardWait();
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Ferozi");
		hardWait();
		//we have to change our email in order for our test to run
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("Football23@gmail.com");
		hardWait();
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("15247181");
		hardWait();
		driver.findElement(By.id("input-password")).sendKeys("ABC123");
		driver.findElement(By.id("input-confirm")).sendKeys("ABC123");
		hardWait();
		WebElement newsLetter= driver.findElement(By.xpath("(//input[@name='newsletter'])[2]"));
		System.out.println(newsLetter.isSelected());
		Assert.assertEquals(newsLetter.isSelected(), true);
		hardWait();
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		hardWait();
		WebElement congrats= driver.findElement(By.xpath("//p[text()='Congratulations! Your new account has been successfully created!']"));
		Assert.assertEquals(congrats.getText(), "Congratulations! Your new account has been successfully created!");
		driver.findElement(By.xpath("//a[text()='Continue']")).click();
		
		hardWait();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.close();
		
		
		
		
		
		
		
		
		

	}
	public static void hardWait() {
		
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	
		
	}

}
