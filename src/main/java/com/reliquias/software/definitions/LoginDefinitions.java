package com.reliquias.software.definitions;

import com.reliquias.software.models.UsuarioGenerico;
import com.reliquias.software.steps.LoginSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class LoginDefinitions {

    @Steps
    private LoginSteps loginSteps;

    @Dado("que el usuario navega a la página de inicio de sesión")
    public void usuarioNavegaPaginaDeInicioSesion() {
        loginSteps.openLoginPage();
        loginSteps.clearFieldsLogin();
    }

    @Cuando("incia sesión con las credenciales de acceso correctas")
    public void ingresaLasCredencialesDeAcceso() {
        loginSteps.enterCredentials(
                UsuarioGenerico.builder()
                        .user("admin")
                        .password("serenity")
                        .build());
        loginSteps.accessSystem();
    }

    @Entonces("debería ver el tablero en la página principal")
    public void deberiaVerTableroPaginaPrincipal() {
        loginSteps.validateSuccessfulLogin();
    }

}
