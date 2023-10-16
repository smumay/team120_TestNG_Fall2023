package tests.practice;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class P03 {

    AmazonPage amazonPage = new AmazonPage();

    // Amazon da iPhone 15 PRO icin arama yapin

    @Test
    public void amazonAramaTesti(){
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        amazonPage.aramaKutusu.sendKeys(ConfigReader.getProperty("amazonAranacakKelime3")+ Keys.ENTER);

        String actualYazi = amazonPage.sonucYaziElementi.getText();
        String expectedYazi = ConfigReader.getProperty("amazonAranacakKelime3");
        Assert.assertTrue(actualYazi.contains(expectedYazi));



        Driver.closeDriver();


    }

// Arama kutusunun locator'ina ihtiyacimiz var
// locator'larimiz artik pages class'larinda
// Locator'lar static olmadigi icin obje olusturarak kullanabiliriz



}
