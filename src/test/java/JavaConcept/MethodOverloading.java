package JavaConcept;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.Base;

public class MethodOverloading extends Base {

public void test() {
		
	}
	public void test(int i) {
		
	}
	public void test(int i,int j) {
		 
	}
	public void mouseHover(WebElement ele) {
		Actions a=new Actions(driver);
				a.moveToElement(ele).build().perform();	}
	
}
