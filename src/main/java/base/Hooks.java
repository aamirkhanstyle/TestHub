package base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends Base{
/*	@Before
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
		}    */

}
