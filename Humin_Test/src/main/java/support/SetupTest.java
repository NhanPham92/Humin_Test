package support;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import static support.Helpers.driver;
/**
 * Created by khanh.nguyen on 6/2/2015.
 */
public class SetupTest {
    @BeforeMethod
    public void setUp(){
        driver = new FirefoxDriver();
        driver.get("http://diadiemanuong.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        System.out.println(driver.getWindowHandle());
        Helpers.init(driver);
    }

    @AfterMethod
    public void tearDown()
    {
     driver.quit();
    }
}
