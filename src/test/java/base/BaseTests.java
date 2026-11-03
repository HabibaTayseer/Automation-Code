package base;

import Utils.WindowManger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
//driver.manage().window().maximize();
// driver.manage().window().setSize(new Dimension(430,932));
//driver.findElements(linksLocator);
//List<WebElement> links = driver.findElements(linksLocator); //lw aayza akhznha
//System.out.println("This is the number of elements :"+links.size());
//driver.findElement(inputsLink).click();

//driver.close();
//driver.quit();
public class BaseTests {
    protected HomePage homepage;
    private WebDriver driver;

    //    private By linksLocator=By.tagName("a");
//    private By inputsLink = By.linkText("Inputs");
    public WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
        homepage = new HomePage(driver);
    }

    @AfterClass
    public void tearDown() {
        driver.close();
    }

    public WindowManger getWindowManger(){
        return new WindowManger(driver);
    }

}


//    static void main() {
//        BaseTest basetest = new BaseTest();
//        basetest.setup();
//    }
//}
