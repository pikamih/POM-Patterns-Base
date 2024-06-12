package com.reliquias.software.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/inicio_sesion.feature",
        glue = "com.reliquias.software.definitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = {
                "pretty",
                "json:target/serenity-reports/login/cucumber.json",
                "html:target/serenity-reports/login/serenity-html-report.html",
                "rerun:target/serenity-reports/login/rerun.txt"
        }
)
public class LoginRunner {
}