package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookXpathAndCSS {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//tagname[@attribute='value']---xpath
		//tagname[contains(@attribute,'value')]---regular xpath expression
		
		driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("navjeet");
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("navjeet");
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//tagname[attribute='value']---css
		//tagname#id---css
		//tagname.classname---css
		
		//tagname[attribute*='value']---regular css expression
		
	//driver.findElement(By.cssSelector("input[id='email']")).sendKeys("navjeet");
		driver.findElement(By.cssSelector("input[type*='password']")).sendKeys("navjeet");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		driver.close();
		
		
		
		

	}

}
