package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Element_Location {

	public static void main(String[] args) {
		String key ="webdriver.chrome.driver";
		String value ="C:\\Users\\admin\\Downloads\\shobha\\New folder\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		WebElement marathiElement =driver.findElement(By.xpath("//a[@title='Marathi']"));
		
	   Point location =	marathiElement.getLocation();
	   System.out.println(location);
	   System.out.println("x coordinate value" +location.getX());
	   System.out.println("y coordinate value" +location.getY());
	}

}
