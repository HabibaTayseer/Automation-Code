package waits;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTests {
    @Test
    public void testWaits1(){
        var ex1Page =homepage.clickDynamicLoading().clickExample1Link();
        ex1Page.clickOnStart();
        assertEquals(ex1Page.getLoadedMessage(),"Hello World!",
                "The text is not loaded yet");
    }
    @Test
    public void testWaits2(){
        var ex2Page =homepage.clickDynamicLoading().clickExample2Link();
        ex2Page.clickOnStart();
        assertEquals(ex2Page.getLoadedMessage(),"Hello World!",
                "The text is not loaded yet");
    }
}
