package testcases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckBoxsPage;
import pages.HomePage;
import support.SetupTest;

import java.util.List;

/**
 * Created by namdo on 05/06/2015.
 */
public class TestCheckBoxes extends SetupTest {
    @Test
    public void test_checkBoxesPage() {
        HomePage homepage = new HomePage();
        homepage.homePageLoaded();
        homepage.gotoCheckBoxesPage();

        CheckBoxsPage checkboxespage = new CheckBoxsPage();
        checkboxespage.checkBoxesPageLoaded();
        List<WebElement> webElementList = checkboxespage.get_defaultCheckBox();
        Assert.assertEquals(webElementList.get(0).isSelected(), false);
        Assert.assertEquals(webElementList.get(1).isSelected(), true);
        checkboxespage.select_checkBoxes();
    }


}
