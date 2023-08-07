package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_DOM_Attribute {

	public static void main(String[] args) {
		String key = "webdriver.chrome.driver";
		String value = "C:\\Users\\admin\\Downloads\\shobha\\New folder\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
        WebElement passwordElement = driver.findElement(By.xpath("//input[@type='password']"));
        String domAttributeValue = passwordElement.getDomAttribute("class");
        System.out.println(domAttributeValue);

	}

}
