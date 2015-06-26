package pages;

import org.openqa.selenium.By;

import static support.Helpers.driver;
import static support.Helpers.find_element;

/**
 * Created by khanh.nguyen on 5/27/2015.
 */
public class BasicAuthPage {
    By congratText = By.cssSelector("p");

    public Boolean basicAuthLoaded() {
        return find_element(congratText).getText().equals("Basic Auth");
    }

    public void basicAuthLogin() {
        driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
        driver.navigate().back();
    }
}
