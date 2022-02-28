package ozdilek.appium;

import com.thoughtworks.gauge.Step;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import ozdilek.appium.driver.wait.Wait;

public class BasePage extends BaseTest {

    public static final Logger logger = LogManager.getLogger(BasePage.class);


    @Step("<wait> saniye kadar bekle")
    public void waitForSeconds(int wait){
        Wait.waitSeconds(3);
    }

    @Step("id<id> li elemente tıklanır")
    public void clickById(String id) {
        appiumDriver.findElement(By.id(id)).click();
        logger.info("elemente tıklanır");
    }

    @Step("<scroll edilir>")
    public void scroll(String scroll) {
        TouchAction ts = new TouchAction(appiumDriver);
        ts.press(PointOption.point(538,1538)).moveTo(PointOption.point(538,420)).release().perform();
        logger.info("Scroll edildi.");
    }

}


