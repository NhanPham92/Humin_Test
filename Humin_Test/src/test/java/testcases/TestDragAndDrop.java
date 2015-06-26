package testcases;

import org.testng.annotations.Test;
import pages.DragAndDropPage;
import pages.HomePage;
import support.SetupTest;

/**
 * Created by namdo on 08/06/2015.
 */
public class TestDragAndDrop extends SetupTest {
    @Test
    public void test_dragAndDrop(){
        HomePage homePage = new HomePage();
        homePage.homePageLoaded();
        homePage.gotoDragAndDropPage();

        DragAndDropPage draganddroppage = new DragAndDropPage();
        draganddroppage.checkDragAndDropPageLoaded();
        draganddroppage.dragAndDropColumn();
    }
}
