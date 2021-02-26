package br.com.guilhermerodrigues.selenium.runner;

import br.com.guilhermerodrigues.selenium.core.utils.report.Report;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

/**
 * Gerar report com o plugin CuCumber baseado no custom.css acima
 * @author Guilherme-Rodrigues
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        monochrome = true,
        plugin = {"pretty", "json:target/cucumber-report/cucumber.json"},
        features = {".//src//main//resources//features//"},
        glue = {"br/com/guilhermerodrigues/selenium/test/steps", "br/com/guilhermerodrigues/selenium/core/hooks"},
        tags = {"@web"}
)
public class RunTest {
    @AfterClass
    public static void gerarRelatorio() {
        Report.gerarRelarotioClueCumber();
    }
}
