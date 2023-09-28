package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptPopup {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	options.addArguments("--incognito");
	WebDriver driver=new ChromeDriver(options);
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	driver.manage().window().maximize();
	WebElement ele=driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
	ele.click();
	Alert a=driver.switchTo().alert();
	String s=a.getText();
	System.out.println(s);
	a.sendKeys("Aamir khan");
	a.accept();
//a.dismiss();
}
}
