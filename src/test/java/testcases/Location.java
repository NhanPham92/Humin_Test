package testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.DropDownPage;
import pages.LoginPage;
import support.SetupTest;

/**
 * Created by khanh.nguyen on 6/2/2015.
 */
public class Location extends SetupTest {
    @DataProvider


    @Test
    /*
    1. Navigate to ddau page. > Verify Search text field is existed.
    2. Type "pizza" into search text field.
    3. Click on first suggest search.
     */
    public void Search_TC09() throws InterruptedException {

        LoginPage loginpage = new LoginPage();
        loginpage.Search("pizza");
        DropDownPage dropDownPage = new DropDownPage();
        loginpage.waitForAjax();
        dropDownPage.select_dropDownItems();
    }
    }





