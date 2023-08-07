package Pop_Ups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Handle_Calender_PopUp {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[.='Departure']")).click();
		driver.findElement(By.xpath("//div[.='May 2023']/ancestor::div[@class='DayPicker-Month']/descendant::p[.='18']")).click();

	}

}
