
package Base;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utils {
	
	public static WebDriver driver;
	
	public static void openBrowser(String browserName, String url) {
		
	if(browserName.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
	}else if(browserName.equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get(url);
	}else if(browserName.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();
		driver.get(url);
	}else {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get(url);
			
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	}
	
	public static void toSleep(int timeUnit) {
		try {
			Thread.sleep(timeUnit);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
    public static void close() {
    	driver.close();
    	driver.quit();
    }
    
    public static void toNextWindow() { 
    Set<String> allWindows = driver.getWindowHandles();
    Iterator <String> i = allWindows.iterator();
    while(i.hasNext()) {
    	String nextWindow =i.next();
    	driver.switchTo().window(nextWindow);
    	try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	String parentWindow= i.next();
    	driver.switchTo().window(parentWindow);
    	
    }	
    }
   
    
    
    
    
    	
    }
    
	


