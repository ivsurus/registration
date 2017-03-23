package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PageSelectVisa {

    @FindBy(linkText = "Schengen Visa - Fill in form")
    WebElement fillInSchengenLink;

    public void selectFillInSchengen(){
        fillInSchengenLink.click();
    }
}
