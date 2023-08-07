package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element_Is_Selected {

	public static void main(String[] args) {
		String key = "webdriver.chrome.driver";
		String value = "C:\\Users\\admin\\Downloads\\shobha\\New folder\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement remembermeCheckbox = driver.findElement(By.name("remember"));
		//remembermeCheckbox.click();
		if (remembermeCheckbox.isSelected()) {
			System.out.println("checked");
		}
		else
		{
			System.out.println("not checked");
		}
	}

}
