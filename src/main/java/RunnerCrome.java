import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by Ivan_Surus on 1/27/2017.
 */
public class RunnerCrome {
    public static void main(String[] args) throws InterruptedException {

        //для mac
       //  System.setProperty("webdriver.chrome.driver", "/Users/annasurus/Desktop/chromedriver");

        //windows лаба
       //  System.setProperty("webdriver.chrome.driver", "c:\\Users\\Ivan_Surus\\Downloads\\chromedriver.exe");
        //для ноутбука
      //  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ivan\\Downloads\\chromedriver_win32\\chromedriver.exe");


      //  WebDriver driver = new ChromeDriver();
        FirefoxProfile profile = new FirefoxProfile();
     //   profile.setPreference("browser.startup.homepage", "about:blank");
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ivan\\Downloads\\geckodriver-v0.12.0-win64\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.get("https://by.e-konsulat.gov.pl/");
        //driver.get("https://by.e-konsulat.gov.pl/");
        //выбираем английский page1
        driver.findElement(By.xpath("//option[text()='English']")).click();
        //выбираем минск
        driver.findElement(By.xpath(".//option[text()='Mińsk']")).click();
        //выбираем заполнит анкету page2


        //явное ожидание появления Schengen Visa - Fill in form в течение 10 сек
        WebElement dynamicElement = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Schengen Visa - Fill in form")));
        dynamicElement.click();

        driver.findElement(By.linkText("Schengen Visa - Fill in form")).click();
       //page3
        driver.findElement(By.id("cp_f_daneOs_txtNazwisko")).sendKeys("S");
        driver.findElement(By.id("cp_f_daneOs_txtNazwiskoRodowe")).sendKeys("S");
        driver.findElement(By.id("cp_f_daneOs_txtImiona")).sendKeys("I");
        driver.findElement(By.id("cp_f_daneOs_txtDataUrodzin")).sendKeys("1985-05-07");
        driver.findElement(By.id("cp_f_daneOs_txtMiejsceUrodzenia")).sendKeys("Minsk");
        driver.findElement(By.xpath("//select[@id=\"cp_f_daneOs_cbKrajUrodzenia\"]/option[text()='BELORUS SSR']")).click();
        driver.findElement(By.xpath("//select[@id=\"cp_f_daneOs_cbObecneObywatelstwo\"]/option[text()='BELARUS']")).click();
        driver.findElement(By.xpath("//select[@id=\"cp_f_daneOs_cbPosiadaneObywatelstwo\"]/option[text()='BELORUS SSR']")).click();
        driver.findElement(By.id("cp_f_daneOs_rbPlec_0")).click();
        driver.findElement(By.id("cp_f_daneOs_rbStanCywilny_1")).click();
        driver.findElement(By.id("cp_f_txt5NumerDowodu")).sendKeys("dsf563479878975348975");
        driver.findElement(By.id("cp_f_rbl13_0")).click();
        driver.findElement(By.id("cp_f_txt14NumerPaszportu")).sendKeys("MP2222222");

        driver.findElement(By.id("cp_f_txt16WydanyDnia")).sendKeys("2015-02-20");

        driver.findElement(By.id("cp_f_txt17WaznyDo")).sendKeys("2030-02-20");
        driver.findElement(By.id("cp_f_txt15WydanyPrzez")).sendKeys("RUVD");
//закончил здесь
        //чекбокс
        if ( !driver.findElement(By.id("cp_f_opiekunowie_chkNieDotyczy")).isSelected() )
        {
            driver.findElement(By.id("cp_f_opiekunowie_chkNieDotyczy")).click();
        }
        driver.findElement(By.xpath("//select[@id=\"cp_f_ddl45Panstwo\"]/option[text()='BELARUS']")).click();

        driver.findElement(By.id("cp_f_txt45StanProwincja")).sendKeys("Minskay Obl");

        driver.findElement(By.id("cp_f_txt45Miejscowosc")).sendKeys("Minsk");
        driver.findElement(By.id("cp_f_txt45Kod")).sendKeys("220000");
        driver.findElement(By.id("cp_f_txt45Adres")).sendKeys("Machuli");
        driver.findElement(By.id("cp_f_txt17Email")).sendKeys("jfsddsfsdfsdfsd1112k@gmail.com");
        driver.findElement(By.id("cp_f_txt46TelefonPrefiks0")).sendKeys("+37529");
        driver.findElement(By.id("cp_f_txt46TelefonNumer0")).sendKeys("6666666");

        driver.findElement(By.id("cp_f_rbl18_0")).click();
        driver.findElement(By.xpath("//select[@id=\"cp_f_ddl19WykonywanyZawod\"]/option[text()='Computer expert']")).click();
        driver.findElement(By.id("cp_f_rbl20_0")).click();
        driver.findElement(By.xpath("//select[@id=\"cp_f_dd20bPanstwo\"]/option[text()='BELARUS']")).click();
        driver.findElement(By.id("cp_f_txt20cStanProwincja")).sendKeys("Minskaya oblast");
        driver.findElement(By.id("cp_f_txt20dMiejscowosc")).sendKeys("Minsk");
        driver.findElement(By.id("cp_f_txt20eKodPocztowy")).sendKeys("220220");
        driver.findElement(By.id("cp_f_txt20fAdres")).sendKeys("kuprevichi");
        driver.findElement(By.id("cp_f_txt20gPrefix")).sendKeys("+37529");
        driver.findElement(By.id("cp_f_txt20hTelefon")).sendKeys("7777777");
        driver.findElement(By.id("cp_f_txt20Nazwa")).sendKeys("EPAMMMMMMMM");

        if ( !driver.findElement(By.id("cp_f_rbl29_10")).isSelected() )
        {
            driver.findElement(By.id("cp_f_rbl29_10")).click();
        }
        driver.findElement(By.id("cp_f_txt29CelPodrozy")).sendKeys("zakupy");
        driver.findElement(By.xpath("//select[@id=\"cp_f_ddl21KrajDocelowy\"]/option[text()='POLAND']")).click();
        driver.findElement(By.xpath("//select[@id=\"cp_f_ddl23PierwszyWjazd\"]/option[text()='POLAND']")).click();
        driver.findElement(By.id("cp_f_rbl24_2")).click();
        driver.findElement(By.id("cp_f_txt25OkresPobytu")).click();
        driver.findElement(By.id("cp_f_txt25OkresPobytu")).sendKeys("90");
        driver.findElement(By.id("cp_f_txt30DataWjazdu")).sendKeys("2017-02-01");
        driver.findElement(By.id("cp_f_txt31DataWyjazdu")).sendKeys("2020-02-01");
        driver.findElement(By.id("cp_f_rbl26_0")).click();
        driver.findElement(By.id("cp_f_rbl27_1")).click();

        if ( !driver.findElement(By.id("cp_f_chkNiedotyczy28")).isSelected() )
        {
            driver.findElement(By.id("cp_f_chkNiedotyczy28")).click();
        }

        driver.findElement(By.id("cp_f_ctrl31__rbl34_1")).click();


        driver.findElement(By.id("cp_f_ctrl31__txt34Nazwa")).sendKeys("Media Markt");
        driver.findElement(By.xpath("//select[@id=\"cp_f_ctrl31__ddl34panstwo\"]/option[text()='POLAND']")).click();
        driver.findElement(By.id("cp_f_ctrl31__txt34miejscowosc")).sendKeys("Bialystok");
        driver.findElement(By.id("cp_f_ctrl31__txt34kod")).sendKeys("15-001");


        driver.findElement(By.id("cp_f_ctrl31__txt34adres")).sendKeys("100 let panstva");

        driver.findElement(By.id("cp_f_rbl35_0")).click();

        if ( !driver.findElement(By.id("cp_f_rb36Gotowka")).isSelected() )
        {
            driver.findElement(By.id("cp_f_rb36Gotowka")).click();
        }
        if ( !driver.findElement(By.id("cp_f_chkNieDotyczy43")).isSelected() )
        {
            driver.findElement(By.id("cp_f_chkNieDotyczy43")).click();
        }
        if ( !driver.findElement(By.id("cp_f_chkNieDotyczy43")).isSelected() )
        {
            driver.findElement(By.id("cp_f_chkNieDotyczy43")).click();
        }
        if ( !driver.findElement(By.id("cp_f_chk44Oswiadczenie1")).isSelected() )
        {
            driver.findElement(By.id("cp_f_chk44Oswiadczenie1")).click();
        }
        if ( !driver.findElement(By.id("cp_f_chk44Oswiadczenie2")).isSelected() )
        {
            driver.findElement(By.id("cp_f_chk44Oswiadczenie2")).click();
        }
        if ( !driver.findElement(By.id("cp_f_chk44Oswiadczenie3")).isSelected() )
        {
            driver.findElement(By.id("cp_f_chk44Oswiadczenie3")).click();
        }

        //далее
        driver.findElement(By.id("cp_f_cmdDalej")).click();

        //сохранить page4
        driver.findElement(By.id("cp_f_cmdZakoncz")).click();
    }
}
