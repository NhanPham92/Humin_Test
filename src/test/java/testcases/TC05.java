package testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import support.SetupTest;

/**
 * Created by khanh.nguyen on 6/2/2015.
 */
public class TC05 extends SetupTest {
    @DataProvider
    Object[][] getCredential() {
        return new Object[][]{
                {"abcde", "00000"},

        };
    }

    @Test(dataProvider =  "getCredential")
    public void TC05(String user, String pass){

        LoginPage loginpage = new LoginPage();
        loginpage.loginToLoginPage(user, pass);
       // Assert.assertEquals(loginpage.Exist_element(),Boolean.FALSE);
//       loginpage.checkLoginFail();
    }




}
