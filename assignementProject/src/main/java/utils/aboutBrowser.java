package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class aboutBrowser {
	WebDriver driver;
	public aboutBrowser(WebDriver driver) {
		this.driver=driver;
	}


	public void openBrowser() throws IOException {
		FileInputStream file = new FileInputStream(
				"C:\\Users\\asus\\Desktop\\assesmentProject\\assignementProject\\src\\test\\java\\properties\\confi.properties");
		Properties pro = new Properties();
		pro.load(file);
		String url = pro.getProperty("baseURL");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		
	}
	
	public void teardown() {
		driver.close();
		
	}

}
