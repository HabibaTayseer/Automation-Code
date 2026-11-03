package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;

import static org.testng.Assert.assertEquals;

public class LoginTests extends BaseTests {
    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = homepage.clickFormAuthenticationLink();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        var secureAreaPage =loginPage.clickLoginButton();
        String message =secureAreaPage.getMessage();
        assertEquals(message,"You logged into a secure area!\n" +
                "×","You didn't login");
    }
}
