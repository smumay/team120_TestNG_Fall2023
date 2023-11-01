package tests.senol;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_032 {

    WebDriver driver;

    @Test
    public void testUS_032(){

        //Admin bilglieri ile giriş yaptıktan sonra
        Driver.getDriver().get(ConfigReader.getProperty("smartcardlinkUrl"));
        HomePage homePage = new HomePage();
        AdminDashboard adminDashboard = new AdminDashboard();
        homePage.signInButton.click();
        homePage.signInEmailElementiSM.sendKeys(ConfigReader.getProperty("smartcardlinkUsername"));
        homePage.signInPasswordElementiSM.sendKeys(ConfigReader.getProperty("smartcardlinkPassword"));
        homePage.LoginButtonuSM.click();

        // kupon kodu oluşturabildiğimi,
        adminDashboard.kuponKoduElementiSM.click();
        ReusableMethods.wait(3);
        adminDashboard.kuponKoduEklemeSM.click();




        Faker faker = new Faker();
        String fakerName= faker.name().firstName();
        ReusableMethods.wait(1);
        adminDashboard.couponNameSM.sendKeys(fakerName);
        adminDashboard.couponDiscountSM.sendKeys("30");
        adminDashboard.couponTypeFixSM.click();
        ReusableMethods.wait(2);
        adminDashboard.couponExpireSM.click();
        //smartCardLinkPage.ayDegistirmeTusu.click();
        adminDashboard.dayDegistirmeTusuSM.click();
        ReusableMethods.wait(1);
        adminDashboard.couponSaveButonuSM.click();

        // bilgilerini görüntüleyebildiğimi,
        String expectedCouponName = fakerName;
        ReusableMethods.wait(2);
        String actualCouponName = adminDashboard.CouponNameYaziElementiSM.getText();
        Assert.assertTrue(actualCouponName.equalsIgnoreCase(expectedCouponName));
        ReusableMethods.wait(1);
        String expectedCouponType = "Fixed";
        String actualCouponType = adminDashboard.CouponTypeYaziElementiSM.getText();
        Assert.assertEquals(actualCouponType,expectedCouponType);
        String expectedCouponDiscount = "30";
        String actualCouponDiscount = adminDashboard.CouponDiscountYaziElementiSM.getText();
        Assert.assertEquals(actualCouponDiscount,expectedCouponDiscount);


        ReusableMethods.wait(2);

        // aktif edebildiğimi,
        adminDashboard.statusDurumElementiSM.click();

        ReusableMethods.wait(1);



        // düzenleyebildiğimi
        adminDashboard.duzenlemeEditElementiSM.click();
        ReusableMethods.wait(3);
        //smartCardLinkPage.couponTypePercentage.click();

        ReusableMethods.wait(2);
        adminDashboard.editCouponDiscountElementiSM.clear();
        adminDashboard.editCouponDiscountElementiSM.sendKeys("60");
        ReusableMethods.wait(1);
        adminDashboard.editSaveButonuSM.click();
        ReusableMethods.wait(2);

        // ve silebildiğimi doğrulayabilmeliyim

        adminDashboard.silmeElementiSM.click();
        ReusableMethods.wait(1);
        adminDashboard.deleteElementiSM.click();

        expectedCouponName = fakerName;
        System.out.println(fakerName);
        ReusableMethods.wait(3);

        actualCouponName = adminDashboard.CouponNameYaziElementiSM.getText();
        System.out.println(actualCouponName);
        Assert.assertFalse(actualCouponName.contains(expectedCouponName));

        Driver.closeDriver();
    }

}
