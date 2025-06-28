package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import pageObjects.forgotPasswordPage;
import pageObjects.loginPage;
import stepDefinations.loginCredentials;
import stepDefinations.passwordPage;

public class testcontextSetup {
	public WebDriver driver;
	public aboutBrowser aboutBrowser;
	public loginPage loginPage;
	public forgotPasswordPage forgotPasswordPage;
	public commonUtils commonUtils;

	public testcontextSetup() throws IOException {
		FileInputStream file = new FileInputStream(
				"C:\\Users\\asus\\Desktop\\assesmentProject\\assignementProject\\src\\test\\java\\properties\\confi.properties");
		Properties pro = new Properties();
		pro.load(file);
		
		String browserName = pro.getProperty("browser");
		
		
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\asus\\Desktop\\assesmentProject\\assignementProject\\components\\drivers\\chromedriver-win64\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("edge")) {
//	System.setProperty("webdriver.edge.driver", "C:\\Users\\asus\\Desktop\\assesmentProject\\assignementProject\\components\\drivers\\chromedriver-win64\\chromedriver.exe");
			driver = new EdgeDriver();
		} else {
			System.out.println("Please specify browser name");
		}
		aboutBrowser = new aboutBrowser(driver);
		loginPage = new loginPage(driver);
		forgotPasswordPage = new forgotPasswordPage(driver);
		commonUtils = new commonUtils(driver);

	}
}
