package javaScript;
//LargeAndDeepDOM
import base.BaseTests;
import org.testng.annotations.Test;

public class JsExecuterTests extends BaseTests {
    //Large And Deep DOM Scenario
//    @Test
//    public void testScrollToElement(){
//        var largeAndDeepDomPage=homepage.clickLargeAndDeepDom();
//        largeAndDeepDomPage.scrollToTable();
//    }

    //Infinite Scroll Scenario
    @Test
    public void testInfiniteScroll(){
        homepage.clickInfniteScroll().scrollIntoParagraph(5);
    }
}
