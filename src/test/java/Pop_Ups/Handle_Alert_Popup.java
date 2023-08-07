package Pop_Ups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Handle_Alert_Popup {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
		driver.findElement(By.linkText("Types of Work")).click();
        driver.findElement(By.xpath("//span[.='Create Type of Work']")).click();
        driver.findElement(By.name("name")).sendKeys("selenium");
        driver.findElement(By.xpath("//input[contains(@value,' Cancel')]")).click();
        Alert alt = driver.switchTo().alert();
        //to accept
        //alt.accept();
        //to cancel
        alt.dismiss();
        
	}

}
