package pages;


import pages.component.RegistrationPage;

import static com.codeborne.selenide.Selenide.executeJavaScript;

public class BasePage {
    public RegistrationPage removeBanner() {
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return null;
    }
}
