package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestScript_Amazon {
@Test
	public  void m3() {
		// TODO Auto-generated method stub
	String key = "webdriver.chrome.driver";
	String value = "C:\\Users\\admin\\Downloads\\shobha\\New folder\\chromedriver.exe";
	System.setProperty(key, value);
	WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone12");

	}

}
