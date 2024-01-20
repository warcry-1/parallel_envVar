package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon2 {
	
	public WebDriver driver;
	
	@Test
	public void user_launches_amazon_home_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
//	    WebDriverManager.chromedriver().setup();
//	    driver = new ChromeDriver();
//	    driver.manage().window().maximize();
//	    driver.get("https://www.flipkart.com");
//	    Thread.sleep(5000);
//	    System.out.println("Second one has started");
		
		String e1 = System.getenv("env1");
		//String e2 = System.getenv("env2");
		String e2 =System.getProperty("env2");
		System.out.println(e1+" hahahahahahhahah");
		
		System.out.println(e2+" hahahahahahhahah");
		
		
	}

}
