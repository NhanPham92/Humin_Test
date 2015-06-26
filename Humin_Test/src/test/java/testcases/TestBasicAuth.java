package testcases;

import org.testng.annotations.Test;
import pages.BasicAuthPage;
import pages.HomePage;
import support.SetupTest;

/**
 * Created by khanh.nguyen on 5/27/2015.
 */
public class TestBasicAuth extends SetupTest {
    @Test
    public void test_BasicAuthPage(){
        HomePage homepage = new HomePage();
        homepage.homePageLoaded();

        BasicAuthPage authpage = new BasicAuthPage();
        authpage.basicAuthLogin(); //Caching Credentials
        homepage.homePageLoaded();
        homepage.gotoBasicAuthPage();
        authpage.basicAuthLoaded();
    }
}
