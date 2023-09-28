 package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrapDropdown {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.manage().window().maximize();
		WebElement dropBtn=driver.findElement(By.xpath("//button[@id='menu1']"));
		dropBtn.click();
		List<WebElement>DropdownList=driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
		//int l=DropdownList.size();
		int size=DropdownList.size();
		System.out.println(size);
		for(WebElement ele:DropdownList) {
			String value=ele.getText();
			if(value.equals("About Us")) {
		
				ele.click();
				break;
			}

}
		for(int i=0;i<1;i++) {
			String value=DropdownList.get(i).getText();
			if(value.equals("About Us")) {
				DropdownList.get(i).click();
				break;
			}
}}}
