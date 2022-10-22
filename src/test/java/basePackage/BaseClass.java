package basePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver openChromeBrowser() {

		System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://login.efficiently.com/login");
		return(driver);
	}

}
