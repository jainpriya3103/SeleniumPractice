package practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args)
	
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://whizitglobal.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("alert('hello world');");
	}
}
