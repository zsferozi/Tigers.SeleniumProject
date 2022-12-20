package launchBrowser;

import utilities.Utils;

public class LaunchBrowser extends Utils{

	public static void main(String[] args) {

		Utils.getBrowser("chrome", "https://www.facebook.com/");
		
		
		
		
		
		
		Utils.hardWait(6000);
		Utils.tearDown();

	}

}
