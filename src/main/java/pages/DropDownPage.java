package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

import static support.Helpers.find_element;

/**
 * Created by namdo on 09/06/2015.
 */
public class DropDownPage {
    By dropDownText = By.xpath("//*[@id='food-type-text-search_listbox']/li[1]/a/div[2]/h4");
    public static By dropDownList = By.xpath("//*[@id='food-type-text-search_listbox']");
    By detailName = By.xpath("//*[@id='header']/div[2]/div/h1");
    By detailLocation = By.xpath("//*[@id='place-address']/div/div[1]");
    By detailImage = By.xpath("//*[@id='place-photos']/div/div[1]/div[1]/a/img");

    public Boolean checkDropDownPageLoaded() {
        return find_element(dropDownText).getText().equals("Dropdown List");
    }

    public List<WebElement> get_defaultItem() {
        Select select = new Select(find_element(dropDownList));
        List<WebElement> listItem = select.getOptions();
        return listItem;
    }

    public void select_dropDownItems() throws InterruptedException {
        LoginPage loginPage= new LoginPage();
        String nameBefore = find_element(dropDownText).getText();
        System.out.print(nameBefore);
        find_element(dropDownText).click();
        loginPage.waitForAjax();
        String nameAfter = find_element(detailName).getText();
        System.out.print(nameAfter);
        Assert.assertEquals(nameBefore,nameAfter);
        loginPage.isElementPresent(detailLocation);
        loginPage.isElementPresent(detailImage);

    }
}
