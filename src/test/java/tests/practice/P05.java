package tests.practice;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AEPage;
import utilities.ConfigReader;
import utilities.Driver;

public class P05 {

    @Test
    public void AETest(){

        Driver.getDriver().get(ConfigReader.getProperty("aeUrl"));

        AEPage aePage=new AEPage();

        aePage.signUp.click();
        aePage.registerName.sendKeys("Berk1");
        aePage.registermail.sendKeys("senol@babayigit.net");
        aePage.signupButton.click();
        aePage.gender1.click();
        aePage.password.sendKeys("12345678");
        aePage.firstName.sendKeys("Berk");
        aePage.lastName.sendKeys("Babayigit");
        aePage.address.sendKeys("Beylikduzu");
        Select select=new Select(aePage.country);
        select.selectByValue("Canada"); // options daki value değeri yazılır.
        //select.selectByVisibleText("Canada"); // sayfada görünen değer
        aePage.state.sendKeys("Istanbul");
        aePage.city.sendKeys("Istanbul");
        aePage.zipcode.sendKeys("34697");
        aePage.mobileNumber.sendKeys("902126547896"+ Keys.ENTER);

        String expectedverify="ACCOUNT CREATED!";
        String actualVerify=aePage.regverify.getText();
        Assert.assertTrue(actualVerify.contains(expectedverify));

        Driver.closeDriver();




    }


}