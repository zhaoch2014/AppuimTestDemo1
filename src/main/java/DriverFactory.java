import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {

    public static AppiumDriver  getInstance() throws MalformedURLException {
        AppiumDriver<MobileElement> dirver = null;
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("paltformName","Android");
        cap.setCapability("udid","ed687764");
        cap.setCapability("appPackage","com.tencent.wework");
        cap.setCapability("appActivity","com.tencent.wework/.launch.WwMainActivity");
        cap.setCapability("noReset","true");
        dirver  = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        return dirver;
    }

}

/**
 *
 *
 MobileElement el1 = (MobileElement) driver.findElementById("com.tencent.wework:id/hw4");
 el1.click();
 MobileElement el2 = (MobileElement) driver.findElementById("com.tencent.wework:id/i63");
 el2.click();
 MobileElement el4 = (MobileElement) driver.findElementById("com.tencent.wework:id/i6n");
 el4.click();
 MobileElement el5 = (MobileElement) driver.findElementById("com.tencent.wework:id/gpg");
 el5.sendKeys("鸡毛");
 MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.TextView[1]");
 el6.click();


 *
 *
 *
 */


