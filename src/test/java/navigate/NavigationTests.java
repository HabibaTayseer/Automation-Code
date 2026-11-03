package navigate;

import Utils.WindowManger;
import base.BaseTests;
import org.testng.annotations.Test;

public class NavigationTests extends BaseTests {
    @Test
    public void testNavigation() {
        homepage.clickDynamicLoading().clickExample1Link();  //ex1page
        getWindowManger().goBack(); //dynamicloadingPage
        getWindowManger().goForward(); //ex1Page
        getWindowManger().Refresh();
        getWindowManger().goTo("https://www.google.com/?zx=1793412850929");
    }
}
