package cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {
public WebDriver driver;
	
	@Test(priority = 1)
	public void op_driver() throws Exception{

		System.setProperty("webdriver.chrome.driver","./driver//chromedriver.exe");
				
				driver = new ChromeDriver();
				driver.manage().window().maximize();				
				driver.get("https://www.facebook.com/");
				Thread.sleep(2000);
				driver.close();
				
				}
}
