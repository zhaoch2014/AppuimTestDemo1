import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {
    public static AppiumDriver  getInstance() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("paltformName","Android");
        cap.setCapability("udid","ed687764");
        cap.setCapability("appPackage","com.tencent.wework");
        cap.setCapability("appActivity","com.tencent.wework/.launch.LaunchSplashActivity");
        cap.setCapability("noReset","true");
        AppiumDriver<MobileElement> dirvier  = new AppiumDriver<MobileElement>(new URL(""), cap);
        return dirvier;
    }

}


