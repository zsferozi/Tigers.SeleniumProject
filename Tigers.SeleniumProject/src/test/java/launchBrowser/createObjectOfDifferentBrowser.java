package launchBrowser;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class createObjectOfDifferentBrowser {

	public static void main(String[] args) {
	
		//serchContext interface
		//WebDriver interface
		//RemoteWebDriver class
		//ChromeDriver class
		//edgeDriver class

		
	// will these work?
		
		//SerchContext driver = new chromeDriver();?
		//RemoteWebDriver driver = new ChromeDriuver();?
		//ChromeDriver driver = new ChromeDriver()?
		// answer is yes the will work
		
		// if we use this we will have only access to two methods which is findElement and findElements 
		//we wont use SeachContext since we will loses access to other methods
		SearchContext driver2 = new ChromeDriver();
		//RemoteWebDriver is used mainly when use the Selenium grid and do parallel test execution on multiple platforms
		RemoteWebDriver driver3 = new ChromeDriver();
		// If we use following method to create object of chromeDriver we will not be able to change the Browser class if need to be change in future
		ChromeDriver driver = new ChromeDriver();
		
		WebDriver driver1 = new ChromeDriver();
        driver1.get("URL");
	}

}
