package Action;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Handle_Multiple_Window_Naukri_Com {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//div[.='Services']")).click();
		Set<String> windowsList = driver.getWindowHandles();
		for(String window:windowsList )
		{
			System.out.println(window);
			driver.switchTo().window(window);
			Thread.sleep(1000);
			//System.out.println(driver.getTitle());
			if (driver.getTitle().contains("Resume Writing Services - CV - Bio data | Naukri Fastforward")) {
				System.out.println(driver.getTitle());
				break;
			}
		}
		driver.findElement(By.xpath("//span[.='VALUE PLANS']")).click();

	}

}
