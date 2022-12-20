package MyOwnPractice;

import java.sql.DriverManager;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectExampleTwo {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String name = "Nora";
		String lastName= "Norani";
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastName);
		
		WebElement month= driver.findElement(By.cssSelector("select#month"));
		WebElement day=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		WebElement year= driver.findElement(By.xpath("//select[@name='birthday_year']"));
		
		Select selMonth= new Select(month);
		selMonth.selectByValue("3");
		
		Select selDay = new Select(day);
		selDay.selectByValue("10");
		
		Select selYear = new Select(year);
		selYear.selectByValue("2003");

	}

}
