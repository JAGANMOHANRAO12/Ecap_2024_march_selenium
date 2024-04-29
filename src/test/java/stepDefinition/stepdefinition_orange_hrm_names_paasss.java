package stepdefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class stepdefinition_orange_hrm_names_paasss {
	WebDriver driver;
	
	@Given("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		}

	

@When("user enters username as {string} and password as {string}")
public void user_enters_username_as_and_password_as(String un, String pass) {
	driver.findElement(By.name("username")).sendKeys(un);
	driver.findElement(By.name("password")).sendKeys(pass);
}

	
	@When("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	    	}
	@Then("user should navigate to homepage")
	public void user_should_navigate_to_homepage() {
		System.out.print("user is on home page");
	   	}
}
