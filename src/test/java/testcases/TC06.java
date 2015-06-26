package testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import support.SetupTest;

/**
 * Created by khanh.nguyen on 6/2/2015.
 */
public class TC06 extends SetupTest {
    @DataProvider
    Object[][] getCredential() {
        return new Object[][]{
                {"nhan.qc2@gmail.com", "130992"},

        };
    }

    @Test//(dataProvider =  "getCredential")
    public void TC06() throws InterruptedException {

        LoginPage loginpage = new LoginPage();
        System.out.println(LoginPage.driver.getWindowHandle());
        loginpage.loginToFB();
       // Assert.assertEquals(loginpage.Exist_element(),Boolean.FALSE);
      // loginpage.checkLoginFail();
    }




}
