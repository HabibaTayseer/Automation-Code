package modal;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ModalTests extends BaseTests {
    @Test
    public void testModal(){
        var entryAdPage = homepage.clickEntryAd();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        entryAdPage.clickClose();
        assertEquals(entryAdPage.getHeaderText() , "Entry Ad",
                "The Header is incorrect");

    }
}
