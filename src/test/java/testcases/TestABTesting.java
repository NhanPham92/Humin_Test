package testcases;

import org.testng.annotations.Test;
import pages.ABTestingPage;
import pages.HomePage;
import support.SetupTest;

/**
 * Created by namdo on 04/06/2015.
 */
public class TestABTesting extends SetupTest {
    @Test
    public void test_ABTestingpage(){
        HomePage homepage = new HomePage();
        homepage.homePageLoaded();
        homepage.gotoABTesting();

        ABTestingPage abtesting = new ABTestingPage();
        abtesting.abTestingLoaded();
    }

}
