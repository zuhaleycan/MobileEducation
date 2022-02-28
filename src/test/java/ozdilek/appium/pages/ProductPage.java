package ozdilek.appium.pages;

import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import ozdilek.appium.BasePage;
import ozdilek.appium.BaseTest;

import java.util.List;
import java.util.Random;

public class ProductPage extends BaseTest {
    public static final Logger logger = LogManager.getLogger(BasePage.class);

    @Step("Random bir ürün seçilir")
    public void selectRandomproduct() {
        Random random = new Random();
        List<MobileElement> randomUrun = appiumDriver.findElements(By.xpath("//*[@resource-id='com.ozdilek.ozdilekteyim:id/imageView']"));
        System.out.println("randomUrunSecme" + randomUrun);
        MobileElement element = randomUrun.get(random.nextInt(randomUrun.size()));
        System.out.println("element" + element);
        logger.info("element");
        element.click();
    }

    @Step("Urun detay sayfasi acildigi kontrol edilir")
    public void checkProductDetail() throws InterruptedException {
        Thread.sleep(1000);
        String checkProductText = appiumDriver.findElement(By.id("com.ozdilek.ozdilekteyim:id/tvSizeDesc")).getText();
        Assertions.assertEquals("Beden:", checkProductText);
        System.out.println("Urun detayına girildi.");
        logger.info("Urun detayına girildi.");
    }

    @Step("Urun favorilere eklenir")
    public void addToFav() throws InterruptedException {
        appiumDriver.findElement(By.id("com.ozdilek.ozdilekteyim:id/imgFav")).click();
        System.out.println("Favorilere ekle butonuna basildi.");
        logger.info("Favorilere ekle butonuna basildi.");
    }

    @Step("Sepete ekle")
    public void addToCart() throws InterruptedException {
        Thread.sleep(2000);
        appiumDriver.findElement(By.id("com.ozdilek.ozdilekteyim:id/imgCart")).click();
        System.out.println("Sepete ekle butonuna basildi.");
        logger.info("Sepete ekle butonuna basildi.");
        Thread.sleep(2000);
    }

}
