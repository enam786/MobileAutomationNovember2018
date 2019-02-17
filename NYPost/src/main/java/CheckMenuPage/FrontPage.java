package CheckMenuPage;


import java.net.URL;
import java.net.MalformedURLException;

import common.Base;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities;

    public class FrontPage extends Base {

        public static String userName = "mdenam1";
        public static String accessKey = "thdwTVvpacdqMxzHZYF1";

        public static void main(String args[]) throws MalformedURLException, InterruptedException {
            DesiredCapabilities caps = new DesiredCapabilities();

            caps.setCapability("device", "Google Nexus 6");
            caps.setCapability("os_version", "6.0");
            caps.setCapability("AutomationName", "UIAutomator");
            caps.setCapability("app", "bs://<#bs://cbf10f84a684ef6ce8f7b82786f6f22c2ae93d30>");

            AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), caps);

            AndroidElement searchElementContinue = (AndroidElement) new WebDriverWait(driver, 30).until(
                    ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("br.com.golmobile.nypost:id/welcome_continue")));
            searchElementContinue.click();

            AndroidElement searchElementMenu = (AndroidElement) new WebDriverWait(driver, 30).until(
                    ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.widget.ImageButton[@content-desc=\"Menu\"]")));
            searchElementMenu.click();

            AndroidElement menuSearchBox = (AndroidElement) new WebDriverWait(driver, 30).until(
                    ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("br.com.golmobile.nypost:id/search_container")));
            menuSearchBox.click();
            menuSearchBox.sendKeys("New York", Keys.ENTER);

            AndroidElement topNews = (AndroidElement) new WebDriverWait(driver, 30).until(
                    ExpectedConditions.elementToBeClickable(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.ViewAnimator/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[2]\")")));
            topNews.click();

            AndroidElement menuNews = (AndroidElement) new WebDriverWait(driver, 30).until(
                    ExpectedConditions.elementToBeClickable(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]\")")));
            menuNews.click();

            AndroidElement notification = (AndroidElement) new WebDriverWait(driver, 30).until(
                    ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("br.com.golmobile.nypost:id/turn_on_notifications_item")));
            notification.click();

            AndroidElement newsLetters = (AndroidElement) new WebDriverWait(driver, 30).until(
                    ExpectedConditions.elementToBeClickable(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.TextView\")")));
            newsLetters.click();

            AndroidElement emailInput = (AndroidElement) new WebDriverWait(driver, 30).until(
                    ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("contact_fields_email")));
            emailInput.click();

            AndroidElement sports = (AndroidElement) new WebDriverWait(driver, 30).until(
                    ExpectedConditions.elementToBeClickable(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[5]")));
            sports.click();

            AndroidElement pageSix = (AndroidElement) new WebDriverWait(driver, 30).until(
                    ExpectedConditions.elementToBeClickable(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[4])")));
            pageSix.click();

            AndroidElement busines = (AndroidElement) new WebDriverWait(driver, 30).until(
                    ExpectedConditions.elementToBeClickable(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[6])")));
            busines.click();

            AndroidElement opinion = (AndroidElement) new WebDriverWait(driver, 30).until(
                    ExpectedConditions.elementToBeClickable(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[7])")));
            opinion.click();

            AndroidElement entertainment = (AndroidElement) new WebDriverWait(driver, 30).until(
                    ExpectedConditions.elementToBeClickable(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[2]")));
            entertainment.click();

            AndroidElement sportTitle = (AndroidElement) new WebDriverWait(driver, 30).until(
                    ExpectedConditions.elementToBeClickable(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[1]")));
            sportTitle.click();

            AndroidElement sportsLatestNews = (AndroidElement) new WebDriverWait(driver, 30).until(
                    ExpectedConditions.elementToBeClickable(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[2]")));
            sportsLatestNews.click();

            AndroidElement living = (AndroidElement) new WebDriverWait(driver, 30).until(
                    ExpectedConditions.elementToBeClickable(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[1]")));
            living.click();

            AndroidElement breakingNewsNotification = (AndroidElement) new WebDriverWait(driver, 30).until(
                    ExpectedConditions.elementToBeClickable(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.Switch\")")));
            breakingNewsNotification.click();







//            AndroidElement insertTextElement = (AndroidElement) new WebDriverWait(driver, 30).until(
//                    ExpectedConditions.elementToBeClickable(MobileBy.id("org.wikipedia.alpha:id/search_src_text")));
//            insertTextElement.sendKeys("BrowserStack");
//            Thread.sleep(5000);
//
//            List<AndroidElement> allProductsName = driver.findElementsByClassName("android.widget.TextView");
//            assert(allProductsName.size() > 0);

            driver.quit();
        }
}
