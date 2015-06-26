package testcases;

import org.testng.annotations.Test;
import pages.GeolocationPage;
import pages.HomePage;
import support.SetupTest;

/**
 * Created by khanh.nguyen on 5/27/2015.
 */
public class TestGeolocation extends SetupTest {
    @Test
    private void test_Geolocation(){
        HomePage homePage = new HomePage();
        homePage.homePageLoaded();
        homePage.gotoGeolocationPage();

        GeolocationPage geolocationPage = new GeolocationPage();
        geolocationPage.geoPageLoaded();
        geolocationPage.click_whereBtn();
    }
}
