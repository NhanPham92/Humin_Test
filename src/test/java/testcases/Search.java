package testcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.DropDownPage;
import pages.LoginPage;
import support.SetupTest;

/**
 * Created by khanh.nguyen on 6/2/2015.
 */
public class Search extends SetupTest {


    @Test
    /*
    1. Navigate to ddau page. > Verify Search text field is existed.
    2. Type "pizza" into search text field.
     */
    public void Search_TC07() throws InterruptedException {

        LoginPage loginpage = new LoginPage();
        loginpage.Search("pizza");
        loginpage.waitForAjax();
        Assert.assertTrue(loginpage.isElementPresent(DropDownPage.dropDownList));
    }
    @Test
    /*
    1. Navigate to ddau page. > Verify Search text field is existed.
    2. Type "abcdef" into search text field.
     */
    public void Search_TC08() throws InterruptedException {

        LoginPage loginpage = new LoginPage();
        loginpage.Search("abcdef");
        loginpage.waitForAjax();
        Assert.assertFalse(loginpage.isElementPresent(DropDownPage.dropDownList));
    }
    }





