package Pop_Ups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Upload_File {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.foundit.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')]")).click();
		driver.findElement(By.cssSelector("#file-upload")).sendKeys("C:\\Users\\admin\\Downloads\\WebElementsNotes.txt");

	}

}
