package tests.senol;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.UserDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Set;

public class US_009 {


    @Test
    public void testUS_009(){

        HomePage homePage = new HomePage();
        UserDashboard userDashboard = new UserDashboard();

        //Kayıtlı kullanıcı olarak oluşturduğum vcard'ı düzenleyebildiğimi,

        //1.SmartCardLink anasayfasina gidelim
        Driver.getDriver().get(ConfigReader.getProperty("smartcardlinkUrl"));
        String ilkSayfaWhd = Driver.getDriver().getWindowHandle();

        ReusableMethods.wait(2);

        //2. sign In Butonuna basalim

        homePage.signInButton.click();

        //3. Giris yapmak icin acilan sayfada E-Mail bolumune admin icin verilen E-Mail girilir
        homePage.signInEmailElementiSM.sendKeys(ConfigReader.getProperty("senolKayitliKullaniciEmail"));

        //4. Password girilir

        homePage.signInPasswordElementiSM.sendKeys(ConfigReader.getProperty("senolKayitliKullaniciPassword"));

        //5.  Giris yapmak icin login buttonuna basin
        homePage.LoginButtonuSM.click();
        ReusableMethods.wait(2);

        userDashboard.vCardsElementiSM.click();
        ReusableMethods.wait(2);
        userDashboard.newCardElementiSM.click();
        Faker faker = new Faker();
        //String fakerUrlAlias = faker.internet().emailAddress();
        userDashboard.urlAliasSM.click();
        String vCardName = faker.company().name();
        userDashboard.vCardNameSM.sendKeys(vCardName);
        userDashboard.occupationElementSM.sendKeys("Tester");
        userDashboard.descriptionElementSM.sendKeys("java candir.");
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.wait(2);
        userDashboard.newVCardSaveButonuSM.click();
        ReusableMethods.wait(2);

        // ilgili tüm bilgileri girebildiğimi

        userDashboard.vCardFirstNameSM.sendKeys(faker.name().firstName());
        userDashboard.vCardLastNameSM.sendKeys(faker.name().lastName());
        userDashboard.vCardEmailSM.sendKeys(faker.internet().emailAddress());
        userDashboard.vCardPhoneSM.sendKeys(faker.phoneNumber().cellPhone());
        userDashboard.vCardAlternateEmailSM.sendKeys(faker.internet().emailAddress());
        userDashboard.vCardAlternatePhoneSM.sendKeys(faker.phoneNumber().phoneNumber());
        userDashboard.vCardLocationSM.sendKeys("https://www.rohanschultzandstreich.io");
        userDashboard.vCardLocationUrlSM.sendKeys("https://www.mclaughlinlemkeandharvey.biz");
        userDashboard.vCardDateOfBirthSM.sendKeys("01.01.1990");
        userDashboard.vCardCompanySM.sendKeys(faker.company().name());
        userDashboard.vCardJobTitleSM.sendKeys(faker.job().title());
        ReusableMethods.wait(2);
        /*WebElement dropdownElementi = driver.findElement(By.xpath("//select[@id='dropdown']"));
        WebElement dropdownElementi = smartCardLinkPage.vCardJLanguage;
        Select select = new Select(dropdownElementi);
        ReusableMethods.bekle(2);
        //  1.Index kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
        select.selectByIndex(3);
        System.out.println(select.getFirstSelectedOption().getText());

         */
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.wait(1);

        userDashboard.vCardSaveButonuSM.click();

        // ve bu bilgilerin kart sayfasında görüntülenebildiğini
        ReusableMethods.wait(1);
        userDashboard.vCardsElementiSM.click();
        ReusableMethods.wait(2);

        userDashboard.vCardEditSM.click();

        ReusableMethods.wait(1);
        userDashboard.occupationElementSM.clear();
        ReusableMethods.wait(1);
        userDashboard.occupationElementSM.sendKeys("Engineer");
        ReusableMethods.wait(2);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.wait(1);
        userDashboard.vCardSaveButonuSM.click();
        ReusableMethods.wait(1);
        userDashboard.backButtonSM.click();

        String expectedvCardMeslek = "Tester";
        String actualvCardMeslek = userDashboard.editMeslekElementiSM.getText();
        Assert.assertNotEquals(actualvCardMeslek,expectedvCardMeslek);

        //ReusableMethods.tumSayfaFotografCek("kart sayfasi");

        // kart sayfasındaki fonksiyonların aktif olduğunu doğrulayabilmeliyim.
        ReusableMethods.wait(1);
        userDashboard.previewUrlSM.click();

        Set<String> whdSeti = Driver.getDriver().getWindowHandles();
        System.out.println("ilk sayfa whd : " + ilkSayfaWhd);
        System.out.println("window handles seti : " + whdSeti);
        String ikinciSayfaWhd = "";
        for (String each : whdSeti
        ) {
            if (!each.equals(ilkSayfaWhd)) {
                ikinciSayfaWhd = each;
            }
        }
        // artik 2.sayfanin whd'ini bildigimiz icin, ikinci sayfaya gecis yapabiliriz
        Driver.getDriver().switchTo().window(ikinciSayfaWhd);
        ReusableMethods.wait(3);
        userDashboard.kartfonksiyonaktifElementiSM.click();
        ReusableMethods.wait(3);
        userDashboard.qRKodeSosyalMedyaLinkiSM.click();
        ReusableMethods.wait(1);

        userDashboard.cikisKapatmaSM.click();

        Driver.getDriver().quit();

    }
}