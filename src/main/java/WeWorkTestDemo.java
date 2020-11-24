import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class WeWorkTestDemo {
    @Test
    public void setup() throws MalformedURLException, InterruptedException {
//        AppiumDriver driver = DriverFactory.getInstance();
//
//        MobileElement el1 = (MobileElement) driver.findElementById("com.tencent.wework:id/hw4");
//        el1.click();
//        MobileElement el2 = (MobileElement) driver.findElementById("com.tencent.wework:id/i63");
//        el2.click();
//        MobileElement el4 = (MobileElement) driver.findElementById("com.tencent.wework:id/i6n");
//        el4.click();
//        MobileElement el5 = (MobileElement) driver.findElementById("com.tencent.wework:id/gpg");
//        el5.sendKeys("鸡毛");
//        MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.TextView[1]");
//        el6.click();
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName","android");
        //desiredCapabilities.setCapability("deviceName","emulator-5554");
        desiredCapabilities.setCapability("udid","ed687764");
        desiredCapabilities.setCapability("appPackage","com.tencent.wework");
        desiredCapabilities.setCapability("appActivity",".launch.LaunchSplashActivity");
        desiredCapabilities.setCapability("noReset","true");


        AppiumDriver<MobileElement> driver = new AppiumDriver<MobileElement>(
                new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities);

        driver.findElement(MobileBy.id("beh")).click();
        Thread.sleep(3000);
        driver.findElement(MobileBy.id("i63")).click();

//        MobileElement el1 = (MobileElement) driver.findElementById("com.tencent.wework:id/hw4");
//        el1.click();
//        MobileElement el2 = (MobileElement) driver.findElementById("com.tencent.wework:id/i63");
//        el2.click();
//        MobileElement el4 = (MobileElement) driver.findElementById("com.tencent.wework:id/i6n");
//        el4.click();
//        MobileElement el5 = (MobileElement) driver.findElementById("com.tencent.wework:id/gpg");
//        el5.sendKeys("鸡毛");
//        MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.TextView[1]");
//        el6.click();



    }
}
