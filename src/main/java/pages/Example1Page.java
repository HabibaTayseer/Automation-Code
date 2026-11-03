package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Example1Page {
    private WebDriver driver ;
    private By startButtonLocator = By.cssSelector("#start > button");
    private By loadedMessageLocator = By.cssSelector("#finish > h4");

    public Example1Page(WebDriver driver){
        this.driver=driver;
    }

    public void clickOnStart(){
        driver.findElement(startButtonLocator).click();
    }

    public String getLoadedMessage(){
        //Explict Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(loadedMessageLocator)));
        return driver.findElement(loadedMessageLocator).getText();
    }
}
