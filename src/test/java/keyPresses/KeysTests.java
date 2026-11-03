package keyPresses;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class KeysTests extends BaseTests {
    @Test
    public void testKeys(){
        var keyPressersPage = homepage.clickKeyPressers();
        //keyPressersPage.setText("a"+ Keys.BACK_SPACE);
        keyPressersPage.setText(Keys.chord(Keys.SHIFT,"a"));
        assertEquals(keyPressersPage.getResultMessage(),"You entered: A",
                "Message is incorrect");
    }
}
