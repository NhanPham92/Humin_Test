package testcases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.DropDownPage;
import pages.HomePage;
import pages.LoginPage;
import support.SetupTest;

import java.util.List;

/**
 * Created by khanh.nguyen on 6/2/2015.
 */
public class TC08 extends SetupTest {

    @DataProvider
    Object[][] getCredentials() {
        return new Object[][]{
                {"maruko92", "123456"},
        };
    }


    public class TestDropDown extends SetupTest {
        @Test
        public void test_dropDownList() throws InterruptedException {
            LoginPage loginpage = new LoginPage();
            loginpage.Search();
            DropDownPage dropDownPage = new DropDownPage();
            List<WebElement> listItem = dropDownPage.get_defaultItem();
            Assert.assertEquals(listItem.get(0).isSelected(), true);
            //dropDownPage.select_dropDownItems();
        }

    }
}
