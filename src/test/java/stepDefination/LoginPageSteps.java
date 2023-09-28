package stepDefination;

import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import page.LoginPage;

public class LoginPageSteps extends Base {
	//WebDriver driver;
	
	LoginPage login=new LoginPage();
	

//	@Given("User launch site URL")
//	public void user_launch_site_url() {
//		setup();
	/*	WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--incognito*");
	    driver = new ChromeDriver(options);
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); */
//	} 

	@When("User enter correct User and password")
	public void user_enter_correct_user_and_password() {
	/*	WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(userName));
		userName.sendKeys("standard_user");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");  */
		//login.user_enter_correct_user_and_password();
	}

	@And("user click on login button")
	public void user_click_on_login_button() {
	/*	WebElement loginBtn = driver.findElement(By.xpath("//input[@id='login-button']"));
		loginBtn.click();  */
		login.user_click_on_login_button();
	}

	@Then("Validate user navigate to home page")
	public void validate_user_navigate_to_home_page() { 

		assertTrue(driver.findElement(By.xpath("//span[@class='title']")).isDisplayed());	
		
	}
	@When("User enter correct {string} and {string}")
	public void user_enter_correct_and(String uname, String pass) {
		 login.user_enter_correct_user_and_password(uname, pass);  
		}
	@Before
	public static void setup() {
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--incognito");
		option.addArguments("-remote-allow-origins=*");
		driver=new ChromeDriver(option);}
		else if(browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions option=new FirefoxOptions();
			option.addArguments("--incognito");
			option.addArguments("-remote-allow-origins=*");
			driver=new FirefoxDriver(option);
		}else if(browserName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			EdgeOptions option=new EdgeOptions();
			option.addArguments("--incognito");
			option.addArguments("-remote-allow-origins=*");
			driver=new EdgeDriver(option);
			
		}
		//WebDriverManager.chromedriver().setup();
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--remote-allow-origins=*");
	//	options.addArguments("--incognito*");
	   // driver = new ChromeDriver(options);
		//driver.get("https://www.saucedemo.com/");
	    driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@After
		public void tearDown(Scenario s) {
			if(s.isFailed()) {
				getScreenshot();
			}
			driver.quit();
		} 

}
