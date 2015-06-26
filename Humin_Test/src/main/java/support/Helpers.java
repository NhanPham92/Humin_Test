package support;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by khanh.nguyen on 6/2/2015.
 */
public class Helpers {
    public static WebDriver driver;

    /**
     * Initialize the webdriver. Must be called before using any helper methods. *
     */
    public static void init(WebDriver webDriver) {
        driver = webDriver;
    }

    /**
     * Return an element by locator *
     */
    public static WebElement find_element(By locator) {
        return driver.findElement(locator);
    }

    /**
     * Return a List<WebElement> by locator *
     */
    public static List<WebElement> find_elements(By locator) {
        return driver.findElements(locator);
    }

    /**
     * Take screen shot
     *
     * @return File
     * @throws IOException
     */
    public static File takeScreenshot(String SCREENSHOT_PATH) {

        DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
        //get current date time with Date()
        Date date = new Date();
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile, new File(SCREENSHOT_PATH + dateFormat.format(date).toString() + ".png"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.err.println(e);
        }
        return scrFile;
    }

}
