package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static support.Helpers.find_element;

/**
 * Created by namdo on 09/06/2015.
 */
public class DropDownPage {
    By dropDownText = By.xpath("//*[@id='food-type-text-search_listbox']/li[1]/a/div[2]/h4");
    By dropDownList = By.id("food-type-text-search_listbox");

    public Boolean checkDropDownPageLoaded() {
        return find_element(dropDownText).getText().equals("Dropdown List");
    }

    public List<WebElement> get_defaultItem() {
        Select select = new Select(find_element(dropDownList));
        List<WebElement> listItem = select.getOptions();
        return listItem;
    }

    public void select_dropDownItems() throws InterruptedException {
        Select select = new Select(find_element(dropDownList));
        List<WebElement> listItem = select.getOptions();
        for(int i = 0; i < listItem.size(); i++){
            select.selectByIndex(i);
            Thread.sleep(2000);
        }
    }
}
