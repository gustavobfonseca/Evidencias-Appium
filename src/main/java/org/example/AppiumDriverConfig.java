package org.example;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumDriverConfig {

    public final AppiumDriver driver;
    private static AppiumDriverConfig _instance;

    public static AppiumDriverConfig Instance(){
        if(AppiumDriverConfig._instance == null){
            AppiumDriverConfig._instance = new AppiumDriverConfig();
        }
        return AppiumDriverConfig._instance;
    }
    public AppiumDriverConfig(){
        DesiredCapabilities config = new DesiredCapabilities();
        config.setCapability("appPackage", "SEU-APP");
        config.setCapability("appActivity", "SEU-APP");
        config.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        config.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        config.setCapability(MobileCapabilityType.UDID, "SEU_UD_ID");
        config.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13");


        URL urlConexao = null;
        try {
            urlConexao = new URL("http://127.0.0.1:4723");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        driver = new AppiumDriver<>(urlConexao, config);
    }
}
