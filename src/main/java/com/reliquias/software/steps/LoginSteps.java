package com.reliquias.software.steps;

import com.reliquias.software.models.UsuarioGenerico;
import com.reliquias.software.pages.interactions.MainPageInteraction;
import com.reliquias.software.pages.mappings.LoginPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.Matchers.is;

public class LoginSteps {

    @Page
    private LoginPage loginPage;

    @Page
    private MainPageInteraction mainPageInteraction;

    @Step("open login page")
    public void openLoginPage() {
        loginPage.open();
    }

    @Step("clear user and password fields")
    public void clearFieldsLogin() {
        final String emptyString = "";
        loginPage.inputUsername.type(emptyString);
        loginPage.inputPassword.type(emptyString);
    }

    @Step("enter credentials")
    public void enterCredentials(UsuarioGenerico usuarioGenerico) {
        loginPage.inputUsername.type(usuarioGenerico.getUser());
        loginPage.inputPassword.type(usuarioGenerico.getPassword());
    }

    @Step("access the system")
    public void accessSystem() {
        loginPage.btnLogin.waitUntilClickable().click();
    }

    @Step("validate successful login")
    public void validateSuccessfulLogin() {
        final String messageError = "Login was unsuccessful.";
        assertThat(messageError, mainPageInteraction.getTitleMainPage(), is(equalToIgnoringCase("Tablero")));
    }

}
