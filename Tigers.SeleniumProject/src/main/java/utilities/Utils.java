package utilities;


import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utils {
	//We are declaring the WebDriver interface so that we can use it in all of our methods in Utils class
	//and by extending the Utils class, we can also use it in all of our test classes
	public static WebDriver driver;

	//This method will help us to launch browser and it takes two arguments (browserName and url)
	//we can call this method by using the class name (Utils) and (.) and (the method name)
	public static void getBrowser(String browserName, String url) {
		//we created a switch class so that we can handle and open different browsers as per our need and if browser name 
		//is misspelled or browser is not available in any of the cases of our switch statement, then chrome browser will be launched
		switch (browserName) {
		case "chrome":
			//by using webdriver manager, we don't have to worry about the version of our chromedriver is the same as the 
			//chrome browser
			WebDriverManager.chromedriver().setup();
			//we are using the reference to WebDriver interface and we create object of ChromeDriver();
			driver = new ChromeDriver();
			//we are using the reference to WebDriver and call the method get(); which will allow us to launch the url
			driver.get(url);
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get(url);
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get(url);
			break;
		default:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(url);
			
		}
		//by using the following line, we are using the manage() method, followed by window() method and then maximize() method
		//to maximize our current window. this is beneficial when we launch the browser and execute test, so that we can see the 
		//browser in full screen
		driver.manage().window().maximize();
		//selenium webdriver is giving us the advantage to use wait times while we are executing our test cases
		//and the reason we have these waits in selenium is because the webdriver will only handle the browser and will not 
		//interat with webelements, 
		//we we launch the browser and then close the browser, there are many other actions that we will need to perform to
		//execute our tests for example click on a button, send a text to a text box and etc...
		//the waits in selenium will help us to handle the webdriver and make sure it waits for some certain condition before 
		//moving to next step
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// delete all browser cookies
		driver.manage().deleteAllCookies();
	}
	//this method will help us to use hard wait during test execution if we need to debugg our test script
	//or if we want to pause our test execution for checking our test
	public static void hardWait(int timeUnit) {
		try {
			Thread.sleep(timeUnit);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	//by calling the below method, we will be able to close the current browser or browsers opened by selenium
	//close() => we use close() method to close only one browser that is opened by selenium
	//quit() => we use quit() method to close all browsers opened by selenium
	//With selenium, we can open either one or more than one window to execute our test, we will practice with multiple
	//browsers in the second week of selenium when we get to the windowHandle and windowsHanlde 
	public static void tearDown() {
		driver.close();
		driver.quit();
	}
	public static void clickOnRadioButton(WebElement element) {
		try {
			if(element.isDisplayed() == true && element.isEnabled() == true && element.isSelected() == false) {
				element.click();
			}else {
			System.out.println("One of the conditions did not return expected velue");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static boolean checkStatusOfRadioButton(WebElement element) {
		try {
			if(element.isDisplayed() == true && element.isEnabled() == true && element.isSelected() == false) {
				System.out.println("Radio button isDisplayed, isEnabled, and notSelected");
			}else {
				System.out.println("Checking status of Radio button/check box failed!!!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;	
	}
	// method for taking screenshots
		public static void takeScreenShot(String fileName) throws IOException {
			// we need to create a folder at project level and store the path here so that
			// when even we take screenshots, they are all saved in that specific folder
			String path = ".\\screenshots\\";
			// I create object of the file class
			File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			// After taking the screenshot, take the file and store it in a location in my
			// computer
			// and also I want to provide the file_name and the extension
			try {
				FileUtils.copyFile(file, new File(path + fileName + ".png"));
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("takeScreenshot: => Exception was throw during execution");
			}
		}
		
		/*
		 * The reason we use JSExecutor
		 * 1 - The web browser is implementing JavaScrip language and by using JSExecutor
		 * it is easy for JSExecutor to interact with element in the web browser
		 * 2 - When we do multi browser testing, we will be writing our locators
		 * (xpaths, cssSelector, etc...)
		 * but we will be collecting locator and use one browser (chrome), but when we
		 * execute our test in firefox, we may not be able to click or sendkeys or do some other actions,
		 * that is when we need JSExecutor
		*/

		// JSExecutor methods start
		// .click()
		// if the .click() does not work, then we get the help JSExecuter
		public static void clickWithJSE(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", element);
		}

		// How we can give border to an element on webpage
		public static void highlightelementRedBorder(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].style.border='2px solid red'", element);
		}

		// How we can highlight an element background
		public static void highlightelementBackground(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].style.background='yellow'", element);
		}

		// What if we want to do both/above with same method?
		// give border and highlith
		public static void highlightelementBorderAndBackground(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
		}

		// How we can scroll down the page with JSExecutor
		public static void scrolldownPage() {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			// from (0, 1000), you can modify the 100 field and scroll down the page as per
			// your testing needs
			js.executeScript("window.scrollBy(0, 1000)");
			// scroll all the way down the page
//			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		}

		// how to sendkeys with JSExecutor
		public static void sendKeys(WebElement element, String value) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].value='" + value + "'", element);
		}

		/**
		 * This method will select the value from static Dropdown by visible value
		 */
		public static void selectByVisibleText(WebElement element, String text) {
			Select select = new Select(element);
			select.selectByVisibleText(text);
		}

		/**
		 * This method will select value from static Dropdown by index
		 */
		public static void selectByIndex(WebElement element, int index) {
			Select select = new Select(element);
			select.selectByIndex(index);
		}

		/**
		 * This method will select value from static dropdown by value
		 */
		public static void selectByValue(WebElement element, String value) {
			Select select = new Select(element);
			select.selectByValue(value);
		}

		/**
		 * This method accepts alerts
		 */
		public static void acceptAlert() {
			driver.switchTo().alert().accept();
		}

		public static void dismissAlert() {
			driver.switchTo().alert().dismiss();
		}

		/**
		 * This method will switch webdriver from parent window to child
		 */
		public static void switchToWindow() {
			Set<String> WindowsHandles = driver.getWindowHandles();
			Iterator<String> it = WindowsHandles.iterator();
			String window = it.next();
			driver.switchTo().window(window);
		}

		/**
		 * This method will return text of element
		 */
		public static String getText(WebElement ele) {
			String ElementText = ele.getText();
			return ElementText;
		}

		/**
		 * This method will drag and drop using Actions class
		 */
		public static void dragAndDrop(WebElement sourceElement, WebElement targetElement) {
			Actions action = new Actions(driver);
			action.dragAndDrop(sourceElement, targetElement).perform();

		}
		public static void scrollDownPageNORA() {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0 ,200)");
		}

}