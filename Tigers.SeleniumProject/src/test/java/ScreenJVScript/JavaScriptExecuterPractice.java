package ScreenJVScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import utilities.Utils;

public class JavaScriptExecuterPractice extends Utils {

	public static void main(String[] args) {
	
		Utils.getBrowser("Chrome", "http://tek-school.com/retail/");
		
		WebElement searchField = driver.findElement(By.xpath("//input[@name='search']"));
		highlightelementBorderAndBackground(searchField);
		hardWait(2000);
		searchField.sendKeys("Cell Phone");
		hardWait(2000);
		JavascriptExecutor myJS = (JavascriptExecutor) driver;
		WebElement searchBttn= driver.findElement(By.xpath("//button[@type='button' and@class='btn btn-default btn-lg']"));
		hardWait(2000);
		highlightelementRedBorder(searchBttn);
		hardWait(2000);
		highlightelementBackground(searchBttn);
		hardWait(2000);
		myJS.executeScript("arguments[0].click;", searchBttn);
		hardWait(2000);
		scrolldownPage();
		
		
		hardWait(4000);
		tearDown();
		
		
		
		

	}

}
