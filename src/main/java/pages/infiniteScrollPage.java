package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class infiniteScrollPage {
    private WebDriver driver;
    private By paragraphsLocator = By.className("jscroll-added");

    public infiniteScrollPage (WebDriver driver){
        this.driver=driver;
    }

    /**
     *
     * @param index the paragraph number you want to scroll to
     */
    public void scrollIntoParagraph(int index) {
        var js = (JavascriptExecutor) driver;
        String script = "window.scrollTo(0,document.body.scrollHeight)";
        js.executeScript(script);
        while (getNumberOfParagraphs()<index) {
            js.executeScript(script);
        }
    }

//method to get number of paragraphs in Dom
public int getNumberOfParagraphs(){
      return driver.findElements(paragraphsLocator).size() ;
}

}
