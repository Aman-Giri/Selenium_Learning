package seleniumWebdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationDemo {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Study Folder\\SOFTWARES\\BrowserDriver\\chromedriver.exe");
			
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.youtube.com");
		}
}
