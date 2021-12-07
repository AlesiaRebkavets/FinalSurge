package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    public static final String BASE_URL = "https://log.finalsurge.com/";
    WebDriver driver;
    WebDriverWait wait;

    public BasePage(WebDriver driver){
       this.driver = driver;
       wait = new WebDriverWait(driver, 10);
    }
}
