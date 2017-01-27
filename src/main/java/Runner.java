import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.util.List;


/**
 * Created by Ivan_Surus on 1/26/2017.
 */
public class Runner {

    public static void main(String[] args) throws InterruptedException {

        File pathToBinary = new File("C:\\Users\\Ivan_Surus\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
        FirefoxProfile profile = new FirefoxProfile();
        profile.setPreference("browser.startup.homepage", "about:blank");
        System.setProperty("webdriver.gecko.driver", "c:\\Users\\Ivan_Surus\\Downloads\\geckodriver-v0.13.0-win64\\geckodriver.exe");
        FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);WebDriver driver = new FirefoxDriver(ffBinary,profile);
        driver.get("https://by.e-konsulat.gov.pl/");

        //выпадающий список не работает select
        WebElement firstDropList = driver.findElement(By.id("tresc_cbListaPlacowek"));
        firstDropList.click();

//        driver.findElement(By.id("tresc_cbListaPlacowek")).sendKeys("Mińsk");
//        driver.findElement(By.id("tresc_cbListaPlacowek")).submit();

        Thread.sleep(2000);

//        driver.findElement(By.xpath(".//option[text()='Mińsk']"));
       // List<WebElement> listWEbr =  driver.findElements(By.xpath(".//*[@id='tresc_cbListaPlacowek']/option"));
    //    WebElement element =  driver.findElement(By.xpath(".//option[text()='Mińsk']"));
   //     System.out.println("!!!!!!!!" + element.getText());
    //    System.out.println(element.isEnabled());
     //   System.out.println(element.isDisplayed());
//        Select select = new Select(driver.findElement(By.id("tresc_cbListaPlacowek")));
//        select.selectByVisibleText("Mińsk");

//
        driver.findElement(By.linkText("Schengen Visa - Fill in form")).click();
//
        Thread.sleep(2000);
//        System.out.println(driver.findElement(By.xpath("//option[text()='BELARUS']")).isEnabled());
        driver.findElement(By.id("cp_f_daneOs_cbKrajUrodzenia")).click();
//        System.out.println(driver.findElement(By.xpath("//option[text()='BELARUS']")).isEnabled());
    }

}
