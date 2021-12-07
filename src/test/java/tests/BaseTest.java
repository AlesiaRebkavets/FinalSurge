package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {

   protected WebDriver driver;
   LoginPage loginPage;

   @BeforeMethod
    void setup(@Optional("chrome") String browser){
       WebDriverManager.firefoxdriver().setup();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       loginPage = new LoginPage(driver);
   }

   @AfterMethod
   void tearDown(){
      driver.quit();
   }



}
