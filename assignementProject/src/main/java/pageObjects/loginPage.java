package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginPage {
	public WebDriver driver;

	public loginPage(WebDriver driver) {
		this.driver = driver;
	}
	//List of elements present on page
	By userName = By.xpath("//*[@id='fullName']");
	By password = By.xpath("//*[@id='Password']");
	By signInBtn = By.xpath("//*[@class='btn text-uppercase loginbtn fw-700']");
	By forgotPassword = By.xpath("//a[@class='forgottext float-end c-pointer']");

	//method for verify page
	public void verifyPage() {
		System.out.println(driver.getTitle());
		
	}
	//method f/or user name
	public WebElement username() {
		WebElement usernameTab = driver.findElement(userName);
		return usernameTab;

	}
	//method for password
	public WebElement password() {
		WebElement passwordTab = driver.findElement(password);
		return passwordTab;

	}
	//method for sign in
	public WebElement signin() {
		WebElement singinBtn = driver.findElement(signInBtn);
		return singinBtn;

	}
	//method for title
	public void getTitle() {
		String pageTitle = driver.getTitle();
		System.out.println("page Title : " + pageTitle);

	}
	//method for error message
	public void captureErrorMeaasge() {

		try {
			WebElement messagePopup = driver.findElement(By.xpath("//div[@class='p-toast-detail ng-tns-c14-11']"));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(messagePopup));
			System.out.println("Error message : " + messagePopup.getText());
		} catch (Exception e) {
			System.out.println("No error message appeared or it disappeared too quickly.");
		}

	}
	//method for forgot password
	public void forgotPassword() {
		driver.findElement(forgotPassword).click();

	}

}
