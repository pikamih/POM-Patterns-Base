package com.reliquias.software.pages.mappings;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;

@DefaultUrl("https://serenity.is/demo/")
public class LoginPage extends PageObject {

    @FindBy(xpath = "//input[@name = 'Username']")
    public WebElementFacade inputUsername;

    @FindBy(xpath = "//input[@type = 'password' and contains(@id, 'Login')]")
    public WebElementFacade inputPassword;

    @FindBy(xpath = "//button[contains(text(), 'Iniciar sesión')]")
    public WebElementFacade btnLogin;

}
