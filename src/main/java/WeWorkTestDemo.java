import io.appium.java_client.AppiumDriver;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class WeWorkTestDemo {
    @Test
    public void setup() throws MalformedURLException {
        AppiumDriver driver = DriverFactory.getInstance();
        driver.findElements(By.id("hw4"));
    }
}
