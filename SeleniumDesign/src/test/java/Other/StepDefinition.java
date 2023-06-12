package Other;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	WebDriver driver;
	Actions a;
	ChromeOptions options;
	
	@Given("I landed in Gmail page")
	public void i_landed_in_gmail_page() {
	    
	}

	@Given("Log in to gmail with username testseleniumcucumber089 and password Test@{int}")
	public void log_in_to_gmail_with_username_testseleniumcucumber089_and_password_test(Integer int1) {
		String path = System.getProperty("user.dir");
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver", path+"//driver//chromedriver.exe");
		options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		a = new Actions(driver);
		driver.get("https://www.gmail.com/");
		driver.findElement(By.id("identifierId")).sendKeys("testseleniumcucumber089");
		driver.findElement(By.id("identifierId")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("Test@123");
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys(Keys.ENTER);		
	}

	@When("click on the compose button")
	public void click_on_the_compose_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Enter the Incubyte Deliverables:{int} and the Automation QA test for Incubyte in email and click send")
	public void enter_the_incubyte_deliverables_and_the_automation_qa_test_for_incubyte_in_email_and_click_send(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Validate the Incubyte Deliverables:{int} and the Automation QA test for Incubyte are displayed as expected")
	public void validate_the_incubyte_deliverables_and_the_automation_qa_test_for_incubyte_are_displayed_as_expected(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
