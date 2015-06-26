package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import static support.Helpers.driver;
import static support.Helpers.find_element;

/**
 * Created by namdo on 08/06/2015.
 */
public class DragAndDropPage {
    By dragAndDrogText = By.xpath("//*[@id='content']/div/h3");
    By columnA = By.xpath("//*[@id='column-a']");
    By columnB = By.xpath("//*[@id='column-b']");

    public Boolean checkDragAndDropPageLoaded() {
        return find_element(dragAndDrogText).getText().equals("Drag and Drop");
    }

    public void dragAndDropColumn() {
        Actions action = new Actions(driver);
        action.dragAndDrop(find_element(columnA), find_element(columnB)).build().perform();
    }


}
