package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminDashboard {
    public AdminDashboard(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='nav-link p-0 active']")
    public WebElement adminOlarakGirisYapildigindaDadhboardYazisiSM;

    @FindBy(xpath = "//*[@class='svg-inline--fa fa-dollar-sign']")
    public WebElement currenciesButonuSM;

    @FindBy(xpath = "//div[@class='text-muted ms-sm-3 pagination-record']")
    public WebElement paraBirimleriSayisiSM;

    @FindBy(xpath = "//*[@class='svg-inline--fa fa-tags']")
    public WebElement kuponKoduElementiSM;

    @FindBy(xpath = "//a[@class='btn btn-primary']")
    public WebElement kuponKoduEklemeSM;

    @FindBy(id = "couponName")
    public WebElement couponNameSM;

    @FindBy(xpath = "//input[@id='fixedType']")
    public WebElement couponTypeFixSM;

    @FindBy(xpath = "//input[@id='percentageType']")
    public WebElement couponTypePercentageSM;

    @FindBy(xpath = "//input[@id='couponDiscount']")
    public WebElement couponDiscountSM;

    @FindBy(xpath = "//input[@id='couponExpireAt']")
    public WebElement couponExpireSM;

    @FindBy(xpath = "(//span[@class='flatpickr-next-month'])[1]")
    public WebElement ayDegistirmeTusuSM;

    @FindBy(xpath = "/html/body/div[4]/div[2]/div/div[2]/div/span[28]")
    public WebElement dayDegistirmeTusuSM;

    @FindBy(xpath = "//button[@id='couponCodeSaveBtn']")
    public WebElement couponSaveButonuSM;

    @FindBy(xpath = "(//input[@id='changeCouponStatus'])[1]")
    public WebElement statusDurumElementiSM;

    @FindBy(xpath = "(//*[@class='btn px-1 text-info fs-3 edit-coupon-code'])[1]")
    public WebElement duzenlemeEditElementiSM;

    @FindBy(xpath = "(//*[@class='whitespace-nowrap px-3 py-2 md:px-6 md:py-4 text-sm leading-5 text-gray-900 dark:text-white'])[1]")
    public WebElement CouponNameYaziElementiSM;

    @FindBy(xpath = "(//*[@class='whitespace-nowrap px-3 py-2 md:px-6 md:py-4 text-sm leading-5 text-gray-900 dark:text-white'])[2]")
    public WebElement CouponTypeYaziElementiSM;
    @FindBy(xpath = "(//*[@class='whitespace-nowrap px-3 py-2 md:px-6 md:py-4 text-sm leading-5 text-gray-900 dark:text-white'])[3]")
    public WebElement CouponDiscountYaziElementiSM;

    @FindBy(id = "editCouponDiscount")
    public WebElement editCouponDiscountElementiSM;


    @FindBy(id = "editCouponCodeSaveBtn")
    public WebElement editSaveButonuSM;

    @FindBy(xpath = "(//a[@title='Delete'])[1]")
    public WebElement silmeElementiSM;

    @FindBy(xpath = "//*[@class='swal-button swal-button--confirm']")
    public WebElement deleteElementiSM;




}
