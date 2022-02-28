package ozdilek.appium.pages;

import com.thoughtworks.gauge.Step;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import ozdilek.appium.BasePage;
import ozdilek.appium.BaseTest;

public class CategoryTest extends BaseTest {

    public static final Logger logger = LogManager.getLogger(BasePage.class);

    @Step("id<id> li element kontrol edilir")
    public void checkTextControl(String id) {
        String chectTextControl = appiumDriver.findElement(By.id(id)).getText();
        Assertions.assertEquals("ALIŞVERİŞE BAŞLA", chectTextControl);
        logger.info("ALIŞVERİŞE BAŞLA");
    }

    @Step("id<id> li element kontrol edilir market")
    public void checkElement(String id) {
        String chectElement = appiumDriver.findElement(By.id(id)).getText();
        Assertions.assertEquals("Market", chectElement);
        System.out.println("Urun detayına girildi.");
        logger.info("Urun detayına girildi.");
    }

    @Step("id<id> kategoriye tıklanır")
    public void clickCategory(String id) {
        appiumDriver.findElement(By.id(id)).click();
        logger.info("kategoriye tıklanır");
    }

    @Step("xpath<xpath> kadın kategorisine tıklanır")
    public void clickKadin(String xpath) {
        appiumDriver.findElement(By.xpath(xpath)).click();
        logger.info("kadın kategorisine tıklanır");
    }

    @Step("xpath<xpath> pantolon kategorisine tıklanır")
    public void clickPantolon(String xpath) {
        appiumDriver.findElement(By.xpath(xpath)).click();
        logger.info("pantolon kategorisine tıklanır");
    }
}
