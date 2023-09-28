package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsEvents {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.browserstack.com/?utm_source=google&utm_medium=cpc&utm_platform=paidads&utm_content=583610946675&utm_campaign=Search-Brand-India&utm_campaigncode=BrowserStack-Alpha+9144441&utm_term=e+browserstack&gclid=Cj0KCQjwuLShBhC_ARIsAFod4fKXVhADic0RJRX6aM2xPN3_sj7YitBkn4gjfNmJHt4fgqukfxAAXxAaAp1iEALw_wcB");
		driver.manage().window().maximize();
		WebElement productLink=driver.findElement(By.xpath("//button[@id='product-menu-toggle']"));
	
		WebElement liveMenu=driver.findElement(By.xpath("//a[@class='menu-item-live']"));
		
		//Actions a=new Actions(driver);
		
	
		productLink.click();
		//a.doubleClick();
		//a.contextClick();
		//a.click();
		//a.dragAndDrop(searchIcon, searchInput); 
//a.moveToElement(productLink);
//a.click(liveMenu).build().perform();
WebElement searchIcon=driver.findElement(By.xpath("//button[@class='doc-search-menu dropdown-toggle doc-search-cta doc-search-menu-icon doc-menu-toggle']"));
searchIcon.click();
WebElement searchInput=driver.findElement(By.xpath("//input[@class='ais-SearchBox-input']"));
searchInput.sendKeys("test");
Actions a=new Actions(driver);
a.sendKeys(Keys.ENTER).build().perform();

}
}