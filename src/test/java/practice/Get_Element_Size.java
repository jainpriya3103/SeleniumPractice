package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Element_Size {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String key ="webdriver.chrome.driver";
		String value ="C:\\Users\\admin\\Downloads\\shobha\\New folder\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		WebElement KanadaElement =driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
		Dimension kanadaSize = KanadaElement.getSize();
		System.out.println(kanadaSize);
		System.out.println("width "+kanadaSize.getWidth());
		System.out.println("height "+kanadaSize.getHeight());
		

	}

}
