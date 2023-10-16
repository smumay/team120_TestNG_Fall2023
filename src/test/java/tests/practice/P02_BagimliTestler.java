package tests.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class P02_BagimliTestler {

    /*
Birbirine bağımlı testler oluşturun
before ve after class ile setup ayaralarını yapın
Birbirine bağlı testlerle
önce wisequarter'a gidin
wisequarter adresine gidebilirse oradan amazon.com adresine gitsin
amazon.com adresine gidebilirse google adresine gitsin
driver kapatsın

 */
    static WebDriver driver;



    @Test
    public void wise(){
        Driver.getDriver().get(ConfigReader.getProperty("wiseUrl"));
    }

    @Test
    public void amazon(){
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }
    @Test
    public void google(){
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));
    }





}
