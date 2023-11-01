package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SmartCardLinkPage {
    public SmartCardLinkPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='btn btn-white fs-18 ms-3 d-lg-block d-none']")
    public WebElement signInButton;

    @FindBy(id = "email")
    public WebElement signInEmailElementiSM;

    @FindBy(id = "password")
    public WebElement signInPasswordElementiSM;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement LoginButtonuSM;

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

    //US_009

    @FindBy(xpath = "(//*[@class='nav-link d-flex align-items-center py-3'])[2]")
    public WebElement vCardsElementiSM;

    @FindBy(xpath = "//*[@class='d-flex justify-content-end']")
    public WebElement newCardElementiSM;

    @FindBy(xpath = "//*[@class='form-control ms-1 vcard-url-alias']")
    public WebElement urlAliasElementiSM;

    @FindBy(xpath = "//*[@placeholder='Enter VCard Name']")
    public WebElement vCardNameSM;

    @FindBy(xpath = "//*[@placeholder='Enter Occupation']")
    public WebElement occupationElementSM;

    @FindBy(xpath = "//*[@class='ql-editor ql-blank']")
    public WebElement descriptionElementSM;

    @FindBy(xpath = "//input[@id='vcardSaveBtn']")
    public WebElement newVCardSaveButonuSM;

    @FindBy (xpath = "//*[@*='generate-url-alias']")
    public WebElement urlAliasSM;

    @FindBy(xpath = "//*[@placeholder='Enter First Name']")
    public WebElement vCardFirstNameSM;

    @FindBy(xpath = "//*[@placeholder='Enter Last Name']")
    public WebElement vCardLastNameSM;

    @FindBy(xpath = "//*[@placeholder='Enter Email Address']")
    public WebElement vCardEmailSM;

    @FindBy(xpath = "//*[@placeholder='Alternate Email']")
    public WebElement vCardAlternateEmailSM;

    @FindBy(xpath = "//*[@placeholder='Enter Phone Number']")
    public WebElement vCardPhoneSM;

    @FindBy(xpath = "//*[@placeholder='Alternate Phone']")
    public WebElement vCardAlternatePhoneSM;

    @FindBy(xpath = "//*[@placeholder='Enter Your Location']")
    public WebElement vCardLocationSM;

    @FindBy(xpath = "//*[@placeholder='Enter Your Location URL']")
    public WebElement vCardLocationUrlSM;

    @FindBy(xpath = "//*[@placeholder='Enter Date of Birth']")
    public WebElement vCardDateOfBirthSM;


    @FindBy(xpath = "//*[@placeholder='Enter Company Name']")
    public WebElement vCardCompanySM;

    @FindBy(xpath = "//*[@placeholder='Enter Job Title']")
    public WebElement vCardJobTitleSM;

    @FindBy(xpath = "//span[@id='select2-default_language-container']")
    public WebElement vCardJLanguageSM;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement vCardSaveButonuSM;

    @FindBy(xpath = "//*[@id='select2-default_language-result-a2mc-en']")
    public WebElement vCardEnglishSM;

    @FindBy(xpath = "(//*[@class='text-decoration-none fs-6'])[1]")
    public WebElement previewUrlSM;

    @FindBy(xpath = "(//a[@class='btn px-1 text-primary fs-3'])[1]")
    public WebElement vCardEditSM;

    @FindBy (xpath = "//a[@class='btn btn-outline-primary float-end']")
    public WebElement backButtonSM;

    @FindBy(xpath = "//span[text()='Engineer']")
    public WebElement editMeslekElementiSM;

    @FindBy(xpath = "//*[@class='vcard1-sticky-btn bars-btn d-flex justify-content-center text-white me-5 align-items-center rounded-0 px-5 mb-3 text-decoration-none py-1 rounded-pill justify-content-center']")
    public WebElement kartfonksiyonaktifElementiSM;

    @FindBy(xpath = "//*[@data-icon='share-nodes']")
    public WebElement qRKodeSosyalMedyaLinkiSM;

    @FindBy(xpath = "//span[@class='svg-icon svg-icon-1']")
    public WebElement cikisKapatmaSM;








}
