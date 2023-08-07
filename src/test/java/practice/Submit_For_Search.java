package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Submit_For_Search {
@Test
	public void m4() throws InterruptedException {
		// TODO Auto-generated method stub
		String key ="webdriver.chrome.driver";
		String value ="C:\\Users\\admin\\Downloads\\shobha\\New folder\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement searchTextField = driver.findElement(By.xpath("//input[@placeholder=\"Search Amazon.in\"]"));
		searchTextField.sendKeys("cycle");
		searchTextField.submit();
		Thread.sleep(1000);
		driver.close();

	}

}
