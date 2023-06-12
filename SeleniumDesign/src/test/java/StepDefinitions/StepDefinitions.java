package StepDefinitions;

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

public class StepDefinitions {
	WebDriver driver;
	Actions a;
	ChromeOptions options;
	
	@Given("I landed in Gmail page")
	public void i_landed_in_gmail_page() {
		String path = System.getProperty("user.dir");
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver", path+"//driver//chromedriver.exe");
		options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--incognito");
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		a = new Actions(driver);
		driver.get("https://www.gmail.com/");
	}

	@Given("Log in to gmail with username testseleniumcucumber089 and password Test@{int}")
	public void log_in_to_gmail_with_username_testseleniumcucumber089_and_password_test(Integer int1) {
		
		driver.findElement(By.id("identifierId")).sendKeys("testseleniumcucumber089");
		driver.findElement(By.id("identifierId")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("Test@123");
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys(Keys.ENTER);		
	}

	@When("click on the compose button")
	public void click_on_the_compose_button() {
		driver.findElement(By.xpath("//div[contains(text(),'Compose')]")).click();
	}

	@When("Enter the Incubyte Deliverables:{int} and the Automation QA test for Incubyte in email and click send")
	public void enter_the_incubyte_deliverables_and_the_automation_qa_test_for_incubyte_in_email_and_click_send(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		a.moveToElement(driver.findElement(By.xpath("(//div[@name='to'])[1]"))).click().sendKeys("testseleniumcucumber089@gmail.com").build().perform();
		
		driver.findElement(By.name("subjectbox")).sendKeys("Incubyte Deliverables:1");		
		driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys("Automation QA test for Incubyte");
		a.keyDown(Keys.CONTROL).keyDown(Keys.ENTER).build().perform();
		driver.close();
	}


}

