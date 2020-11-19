package StepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginMultipleData {
	public WebDriver driver;
	@Given("user should have launched the application & present on home screen")
	public void user_should_have_launched_the_application_present_on_home_screen() {
		WebDriverManager.chromedriver().setup();
    	WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demowebshop.tricentis.com");
	}

	@When("valid username is {string} & password is {string} entered")
	public void valid_username_is_password_is_entered(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("clicked on login link")
	public void clicked_on_login_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("home screen with username should be get displayed")
	public void home_screen_with_username_should_be_get_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
