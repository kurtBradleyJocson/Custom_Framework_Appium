package test_ios_suite;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.*;

import com.relevantcodes.extentreports.LogStatus;

import common.Config;
import common.Config_IOS;
import instance_initiator.Android;
import instance_initiator.IOS;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import object_repo.IOSGestures;
import object_repo.TestCase_IOS_BaseClass;
import util.GenerateReport;
import util.ScreenShot_Handler;

public class TestCase_UICatalog_UI_01 extends TestCase_IOS_BaseClass{
	
	IOS ios;
	IOSDriver driver;
	
	IOSGestures gesture;
	
	@Test(priority = 0)
	public void UI_01_step01() {
		
		ios = new IOS("UI_01");
		
		driver = ios.getDriver();

		gesture = new IOSGestures(driver);
		
		ios.testResults(LogStatus.PASS, "UI_01_step01 - Launch App initiliazed through extended BaseClass");

	}

	@Test(priority = 1)
	public void UI_01_step02() {

		WebElement stackViews = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeWindow"));
		
		RemoteWebElement anchor = (RemoteWebElement) stackViews;
		
		gesture.scroll("down", anchor, 1);
		
		screenShot = new ScreenShot_Handler(driver, "Appium_Framework_v2");
		
		ios.testResults(LogStatus.PASS, "UI_01_step02");

	}

	@Test(priority = 2)
	public void UI_01_step03(){

		List<WebElement> options = driver.findElements(AppiumBy.xpath("//XCUIElementTypeButton[@name='chevron']"));
		
		screenShot = new ScreenShot_Handler(driver, "Appium_Framework_v2");
		
		ios.testResults(LogStatus.PASS, "UI_01_step03");
		
		GenerateReport.closeExtentReports();
		
	}

}
