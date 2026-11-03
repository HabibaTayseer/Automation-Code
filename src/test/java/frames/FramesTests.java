package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FramesTests extends BaseTests {
    @Test
    public void testFrames(){
        var nestedFrames =homepage.clickFrames().clickNestedFrames();
        assertTrue(nestedFrames.getLeftFrameText().contains("LEFT"),
                "The left text is incorrect");
        assertTrue(nestedFrames.getBottomFrameText().contains("BOTTOM"),
                "The buttom text is incorrect");
    }
}
