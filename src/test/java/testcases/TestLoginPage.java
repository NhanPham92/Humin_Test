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

    @Test
    public void testLoginPage_TC01(){
        /*
        1. Navigate to ddau page
        2. Click on "" Đăng nhập"" button.
        3. Type valid username into ""Username hoặc Email"" field(Ex: maruko92)
        4. Type valid password into ""Password"" field(Ex: 123456)
        5. Click ""Hoàn tất"" button"
         */
        LoginPage loginpage = new LoginPage();
        loginpage.loginToLoginPage(LoginPage.namePass, LoginPage.passPass);
        Assert.assertFalse(loginpage.isElementPresent(LoginPage.loginFB));

    }

    @Test
    /*
    1. Navigate to ddau page
    2. Click on "" Đăng nhập"" button.
    3. Type valid username into ""Username hoặc Email"" field(Ex: maruko92)
    4. Type invalid password into ""Password"" field(Ex: 000000)
    5. Click ""Hoàn tất"" button"
     */
    public void testLoginPage_TC02(){
        LoginPage loginpage = new LoginPage();
        loginpage.loginToLoginPage(LoginPage.namePass, LoginPage.passFail1);
        Assert.assertTrue(loginpage.isElementPresent(LoginPage.loginFB));

    }

    @Test
    /*
    1. Navigate to ddau page
    2. Click on "" Đăng nhập"" button.
    3. Type invalid username into ""Username hoặc Email"" field(Ex: maruko92)
    4. Type valid password into ""Password"" field(Ex: 000000)
    5. Click ""Hoàn tất"" button"
     */
    public void testLoginPage_TC03(){
        LoginPage loginpage = new LoginPage();
        loginpage.loginToLoginPage(LoginPage.nameFail1, LoginPage.passPass);
        Assert.assertTrue(loginpage.isElementPresent(LoginPage.loginFB));

    }

    @Test
    /*
    1. Navigate to ddau page
    2. Click on "" Đăng nhập"" button.
    3. Type invalid username into ""Username hoặc Email"" field(Ex: maruko92)
    4. Type invalid password into ""Password"" field(Ex: 000000)
    5. Click ""Hoàn tất"" button"
     */
    public void testLoginPage_TC04(){
        LoginPage loginpage = new LoginPage();
        loginpage.loginToLoginPage(LoginPage.nameFail1, LoginPage.passFail1);
        Assert.assertTrue(loginpage.isElementPresent(LoginPage.loginFB));

    }

    @Test
    /*
    1. Navigate to ddau page
    2. Click on Log in Facebook icon.
    3. Type valid username into ""Username hoặc Email"" field(Ex: nhan.qc2@gmail.com)
    4. Type valid password into ""Password"" field(Ex: 130992)
    5. Click ""Đăng nhập"" button
    6. Click on Ok button on cofirm page."
     */
    public void TC05() {

        LoginPage loginpage = new LoginPage();
        loginpage.loginToFB();
        Assert.assertFalse(loginpage.isElementPresent(LoginPage.loginFB));
    }
    @Test
    /*
    1. Navigate to ddau page
    2. Click on Log in Facebook icon.
    3. Type valid username into ""Username hoặc Email"" field(Ex: nhan.qc2@gmail.com)
    4. Type valid password into ""Password"" field(Ex: 130992)
    5. Click ""Đăng nhập"" button
    6. Click on Cancel button on cofirm page."
     */
    public void TC06() {

        LoginPage loginpage = new LoginPage();
        loginpage.cancelLoginToFB();
        Assert.assertTrue(loginpage.isElementPresent(LoginPage.loginFB));
    }
}
