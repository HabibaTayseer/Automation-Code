package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Ex2Page {
        private WebDriver driver ;
        private By startButtonLocator = By.cssSelector("#start > button");
        private By loadedMessageLocator = By.cssSelector("#finish > h4");

        public Ex2Page(WebDriver driver){
            this.driver=driver;
        }

        public void clickOnStart(){
            driver.findElement(startButtonLocator).click();
        }

        public String getLoadedMessage(){
            //Explict Wait
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            //First mak sure that element is present in DOM
//            wait.until(ExpectedConditions.presenceOfElementLocated(loadedMessageLocator));
//            wait.until(ExpectedConditions.visibilityOf(driver.findElement(loadedMessageLocator)));
            //nstead of the 2 above
 //           wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(loadedMessageLocator));

            //Fluent Wait
            FluentWait<WebDriver> wait =new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10))
                    .pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
            wait.until(ExpectedConditions.visibilityOfElementLocated(loadedMessageLocator));

            return driver.findElement(loadedMessageLocator).getText();
        }
}
