package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Page Objects for forgot page
public class forgotPasswordPage {
WebDriver driver;
public forgotPasswordPage(WebDriver driver) {
	this.driver=driver;
}
//List of elements present on page
By username = By.xpath("//input[@id='fullName']");
By sendBtn = By.xpath("//button[@class='btn text-uppercase loginbtn fw-700']"); 

//method for userName
public WebElement username() {
	 WebElement usernameTab = driver.findElement(username);
	return usernameTab;
	
}
//method for submit
public void submit() {
	driver.findElement(sendBtn).click();
}

//method for error message
public void errorMessage() {
	try {
		WebElement errorMsgPopup = driver.findElement(By.xpath("//div[@class='p-toast-detail ng-tns-c14-14']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(errorMsgPopup));
		System.out.println("Error message : " + errorMsgPopup.getText());
	} catch (Exception e) {
		System.out.println("No error message appeared or it disappeared too quickly.");
	}

}
}
