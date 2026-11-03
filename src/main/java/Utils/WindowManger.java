package Utils;

import org.openqa.selenium.WebDriver;

public class WindowManger {
    private WebDriver driver ;

    public WindowManger(WebDriver driver){
        this.driver=driver;
    }

    public void goBack(){
        driver.navigate().back();
    }
    public void goForward(){
        driver.navigate().forward();
    }
    public void Refresh(){
        driver.navigate().refresh();
    }
    public void goTo(String url){
        driver.navigate().to(url);
    }

}
