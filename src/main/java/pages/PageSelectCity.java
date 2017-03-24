package pages;

//https://by.e-konsulat.gov.pl/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageSelectCity extends AbstractPage{

    @FindBy (xpath = "//option[text()='English']")
    private WebElement languageFromFallList;

    @FindBy (xpath = ".//option[text()='Mińsk']")
    private WebElement cityFromFallList;

    public PageSelectCity(WebDriver driver) {
        super(driver);
    }

    public void openPage(String URL){
        driver.navigate().to(URL);
    }

    public void selectEnglishLanguage(){
        languageFromFallList.click();
    }

    public void selectMinsk(){
        cityFromFallList.click();
    }

}
