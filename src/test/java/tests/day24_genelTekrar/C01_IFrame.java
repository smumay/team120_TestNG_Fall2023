package tests.day24_genelTekrar;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WebUniPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C01_IFrame {

   @Test
    public void iFrameTesti(){

       //1.“http://webdriveruniversity.com/IFrame/index.html” sayfasina gidin
       Driver.getDriver().get(ConfigReader.getProperty("webUniUrl"));

       //2.“Our Products” butonuna basin
       WebUniPage webUniPage = new WebUniPage();
       Driver.getDriver().switchTo().frame(webUniPage.iFrameElementi);
       webUniPage.ourProductLinki.click();
       ReusableMethods.bekle(3);
       //3.“Cameras product”i tiklayin
        webUniPage.camerasElementi.click();

       //4.Popup mesajini yazdirin
       System.out.println(webUniPage.alertYaziElementi.getText());

       //5.“close” butonuna basin
       webUniPage.alertKapatButonu.click();

       Driver.getDriver().switchTo().defaultContent();


       //6.“WebdriverUniversity.com (IFrame)” linkini tiklayin
       webUniPage.webDriverLinki.click();
       //7.“http://webdriveruniversity.com/index.html” adresine gittigini test edin

       String expectedUrl = "http://webdriveruniversity.com/IFrame/index.html";





       Driver.closeDriver();

   }

}
