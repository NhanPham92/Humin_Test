package testcases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropDownPage;
import pages.HomePage;
import support.SetupTest;

import java.util.List;

/**
 * Created by namdo on 09/06/2015.
 */
public class TestDropDown extends SetupTest {
    @Test
    public void test_dropDownList () throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.homePageLoaded();
        homePage.gotoDropDownPage();

        DropDownPage dropDownPage = new DropDownPage();
        Assert.assertEquals(dropDownPage.checkDropDownPageLoaded(), Boolean.TRUE);
        List<WebElement> listItem = dropDownPage.get_defaultItem();
        Assert.assertEquals(listItem.get(0).isSelected(), true);
        dropDownPage.select_dropDownItems();
    }
}
