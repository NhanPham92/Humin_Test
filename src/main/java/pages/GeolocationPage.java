package pages;

import org.openqa.selenium.By;

import static support.Helpers.driver;
import static support.Helpers.find_element;

/**
 * Created by khanh.nguyen on 5/27/2015.
 */
public class GeolocationPage {
    By geoText = By.xpath("//*[@id='content']/div/h3");
    By whereBtn = By.xpath("//*[@id='content']/div/button");

    public Boolean geoPageLoaded() {
        return find_element(geoText).getText().equals("Geolocation");
    }

    public void click_whereBtn() {
        find_element(whereBtn).click();
        driver.navigate().back();
    }
}
