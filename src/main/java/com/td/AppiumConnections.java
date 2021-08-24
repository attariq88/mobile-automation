package com.td;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumConnections {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"6efae349");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10");
        capabilities.setCapability(MobileCapabilityType.APP_PACKAGE,"com.tdbank");
        capabilities.setCapability(MobileCapabilityType.APP_ACTIVITY,"com.td.dcts.android.us.app.SplashScreenActivity");

        AppiumDriver appiumDriver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"),capabilities);

        System.out.println(appiumDriver.getPageSource());

        Thread.sleep(2000);
        appiumDriver.findElement(By.xpath("//android.widget.Button[@text='ACCOUNTS']")).click();
        Thread.sleep(2000);

    }
}
