package übung;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class S02_FacebookTesti {

    @Test
    public void negatifTest(){

        //1 - https://www.facebook.com/ adresine gidin
        Driver.getDriver().get("https://www.facebook.com/");



        Faker faker = new Faker();

        //2- POM’a uygun olarak email, sifre kutularini ve giris
        //yap butonunu locate edin



        //3- Faker class’ini kullanarak email ve sifre
        //degerlerini yazdirip, giris butonuna basin


        FacebookPage facebookPage = new FacebookPage();

        facebookPage.cookieButonu.click();

        facebookPage.emailKutusu.sendKeys(faker.internet().emailAddress());
        facebookPage.passwordKutusu.sendKeys(faker.internet().password());
        facebookPage.loginButonu.click();

        ReusableMethods.bekle(5);


        //4- Basarili giris yapilamadigini test edin

        Assert.assertTrue(facebookPage.girisYapilamadiYaziElementi.isDisplayed());

        ReusableMethods.tumSayfaFotografCek("Facebookbasaririsizgiris");



        Driver.closeDriver();
    }
}
