package cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Test1 {
public WebDriver driver;
	
	@Test(priority = 1)
	public void test1() throws Exception{
		System.out.println("Test case running");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		System.setProperty("webdriver.chrome.driver","./driver//chromedriver.exe");
				
				driver = new ChromeDriver(options);
				driver.manage().window().maximize();				
				driver.get("https://www.facebook.com/");
				Thread.sleep(2000);
				driver.close();
				
				}
}
