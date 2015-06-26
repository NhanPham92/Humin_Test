package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import support.SetupTest;

import static java.lang.Boolean.FALSE;

/**
 * Created by khanh.nguyen on 6/2/2015.
 */
public class TestLoginPage extends SetupTest {
    @DataProvider
    Object[][] getCredentials() {
        return new Object[][]{
                {"maruko92", "123456"},
        };
    }

    @Test(dataProvider =  "getCredentials")
    public void testLoginPage(String user, String pass){
        LoginPage loginpage = new LoginPage();
        loginpage.loginToLoginPage(user, pass);
//        try {
//            Thread.sleep(5000);
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
        Assert.assertFalse(loginpage.isElementPresent(LoginPage.username));

    }

}
