package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import POM.LoginPage;

public class Test0 {
@Test
	public  void m2() throws IOException {
		
		FileInputStream fip = new FileInputStream(".\\FileData.properties");
		Properties pobj = new Properties();
		pobj.load(fip);
		String userName = pobj.getProperty("UserName");
		String password = pobj.getProperty("Password");
		String url = pobj.getProperty("Url");
		String key = "webdriver.chrome.driver";
		String value = "C:\\Users\\admin\\Downloads\\shobha\\New folder\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		LoginPage login = new LoginPage(driver);
		login.loginToApp(userName, password);

	}

}
