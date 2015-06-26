package pages;

import org.openqa.selenium.By;

import static support.Helpers.find_element;

/**
 * Created by namdo on 04/06/2015.
 */
public class ABTestingPage {
    By abText = By.xpath("//*[@id='content']/div/h3");

    public Boolean abTestingLoaded() {
        return find_element(abText).getText().equals("A/B Test Control");
    }

}
