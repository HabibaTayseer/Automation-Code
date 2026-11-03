package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EntryAdPage {
    private WebDriver driver;
    private By closeLocator = By.xpath("//P[text()='Close']");
    private By entyAdHeaderLocator=By.cssSelector("#content>div>h3");

    public EntryAdPage(WebDriver driver){
        this.driver=driver;
    }

    public void clickClose(){
        driver.findElement(closeLocator).click();
    }
    public String getHeaderText(){
        return driver.findElement(entyAdHeaderLocator).getText();
    }
}
