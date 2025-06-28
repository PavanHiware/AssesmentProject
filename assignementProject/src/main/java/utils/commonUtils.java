package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class commonUtils {
	WebDriver driver;

	public commonUtils(WebDriver driver) {
		this.driver = driver;
	}

	public long startTime() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		long startTiming = (long) js.executeScript("return window.performance.timing.navigationStart;");
		return startTiming;
	}

	public long currentTime() {
		long currentTiming = System.currentTimeMillis();
		return currentTiming;
	}

	public void totalTime() {
		commonUtils cu = new commonUtils(driver);
		long start = cu.startTime();
		long end = cu.currentTime();
		long totalTiming = end - start;
		System.out.println("total time taken : " + totalTiming + " ms");

	}

	public void captureScreenshot(String function) {
		Date date = new Date();
		String filename = "screenshot_" + function + "_" + date.toString().replace(" ", "_").replace(":", "_");
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		File destiPath = new File(
				"C:\\Users\\asus\\Desktop\\assesmentProject\\assignementProject\\target\\screenshots\\" + filename
						+ ".png");
		try {
			FileUtils.copyFile(screenshot, destiPath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
