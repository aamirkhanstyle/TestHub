package demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		String parentWindowID = driver.getWindowHandle();
		System.out.println(parentWindowID);
		WebElement button1 = driver.findElement(By.xpath("//button[@ id='newWindowBtn'] "));
		button1.click();
		Set<String> childWindow = driver.getWindowHandles();
		for (String window : childWindow) {
			System.out.println(window);
			if (!parentWindowID.equals(window)) {
				driver.switchTo().window(window); 
				//driver.switchTo().frame(0);
				break;
			}
		}
		WebElement FirstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		FirstName.sendKeys("test");
		driver.close();
		driver.switchTo().window(parentWindowID);
		
		WebElement parentInput = driver.findElement(By.xpath("//input[@id='name']"));
		parentInput.sendKeys("Automation");
}}
