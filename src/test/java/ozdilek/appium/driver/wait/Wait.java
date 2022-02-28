package ozdilek.appium.driver.wait;

import ozdilek.appium.BasePage;

import java.util.concurrent.TimeUnit;

public class Wait extends BasePage {

    public static void waitSeconds(int second) {
        appiumDriver.manage().timeouts().implicitlyWait(second, TimeUnit.SECONDS);
    }

}
