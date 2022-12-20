package Interview;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JsUtils {
 
	public static void flash(WebElement element, WebDriver driver) {
		
		String bgcolor = element.getCssValue("backgroudColor"); // green
		
		for(int i = 0; i<500; i++) {
			changeColor("#000000", element, driver); //1
				changeColor(bgcolor, element,driver);//2
			}
		}
	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("argument[0].style.backgroundColor = '"+ color + "'", element);
		
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
	
	
	
}
