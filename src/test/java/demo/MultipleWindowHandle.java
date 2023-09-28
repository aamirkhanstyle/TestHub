package demo;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowHandle {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String parentWindowID = driver.getWindowHandle();
		System.out.println(parentWindowID);
		WebElement button4 = driver.findElement(By.xpath("//button[@id='newTabsBtn']"));
		button4.click();
		Set<String> childWindow = driver.getWindowHandles();
		for (String window : childWindow) {
			System.out.println(window);
			if (!parentWindowID.equals(window)) {
				driver.switchTo().window(window);

				String pageTitle = driver.getTitle();
				//if (pageTitle.contains("AlertDemo"));
				//WebElement clickMe = driver.findElement(By.xpath("//button[@id='alertBox']"));
				//clickMe.click();
				//Alert a =driver.switchTo().alert();
				//a.accept();
				if (pageTitle.contains("Basic Controls"));
				
				WebElement AlertBox = driver.findElement(By.xpath("//input[@id='firstName']"));
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
				wait.until(ExpectedConditions.visibilityOf(AlertBox));
				AlertBox.sendKeys("aamir");

				break;
}
}
	}
}