package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    private static final By EMAIL = By.id("login_name");
    private static final By PASSWORD = By.id("login_password");
    private static final By REMEMBER_ME = By.id("login_remember");
    private static final By LOGIN_BUTTON = By.cssSelector("[type=submit]");



    public LoginPage(WebDriver driver){
        super(driver);
    }





}
