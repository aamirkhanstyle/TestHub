package page;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import base.Base;


public class LoginPage extends Base {
	  
	public void user_enter_correct_user_and_password(String uname,String pass) {
		WebElement logo=driver.findElement(By.xpath("//div[@class='login_logo']"));
		String logoText=logo.getText();
		
		assertEquals("Swag Labs", logoText);
		//getScreenshot();
		WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
		waitForExpectedElement(userName, 10);
		//WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(15));
		//wait.until(ExpectedConditions.visibilityOf(userName));
		// userName.sendKeys(prop.getProperty("username"));
		userName.sendKeys(uname);
		//userName.sendKeys("standard_user");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys(pass);
		//password.sendKeys(prop.getProperty("password"));
		//password.sendKeys("secret_sauce");
		//getScreenshot();
	}

	public void user_click_on_login_button() {
		WebElement loginBtn = driver.findElement(By.xpath("//input[@id='login-button']"));
		try{mouseHover(loginBtn);
		loginBtn.click();
	} catch(Exception e) {
		executorClick(loginBtn);
	}
		//loginBtn.click();
		
		
	}
}
