package Other;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class JavaClass {

	public static void main(String[] args) throws InterruptedException {
		String path = System.getProperty("user.dir");
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver", path+"//driver//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		Actions a = new Actions(driver);
		driver.get("https://www.gmail.com/");
		driver.findElement(By.id("identifierId")).sendKeys("testseleniumcucumber089");
		driver.findElement(By.id("identifierId")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("Test@123");
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys(Keys.ENTER);		
		driver.findElement(By.xpath("//div[contains(text(),'Compose')]")).click();
	
		//div[contains(text(),'Send ‪(Ctrl-Enter)‬')]"
		a.moveToElement(driver.findElement(By.xpath("(//div[@name='to'])[1]"))).click().sendKeys("testseleniumcucumber089@gmail.com").build().perform();
		
		driver.findElement(By.name("subjectbox")).sendKeys("Incubyte Deliverables:1");		
		driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys("Automation QA test for Incubyte");
		
		a.keyDown(Keys.CONTROL).keyDown(Keys.ENTER).build().perform();
//		driver.close();

	}

}
