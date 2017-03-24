package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PageSelectVisa extends AbstractPage{

    @FindBy(linkText = "Schengen Visa - Fill in form")
    private WebElement fillInSchengenLink;

    public PageSelectVisa(WebDriver driver) {
        super(driver);
    }

    public void selectFillInSchengen(){
        fillInSchengenLink.click();
    }
}
