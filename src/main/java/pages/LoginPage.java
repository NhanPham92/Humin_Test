package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

import static support.Helpers.find_element;

/**
 * Created by khanh.nguyen on 6/2/2015.
 */
public class LoginPage {

    public static WebDriver driver;
    /*
     *Login Page's elements
     * @loginPageTitle
     * @username
     * @password
     * @loginBtn
     */
    By Login = By.id("buttonLoginUser");
    By loginPageTitle = By.xpath("//*[@id='content']/div/h2");
    public static By username = By.xpath("//*[@name='usermail']");
    By password = By.xpath("//*[@name='password']");
    By loginBtn = By.xpath("//*[@id='form-login']/button");
    By loginFB = By.xpath("//*[@id='buttonLoginFacebook']/a");
    By emailFB = By.id("email");
    By passFB = By.id("pass");
    By loginFBButton = By.id("loginbutton");
    By Userinfo = By.id("user-info");
    By formLogIn = By.id("form-login");
    By searchTextField = By.id("food-type-text-search");
    By link = By.linkText("");
    String nameBefore = find_element(Login).getText();
//    public Boolean loginPageLoaded() {
//        return find_element(loginPageTitle).getText().equals("Login Page");
//    }

    public void loginToLoginPage(String user, String pass) {
        find_element(Login).click();
        find_element(username).sendKeys(user);
        find_element(password).sendKeys(pass);
        find_element(loginBtn).click();
        System.out.println("clicked login button");
      //  find_element(Userinfo);
//        driver.navigate().back();
    }

    public void waitForAjax()  {
        System.err.println("Checking active ajax calls by calling jquery.active ...");
        try {
            if (driver instanceof JavascriptExecutor) {
                JavascriptExecutor jsDriver = (JavascriptExecutor)driver;

                for (int i = 0; i< 30; i++)
                {
//		        	if(i == Constant.TIME_WAIT -1){
//		        		System.err.println("Time out : FAILED");
//		        		Assert.assertFalse(true, "Time out");
//		        	}
                    Object numberOfAjaxConnections = jsDriver.executeScript("return jQuery.active");
                    // return should be a number
                    if (numberOfAjaxConnections instanceof Long) {
                        Long n = (Long)numberOfAjaxConnections;
                        System.err.println("Number of active jquery ajax calls: " + n);
                        if (n.longValue() == 0L)
                            break;
                    }
                    Thread.sleep(1000);
                }
            }
            else {
                System.err.println("Web driver: " + driver + " cannot execute javascript");
            }
        }
        catch (InterruptedException e) {
            System.err.println(e);
        }
    }

    public void loginToFB() throws InterruptedException {
        String parentHandle = driver.getWindowHandle();
        find_element(loginFB).click();
        Thread.sleep(5000);
        //String parentHandle = driver.getWindowHandle(); // get the current window handle
       // find_element(loginFB).click(); // click some link that opens a new window
        Set<String> allwindows = driver.getWindowHandles();

        for (String winHandle : allwindows) {
            driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
            driver.manage().window().maximize();
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.elementToBeClickable(find_element(emailFB)));


            find_element(emailFB).sendKeys("nhan.qc2@gmail.com");
            find_element(passFB).sendKeys("123456");
            find_element(loginFBButton).click();
            driver.close(); // close newly opened window when done with it
            driver.switchTo().window(parentHandle); // switch back to the original window
        }

            //  find_element(Userinfo);
//        driver.navigate().back();
        }

    public Boolean Exist_element(){
        try{
            WebElement el=find_element(Login);
            return true;
        } catch (Exception ex){
            return false;
        }
    }
    public Boolean checkLoginPass() {
        try {

            find_element(username).isDisplayed();
            return false;
        } catch (Exception ex) {
            return true;
        }
    }
    public Boolean isElementPresent(By locator)
    {
        try {
            if(find_element(locator).isDisplayed()){
                System.out.println("Element display");
                return true;
            }
            System.out.println("Element not display");
            return false;
        } catch (NoSuchElementException ex){
            System.out.println("Element not display");
            return false;
    }

    }
    public void Search()
    {
        find_element(searchTextField).sendKeys("xoi");
    }


}
