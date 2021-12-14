package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    private static final By EMAIL = By.id("login_name");
    private static final By PASSWORD = By.id("login_password");
 // private static final By REMEMBER_ME = By.id("login_remember");
    private static final By LOGIN_BUTTON = By.cssSelector("[type=submit]");
    private static final By ERROR_EMAIL = By.cssSelector("[for=login_name]");
    private static final By ERROR_PASSWORD = By.cssSelector("[for=login_password]");



    public LoginPage(WebDriver driver){
        super(driver);
    }

    public void open(){
        driver.get(BASE_URL);
    }

    public void login(String email, String password){
       driver.findElement(EMAIL).sendKeys(email);
       driver.findElement(PASSWORD).sendKeys(password);
       driver.findElement(LOGIN_BUTTON).click();
    }

    public String getErrorEmail(){
        return driver.findElement(ERROR_EMAIL).getText();
    }

    public String getErrorPassword(){
        return driver.findElement(ERROR_PASSWORD).getText();
    }



}
