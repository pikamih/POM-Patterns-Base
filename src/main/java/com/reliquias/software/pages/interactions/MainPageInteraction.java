package com.reliquias.software.pages.interactions;

import com.reliquias.software.pages.mappings.MainPage;
import org.fluentlenium.core.annotation.Page;
import net.serenitybdd.core.pages.PageObject;

public class MainPageInteraction extends PageObject{

    @Page
    private MainPage mainPage;

    public String getTitleMainPage() {
        return mainPage.txtTitleMainPage.waitUntilVisible().getText();
    }

}
