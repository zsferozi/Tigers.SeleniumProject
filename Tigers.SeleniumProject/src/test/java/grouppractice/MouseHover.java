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

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://tek-school.com/retail/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement desktop= driver.findElement(By.xpath("//a[text()='Desktops']"));
		WebElement showAllDesktop= driver.findElement(By.xpath("//a[contains(text(),'Show All Desktops')]"));
		WebElement search = driver.findElement(By.cssSelector("input[class='form-control input-lg']"));
		String text ="Sediqa Jan";
		search.sendKeys(text);
		
		Actions actions = new Actions(driver);
		actions.moveToElement(desktop).perform();
		
		actions.keyDown(Keys.CONTROL).click(showAllDesktop).keyUp(Keys.CONTROL).perform();
		
		Thread.sleep(2000);
		
	   Action builder2 =	actions.keyDown(Keys.CONTROL).sendKeys(search, text).keyUp(Keys.CONTROL).build();
	   builder2.perform();
		
	
		
		
		
		

	}

}
