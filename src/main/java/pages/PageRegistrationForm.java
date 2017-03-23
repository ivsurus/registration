package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageRegistrationForm {
    @FindBy(xpath = "//option[text()='English']")
    WebElement languageFromFallList;
    @FindBy (id = "cp_f_daneOs_txtNazwisko")
    WebElement surname;
    @FindBy (id = "cp_f_daneOs_txtNazwiskoRodowe")
    WebElement surnameAtBirth;
    @FindBy (id = "cp_f_daneOs_txtImiona")
    WebElement firstName;
    @FindBy (id = "cp_f_daneOs_txtDataUrodzin")
    WebElement dateOfBirth;
    @FindBy (id = "cp_f_daneOs_txtMiejsceUrodzenia")
    WebElement placeOfBirth;
    @FindBy (xpath = "//select[@id='cp_f_daneOs_cbKrajUrodzenia']/option[@value='BYS']")
    WebElement countryOfBirthBYS;
    @FindBy (xpath = "//select[@id='cp_f_daneOs_cbObecneObywatelstwo']/option[@value='BLR']")
    WebElement currentNationalityBLR;
    @FindBy (xpath = "//select[@id='cp_f_daneOs_cbPosiadaneObywatelstwo']/option[@value='BYS']")
    WebElement originalNationalityBYS;
    @FindBy (id = "cp_f_daneOs_rbPlec_0")
    WebElement sexMale;
    @FindBy (id = "cp_f_daneOs_rbStanCywilny_1")
    WebElement martialStatusMarried;
    @FindBy (id = "cp_f_txt5NumerDowodu")
    WebElement nationalIdentityNumber;
    @FindBy (id = "cp_f_rbl13_0")
    WebElement typeOfPassportOrdinary;
    @FindBy (id = "cp_f_txt14NumerPaszportu")
    WebElement numberOfPassport;
    @FindBy (id = "cp_f_txt16WydanyDnia")
    WebElement passportDateOfIssue;
    @FindBy (id = "cp_f_txt17WaznyDo")
    WebElement passportValidUntil;
    @FindBy (id = "cp_f_txt15WydanyPrzez")
    WebElement passportIssuedBy;
}
