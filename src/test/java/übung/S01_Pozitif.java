package übung;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class S01_Pozitif {




   @Test
    public void testPozitif(){

       //PositiveTest
       //1- https://www.qualitydemy.com/ anasayfasina gidin
            Driver.getDriver().get("https://www.qualitydemy.com/");
       QualitydemyPage qualitydemyPage = new QualitydemyPage();
        qualitydemyPage.cookiesButonu.click();
       //2- login linkine basin

       qualitydemyPage.ilkLoginLinki.click();

       //3- Kullanici email'i olarak valid email girin

            qualitydemyPage.emailKutusu.sendKeys("anevzatcelik@gmail.com");


       //4- Kullanici sifresi olarak valid sifre girin
            qualitydemyPage.passwordKutusu.sendKeys("Nevzat152032");

       //5- Login butonuna basarak login olun

       qualitydemyPage.loginButonu.click();


       //6- Basarili olarak giris yapilabildigini test edin

       Assert.assertTrue(qualitydemyPage.basariliGirisElementi.isDisplayed());




      ReusableMethods.bekle(5);

      Driver.closeDriver();


   }




}
