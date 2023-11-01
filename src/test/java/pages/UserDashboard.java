package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserDashboard {
    public UserDashboard(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

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
