package tests.practice;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class P04 {

    QualitydemyPage qualitydemyPage = new QualitydemyPage();





    @Test
    public void qualitydemyTesti(){
        //1- https://www.qualitydemy.com/ anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        qualitydemyPage.cookiesButonu.click();
        //2- login linkine basin
        qualitydemyPage.ilkLoginLinki.click();

        // 3- Kullanici email'i olarak valid email girin
        qualitydemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliEmail"));
// 4- Kullanici sifresi olarak valid sifre girin
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
// 5- Login butonuna basarak login olu
        qualitydemyPage.loginButonu.click();
// 6- Basarili olarak giris yapilabildigini test edin

        Assert.assertTrue(qualitydemyPage.basariliGirisElementi.isDisplayed(),"Basarili olarak giris yapilmistir");





        Driver.closeDriver();

    }
}
