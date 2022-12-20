package grouppractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadingWithFirefox {

	public static void main(String[] args) {
		
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "text/plain,application/pdf"); //the key should never change in setPrefrencess
		profile.setPreference("browser.download.manager.ShowWhenStarting", false);
		profile.setPreference("pdfjs.disabled", true); // this line is only for pdf
		
		FirefoxOptions option = new FirefoxOptions();
		option.setProfile(profile);
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver(option);
	
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		driver.findElement(By.id("textbox")).sendKeys("Marwaaa");
		driver.findElement(By.id("createTxt")).click();
		driver.findElement(By.id("link-to-download")).click();
		//this three line are for pdf files 
		driver.findElement(By.id("pdfbox")).sendKeys("Raihana");
		driver.findElement(By.id("createPdf")).click();
		driver.findElement(By.id("pdf-link-to-download")).click();
		
		driver.close();
		
		
		
		
		
		
		

	}

}
