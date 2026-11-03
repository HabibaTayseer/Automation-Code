package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    //Locators/fields
    private WebDriver driver;
    private By formAuthenticationLink = By.linkText("Form Authentication");


   //Constructors
    public HomePage (WebDriver driver){
        this.driver=driver;
    }

    //Methods
    public LoginPage clickFormAuthenticationLink(){
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }
    public DropdownPage clickDropDown(){
        clickLink("dropdown");
        return new DropdownPage(driver);
    }
    public HoversPage clickHovers(){
        clickLink("hovers");
        return new HoversPage(driver);
    }
    public KeyPressesPage clickKeyPressers (){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }
    public JavaScriptAlertPage clickJavaScriptAlerts(){
        clickLink("JavaScript Alerts");
        return new JavaScriptAlertPage(driver);
    }
    public FileUploadPage clickFileUpload (){
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }
    public EntryAdPage clickEntryAd(){
        clickLink("Entry Ad");
        return new EntryAdPage(driver);
    }
    public FramesPage clickFrames(){
        clickLink("frames");
        return new FramesPage(driver);
    }
    public DynamicLoadingPage clickDynamicLoading(){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }
    public LargeAndDeepDomPage clickLargeAndDeepDom(){
        clickLink("Large & Deep DOM");
        return new LargeAndDeepDomPage(driver);
    }
    public infiniteScrollPage clickInfniteScroll(){
        clickLink("Infinite Scroll");
        return new infiniteScrollPage(driver);
    }

    //GenericMethod
    public void clickLink (String LinkText){
        driver.findElement(By.linkText(LinkText)).click();
    }
}

