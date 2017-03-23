package pages;

//https://by.e-konsulat.gov.pl/

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageSelectCity {

    @FindBy (xpath = "//option[text()='English']")
    WebElement languageFromFallList;

    @FindBy (xpath = ".//option[text()='Mińsk']")
    WebElement cityFromFallList;

    public void selectEnglishLanguage(){
        languageFromFallList.click();
    }

    public void selectMinsk(){
        cityFromFallList.click();
    }

}
