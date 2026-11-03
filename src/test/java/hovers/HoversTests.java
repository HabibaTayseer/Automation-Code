package hovers;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HoversTests extends BaseTests {
    @Test
    public void testHovers (){
        int index = 1 ;
        var hoverspage = homepage.clickHovers();
        var figurecaption = hoverspage.hoverOverFigure(index);

        assertTrue(figurecaption.isCaptionDisplayed(),
                "The Caption is not deisplayed");
        assertEquals(figurecaption.getName(),"name: user"+index ,
                "The Name is not correct");
        assertEquals(figurecaption.getLinkText(),"View profile",
                "The Link text is not correct");
        assertTrue(figurecaption.getLinkUrl().contains("/users/"+index),
                "The Link text is not correct");

    }
}
