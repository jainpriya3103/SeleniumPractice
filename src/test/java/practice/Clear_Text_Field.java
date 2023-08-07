package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear_Text_Field {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String key ="webdriver.chrome.driver";
		String value ="C:\\Users\\admin\\Downloads\\shobha\\New folder\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement usernameTextField = driver.findElement(By.cssSelector("input#username"));
		usernameTextField.sendKeys("admin");
		Thread.sleep(1000);
		usernameTextField.clear();
	}

}
