package tests.senol;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_029 {

    //Admin bilglieri ile giriş yaptıktan sonra
    // kullancıların işlemelerinde kullanabilecekleri para birimleri sayısını görüntüleyebildiğimi
    // doğrulayabilmeliyim

    @Test
    public void testUS_029(){
        HomePage homePage = new HomePage();
        AdminDashboard adminDashboard = new AdminDashboard();
        //SmartCardLink anasayfasina gidelim
        Driver.getDriver().get(ConfigReader.getProperty("smartcardlinkUrl"));

        ReusableMethods.wait(3);

        // sign In Butonuna basalim

        homePage.signInButton.click();

        //Giris yapmak icin acilan sayfada E-Mail bolumune admin icin verilen E-Mail girilir
        homePage.signInEmailElementiSM.sendKeys(ConfigReader.getProperty("smartcardlinkUsername"));

        //Password girilir

        homePage.signInPasswordElementiSM.sendKeys(ConfigReader.getProperty("smartcardlinkPassword"));

        //// Giris yapmak icin login buttonuna basin
        homePage.LoginButtonuSM.click();

        //Dashboard sayfasina giris yapabildigini test eder
        String expectedDashBoardYazisi = "Dashboard";
        String actualDashBoardYazisi = adminDashboard.adminOlarakGirisYapildigindaDadhboardYazisiSM.getText();
        Assert.assertTrue(actualDashBoardYazisi.contains(expectedDashBoardYazisi));

        // kullancıların işlemlerinde kullanabilecekleri para birimleri sayısını görüntüleyebildiğimi
        // doğrulayabilmeliyim
        adminDashboard.currenciesButonuSM.click();

        String expectedParaBirimiSayisiYazisi = "Showing 1 to 10 of 135 results";
        String actualParaBirimiYazisi = adminDashboard.paraBirimleriSayisiSM.getText();
        System.out.println("para birimleri sayısını görüntüleme =  "+actualParaBirimiYazisi);

        Assert.assertTrue(actualParaBirimiYazisi.contains(expectedParaBirimiSayisiYazisi));


        Driver.closeDriver();

    }


}
