package grouppractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDown1 {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Nora");
		 hardWait();
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("MohammadZai");
		hardWait();
		WebElement month = driver.findElement(By.id("month"));
		WebElement day = driver.findElement(By.id("day"));	
		WebElement year = driver.findElement(By.id("year"));
		
//		Select selMonth = new Select(month);
//		selMonth.selectByValue("6");
//		hardWait();
//		Select selDay = new Select(day);
//		selDay.selectByVisibleText("28");
//		hardWait();
//		Select selYear = new Select(year);
//		selYear.selectByIndex(29);
		
		//istead of using code all the time we can write a reusable code and and call it 
        selectByVisbleText(day,"25");
		selectByVisbleText(month,"Jan");
		selectByVisbleText(year,"1991");
		
		driver.close();
		
		
		

	}
	public static void hardWait() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void selectByVisbleText(WebElement element, String value) {
		Select selectVisbleText = new Select(element);
		selectVisbleText.selectByVisibleText(value);
		
		
	}
	
	
	
	

}
