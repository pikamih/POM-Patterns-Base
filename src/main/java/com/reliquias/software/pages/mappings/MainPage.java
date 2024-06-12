package com.reliquias.software.pages.mappings;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;

public class MainPage extends PageObject {

    @FindBy(xpath = "//main//h1")
    public WebElementFacade txtTitleMainPage;

}
