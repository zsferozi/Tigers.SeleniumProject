package ActionsVsAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.Utils;

public class DragAndDrop extends Utils {
	
	public static void main(String[] args) {
		
		Utils.getBrowser("chrome", "https://jqueryui.com/droppable/");
		WebElement iframe= driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(iframe);
		
		WebElement drag = driver.findElement(By.id("draggable"));
		hardWait(3000);
		
		WebElement drop= driver.findElement(By.id("droppable"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(drag, drop).perform();
		
		hardWait(5000);
		tearDown();
		
		
		
	}

}
