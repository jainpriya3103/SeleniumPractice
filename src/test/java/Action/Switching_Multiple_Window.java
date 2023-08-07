package Action;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Switching_Multiple_Window {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//a[.='Open New Seperate Windows']")).click();
		driver.findElement(By.xpath("(//button[contains(text(),'click')])[2]")).click();
		//driver.findElement(By.xpath("//a[.='Watch the Videos']")).click();
		Set<String> windowsList  = driver.getWindowHandles();
		for(String window:windowsList)
		{
			driver.switchTo().window(window);
			System.out.println(driver.getTitle());
			if (driver.getTitle().contains("selenium")) {
				break;
			}
		}
		driver.findElement(By.xpath("//a[.='Watch the Videos']")).click();
		for(String backToWindow:windowsList)
		{
			driver.switchTo().window(backToWindow);
			if (driver.getTitle().contains("Frames & windows")) {
				break;
			}
		}
	}

}
