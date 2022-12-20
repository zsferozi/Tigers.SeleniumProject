package grouppractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.Utils;

public class ActionClassSendKey extends Utils {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://tek-school.com/retail/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement search = driver.findElement(By.xpath("//input[@name='search']"));
		String text ="Sediqa Jan";
		
		Actions actions = new Actions(driver);
	
	   Action builder =actions.keyDown(Keys.CONTROL).sendKeys(search, text).keyUp(Keys.CONTROL).build();
	   builder.perform();
		Thread.sleep(2000);

	}

}
