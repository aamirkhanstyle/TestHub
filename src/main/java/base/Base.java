package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver driver;
	public static Properties prop;
	static {
	
	try {
		FileInputStream file=new  FileInputStream("TestData/TestData.properties");
		 prop= new Properties();
		prop.load(file);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
/*	public static void setup() {
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
	} */
	public void mouseHover(WebElement ele) {
		Actions a=new Actions(driver);
				a.moveToElement(ele).build().perform();	}
	public void selectByVisibleText(WebElement ele,String value) {
		Select s=new Select(ele);
		s.selectByVisibleText(value);
		}
	public void selectByIndex(WebElement ele,int value) {
		Select s=new Select(ele);
		s.selectByIndex(value);
		}
	public void executorClick(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",element);
		}
	public void waitForExpectedElement(WebElement ele,int timeout) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	public void waitForElementClickable(WebElement ele,int timeout) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	public void selectJavaScripPopup(int timeout) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert a=driver.switchTo().alert();
		a.accept();
}
	public void getScreenshot() {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File scrFile=ts.getScreenshotAs(OutputType.FILE);
		try {
			//FileUtils.copyFile(scrFile, new File("Screenshots/Automation.png"));
			FileUtils.copyFile(scrFile, new File("Screenshots/"+System.currentTimeMillis()+".png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	//@After
	//public void tearDown(Scenario s) {
		//if(s.isFailed()) {
		//	getScreenshot();
		//}driver.quit();
	//}
	}
