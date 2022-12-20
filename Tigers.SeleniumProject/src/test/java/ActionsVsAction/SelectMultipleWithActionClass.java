package ActionsVsAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import utilities.Utils;

public class SelectMultipleWithActionClass extends Utils{

	public static void main(String[] args) {
	
		getBrowser("chrome", "https://jqueryui.com/selectable/");
		WebElement iframe = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(iframe);
		
		hardWait(2000);
       
		WebElement itemO = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement itemT = driver.findElement(By.xpath("//li[text()='Item 2']"));
	//	WebElement itemTh = driver.findElement(By.xpath("//li[text()='Item 3']"));
		WebElement itemF = driver.findElement(By.xpath("//li[text()='Item 4']"));
		WebElement itemFi= driver.findElement(By.xpath("//li[text()='Item 5']"));
	
		
		//ACTIONS IS A CLASS
		Actions actions = new Actions(driver);
		//this Action an interface
		//this is called upcasting
		Action selectAble = actions.keyDown(Keys.CONTROL)
				.click(itemO)
				.click(itemT)
				//.click(itemTh)
				.click(itemF)
				.click(itemFi)
				.keyUp(Keys.CONTROL)
				.build();
				selectAble.perform();
			
				hardWait(5000);
				Utils.tearDown();
		
		
	}

}
