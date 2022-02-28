package ozdilek.appium.pages;

import com.thoughtworks.gauge.Step;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import ozdilek.appium.BasePage;
import ozdilek.appium.BaseTest;

public class LoginPage extends BaseTest {
    public static final Logger logger = LogManager.getLogger(BasePage.class);

    @Step("<id> id'li elemente <mail> mail adresi girme")
    public void kullaniciAdi(String mailId,String mailText){
        appiumDriver.findElement(By.id(mailId)).sendKeys(mailText);
        logger.info("Mail adresi girildi");
    }

    @Step("<id> 'li elemente <sifre> şifre girme")
    public void kullaniciSifre(String sifreId, String sifreText){
        appiumDriver.findElement(By.id(sifreId)).sendKeys(sifreText);
        logger.info("Şifre girildi");
    }


    @Step("id<id> geri tusuna tıkla")
    public void clickBygeri(String id) {
        appiumDriver.findElement(By.id(id)).click();
        logger.info("geri tusuna tıkla");
    }
}
