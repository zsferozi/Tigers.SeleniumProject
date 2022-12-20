package ActionsVsAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import utilities.Utils;

public class SendKeysPractice extends Utils{

	public static void main(String[] args) {
	
		Utils.getBrowser("edge", "http://tek-school.com/retail/");
		
		WebElement sendKeys= driver.findElement(By.xpath("//input[@name='search']"));
		
		String text = "Geroge Messon";
		Actions actions = new Actions(driver);
		
		Action builder = actions.keyUp(Keys.SHIFT)
		.sendKeys(sendKeys,text)
		.keyDown(Keys.SHIFT)
		.build();
		
		
		builder.perform();
		
		hardWait(3000);
		tearDown();
		
	}
}
