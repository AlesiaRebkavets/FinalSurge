package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInTest extends BaseTest{



    @Test(description = "Successful Login")
    public void signIn(){
        loginPage.open();
        loginPage.login("abcd252abcd@mailinator.com", "Password1!");
        Assert.assertEquals(loginPage.);
    }
}



// abcd252abcd@mailinator.com
// Password1!
