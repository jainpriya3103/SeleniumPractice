package Import_Data_From_External_Files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ImportDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		FileInputStream fis = new FileInputStream("C:\\Users\\admin\\OneDrive\\Desktop\\FileData.properties");
        Properties pro = new Properties();
        pro.load(fis);
        String url = pro.getProperty("Url");
        String userName = pro.getProperty("UserName");
        String password = pro.getProperty("Password");
        driver.get(url);
        driver.findElement(By.name("username")).sendKeys(userName,Keys.TAB,password,Keys.ENTER);
	}

}
