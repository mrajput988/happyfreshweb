package happyfresh;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;


@SuppressWarnings("deprecation")
public class happyfresh_app {

	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{

    DesiredCapabilities ds = new DesiredCapabilities();
    ds.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
	ds.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
	ds.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9.0");
	ds.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Emulator");
//	ds.setCapability(MobileCapabilityType.APP,"D:\\happyfresh\\app-staging-debug.apk");
	ds.setCapability("appPackage","com.happyfresh.staging");
	ds.setCapability("appActivity","com.happyfresh.ui.module.splash.SplashActivity");
		
	URL url = new URL("http://localhost:4723/wd/hub/");
	
	//AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(url, ds);
	
	AndroidDriver <MobileElement> driver = new AndroidDriver<MobileElement>(url, ds);
	
	

//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	Thread.sleep(8000);
	
	driver.findElement(By.id("com.happyfresh.staging:id/ui_view_privacy_policy_button_agree")).click();
	Thread.sleep(15000);
	driver.findElement(By.id("com.happyfresh.staging:id/ui_view_next_on_boarding_button")).click();
	Thread.sleep(6000);
	driver.findElement(By.id("com.happyfresh.staging:id/ui_view_next_on_boarding_button")).click();
	Thread.sleep(6000);
	driver.findElement(By.id("com.happyfresh.staging:id/ui_view_next_on_boarding_button")).click();
	Thread.sleep(6000);
	driver.findElement(By.id("com.happyfresh.staging:id/ui_view_letsgo_on_boarding_button")).click();
	Thread.sleep(6000);
	driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
	Thread.sleep(20000);
	//driver.findElement(By.id("android:id/button2")).click();
	
	driver.findElement(By.id("com.happyfresh.staging:id/account_bottom_navigation")).click();
	Thread.sleep(5000);
	driver.findElement(By.id("com.happyfresh.staging:id/ui_view_user_info_email")).click();
	Thread.sleep(6000);
	driver.findElement(By.id("com.happyfresh.staging:id/signup")).click();
	
	Thread.sleep(3000);
	driver.findElement(By.id("com.happyfresh.staging:id/first_name")).sendKeys("Manoj");
	Thread.sleep(3000);
	driver.findElement(By.id("com.happyfresh.staging:id/last_name")).sendKeys("Singh");
	Thread.sleep(3000);
	driver.findElement(By.id("com.happyfresh.staging:id/edittext_email")).sendKeys("test@gmail.com");
	Thread.sleep(4000);
	driver.findElement(By.id("com.happyfresh.staging:id/edittext_password")).sendKeys("Test@1234");
	Thread.sleep(5000);
	driver.findElement(By.id("com.happyfresh.staging:id/sign_up")).click();
	
	Thread.sleep(4000);
	driver.findElement(By.id("com.happyfresh.staging:id/buttonDefaultPositive")).click();
	
	
	
	
	
//	AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(url, ds);

	}

}
