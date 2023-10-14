package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon1 {
	
	public WebDriver driver;
	
	@Given("User launches amazon home page")
	public void user_launches_amazon_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.amazon.in/");
	}
	@Given("User clicks on mobile")
	public void user_clicks_on_mobile() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
	    
	}
	@When("User navigates to accesories and clicks powerbank")
	public void user_navigates_to_accesories_and_clicks_powerbank() {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//li[@class='a-tab-heading htw-tab-heading'][1]/a")).click();
		
		driver.findElement(By.xpath("//a[@id='nav-cart']")).click();
	   
	}
	
}
