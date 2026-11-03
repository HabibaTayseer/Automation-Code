package javaScript;

import base.BaseTests;
import io.qameta.allure.*;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertsTests extends BaseTests {
    @Test
    @Epic("Alerts Test")
    @Feature("Alerts Methods")
    @Story("Alert")
    @Description("This Method test the alert in internet.herokuapp")
    @Severity(SeverityLevel.BLOCKER)
    public void testAlert(){
        var javaScriptAlertsPage =homepage.clickJavaScriptAlerts();
        javaScriptAlertsPage.clickJSAlert();
        assertEquals(javaScriptAlertsPage.getAlertText(),"I am a JS Alert",
                "The alert text is incorrect");
        javaScriptAlertsPage.acceptAlert();
        assertEquals(javaScriptAlertsPage.getResultMessage(),"You successfully clicked an alert",
                "The result text is incorrect");
    }
    @Test
    @Epic("Alerts Test")
    @Feature("Alerts Methods")
    @Story("Confirm")
    @Description("This Method test the confirm in internet.herokuapp")
    public void testConfirm(){
        var javaScriptAlertsPage =homepage.clickJavaScriptAlerts();
        javaScriptAlertsPage.clickJSConfirm();
        assertEquals(javaScriptAlertsPage.getAlertText() ,"I am a JS Confirm",
                "The alert text is incorrect");
        javaScriptAlertsPage.dismissConfirm();
        assertEquals(javaScriptAlertsPage.getResultMessage(),"You clicked: Cancel",
                "The result text is incorrect");
    }
    @Test
    @Epic("Alerts Test")
    @Feature("Alerts Methods")
    @Story("Prompt")
    @Description("This Method test the prompt in internet.herokuapp")
    public void testPrompt(){
        var javaScriptAlertsPage =homepage.clickJavaScriptAlerts();
        Allure.step("Clicking Prompt");
        javaScriptAlertsPage.clickJSPrompt();
        assertEquals(javaScriptAlertsPage.getAlertText() ,"I am a JS prompt",
                "The alert text is incorrect");
        javaScriptAlertsPage.setPromptText("Route");
        javaScriptAlertsPage.acceptAlert();
        assertEquals(javaScriptAlertsPage.getResultMessage(),"You entered: Route",
                "The result text is incorrect");
    }
}
