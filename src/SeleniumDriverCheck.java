import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumDriverCheck {
	@Test
	public void driverCheck() {
		WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "D:\\Drivers N Jars\\geckodriver.exe");
		driver.get("https://www.google.co.in");
		driver.quit();
		
		
	}

}
