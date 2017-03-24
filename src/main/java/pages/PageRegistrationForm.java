package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageRegistrationForm extends AbstractPage{
    @FindBy(xpath = "//option[text()='English']")
    private WebElement languageFromFallList;
    @FindBy (id = "cp_f_daneOs_txtNazwisko")
    private WebElement surname;
    @FindBy (id = "cp_f_daneOs_txtNazwiskoRodowe")
    private WebElement surnameAtBirth;
    @FindBy (id = "cp_f_daneOs_txtImiona")
    private WebElement firstName;
    @FindBy (id = "cp_f_daneOs_txtDataUrodzin")
    private WebElement dateOfBirth;
    @FindBy (id = "cp_f_daneOs_txtMiejsceUrodzenia")
    private WebElement placeOfBirth;
    @FindBy (xpath = "//select[@id='cp_f_daneOs_cbKrajUrodzenia']/option[@value='BYS']")
    private WebElement countryOfBirthBYS;
    @FindBy (xpath = "//select[@id='cp_f_daneOs_cbObecneObywatelstwo']/option[@value='BLR']")
    private WebElement currentNationalityBLR;
    @FindBy (xpath = "//select[@id='cp_f_daneOs_cbPosiadaneObywatelstwo']/option[@value='BYS']")
    private WebElement originalNationalityBYS;
    @FindBy (id = "cp_f_daneOs_rbPlec_0")
    private WebElement sexMale;
    @FindBy (id = "cp_f_daneOs_rbStanCywilny_1")
    private WebElement martialStatusMarried;
    @FindBy (id = "cp_f_txt5NumerDowodu")
    private WebElement nationalIdentityNumber;
    @FindBy (id = "cp_f_rbl13_0")
    private WebElement typeOfPassportOrdinary;
    @FindBy (id = "cp_f_txt14NumerPaszportu")
    private WebElement numberOfPassport;
    @FindBy (id = "cp_f_txt16WydanyDnia")
    private WebElement passportDateOfIssue;
    @FindBy (id = "cp_f_txt17WaznyDo")
    private WebElement passportValidUntil;
    @FindBy (id = "cp_f_txt15WydanyPrzez")
    private WebElement passportIssuedBy;
    @FindBy (id = "cp_f_opiekunowie_chkNieDotyczy")
    private WebElement minorNotApply;
    @FindBy (xpath = "//select[@id='cp_f_ddl45Panstwo']/option[@value='BLR']")
    private WebElement applicantCountry;
    @FindBy (id = "cp_f_txt45StanProwincja")
    private WebElement applicantState;
    @FindBy (id = "cp_f_txt45Miejscowosc")
    private WebElement applicantPlace;
    @FindBy (id = "cp_f_txt45Kod")
    private WebElement applicantPostalCode;
    @FindBy (id = "cp_f_txt45Adres")
    private WebElement applicantAdress;
    @FindBy (id = "cp_f_txt17Email")
    private WebElement applicantEmail;
    @FindBy (id = "cp_f_txt46TelefonPrefiks0")
    private WebElement applicantPhoneCode;
    @FindBy (id = "cp_f_txt46TelefonNumer0")
    private WebElement applicantPhoneNumber;
    @FindBy (id = "cp_f_rbl18_0")
    private WebElement residenceOtherCountryNo;
    @FindBy (xpath = "//select[@id='cp_f_ddl19WykonywanyZawod']/option[text()='Computer expert']")
    private WebElement currentOccupation;
    @FindBy (id = "cp_f_rbl20_0")
    private WebElement employer;
    @FindBy (xpath = "//select[@id='cp_f_dd20bPanstwo']/option[@value='BLR']")
    private WebElement employerCountry;
    @FindBy (id = "cp_f_txt20cStanProwincja")
    private WebElement employerProvince;
    @FindBy (id = "cp_f_txt20dMiejscowosc")
    private WebElement employerPlace;
    @FindBy (id = "cp_f_txt20eKodPocztowy")
    private WebElement employerPostalCode;
    @FindBy (id = "cp_f_txt20fAdres")
    private WebElement employerAdress;
    @FindBy (id = "cp_f_txt20gPrefix")
    private WebElement employerPhoneCode;
    @FindBy (id = "cp_f_txt20hTelefon")
    private WebElement employerPhone;
    @FindBy (id = "cp_f_txt20Nazwa")
    private WebElement employerName;
    @FindBy (id = "cp_f_rbl29_10")
    private WebElement purpouseOfJorneyOther;
    @FindBy (id = "cp_f_txt29CelPodrozy")
    private WebElement purpouseOfJorneOtherArea;
    @FindBy (xpath = "//select[@id='cp_f_ddl21KrajDocelowy']/option[@value='POL']")
    private WebElement destinationCountry;
    @FindBy (xpath = "//select[@id='cp_f_ddl23PierwszyWjazd']/option[@value='POL']")
    private WebElement firstEntryCountry;
    @FindBy (id = "cp_f_rbl24_2")
    private WebElement numberOfEntriesMulti;
    @FindBy (id = "cp_f_txt25OkresPobytu")
    private WebElement durationOfStay;
    @FindBy (id = "cp_f_txt30DataWjazdu")
    private WebElement arrivalDate;
    @FindBy (id = "cp_f_txt31DataWyjazdu")
    private WebElement departureDate;
    @FindBy (id = "cp_f_rbl26_0")
    private WebElement otherSchengenVisasNo;
    @FindBy (id = "cp_f_rbl27_1")
    private WebElement fingerprintsYes;
    @FindBy (id = "cp_f_chkNiedotyczy28")
    private WebElement entryPermitNotApply;
    @FindBy (id = "cp_f_ctrl31__rbl34_1")
    private WebElement hostCompany;
    @FindBy (id = "cp_f_ctrl31__txt34Nazwa")
    private WebElement companyName;
    @FindBy (xpath = "//select[@id='cp_f_ctrl31__ddl34panstwo']/option[@value='POL']")
    private WebElement hostCountry;
    @FindBy (id = "cp_f_ctrl31__txt34miejscowosc")
    private WebElement hostPlace;
    @FindBy (id = "cp_f_ctrl31__txt34kod")
    private WebElement hostPostalCode;
    @FindBy (id = "cp_f_ctrl31__txt34adres")
    private WebElement hostAdress;
    @FindBy (id = "cp_f_rbl35_0")
    private WebElement costIsCoveredByHimself;
    @FindBy (id = "cp_f_rb36Gotowka")
    private WebElement staySupportCash;
    @FindBy (id = "cp_f_chkNieDotyczy43")
    private WebElement eUcitezenNotApply;
    @FindBy (id = "cp_f_chk44Oswiadczenie1")
    private WebElement firstAware;
    @FindBy (id = "cp_f_chk44Oswiadczenie2")
    private WebElement secondAware;
    @FindBy (id = "cp_f_chk44Oswiadczenie3")
    private WebElement thirdAware;
    @FindBy (id = "cp_f_cmdDalej")
    private WebElement continueButton;

    public PageRegistrationForm(WebDriver driver) {
        super(driver);
    }
}
