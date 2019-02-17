
import java.net.URL;
import java.util.List;
import java.net.MalformedURLException;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

    public class bstk {
        public static String accessKey = "thdwTVvpacdqMxzHZYF1";
        public static String userName = "mdenam1";

        public static void main(String args[]) throws MalformedURLException, InterruptedException {
            DesiredCapabilities caps = new DesiredCapabilities();

            caps.setCapability("device", "Google Nexus 6");
            caps.setCapability("os_version", "6.0");
            caps.setCapability("app", "bs://<#bs://cbf10f84a684ef6ce8f7b82786f6f22c2ae93d30>");


            IOSDriver driver = new IOSDriver(new URL("http://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), caps);

            IOSElement textButton = (IOSElement) new WebDriverWait(driver, 30).until(
                    ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("br.com.golmobile.nypost:id/welcome_continue")));
            textButton.click();
            IOSElement textInput = (IOSElement) new WebDriverWait(driver, 30).until(
                    ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Text Input")));
            textInput.sendKeys("hello@browserstack.com");

            driver.findElementByAccessibilityId("Next").click();
            Thread.sleep(5000);

            IOSElement textOutput = (IOSElement) new WebDriverWait(driver, 30).until(
                    ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Text Output")));

            if(textOutput != null && textOutput.getText().equals("hello@browserstack.com"))
                assert(true);
            else
                assert(false);

            driver.quit();
        }
    }

