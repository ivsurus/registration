package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageConfirmation extends AbstractPage{

    @FindBy(id ="cp_f_cmdZakoncz")
    private WebElement saveButton;

    public PageConfirmation(WebDriver driver) {
        super(driver);
    }
    public void saveButtonClick(){
        saveButton.click();
    }
}
