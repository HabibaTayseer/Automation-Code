package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private WebDriver driver;
    private By example1Locator =By.linkText("Example 1: Element on page that is hidden");
    private By example2Locator =By.linkText("Example 2: Element rendered after the fact");


    public DynamicLoadingPage(WebDriver driver){
        this.driver=driver;
    }

    public Example1Page clickExample1Link(){
        driver.findElement(example1Locator).click();
        return new Example1Page(driver);
    }
    public Ex2Page clickExample2Link(){
        driver.findElement(example2Locator).click();
        return new Ex2Page(driver);
    }
}
