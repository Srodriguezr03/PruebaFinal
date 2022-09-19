package TestRunner;

import Definition.PruebaDefinition;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features ="src/test/resources/features",
        glue = {"Definition"},
        plugin = {"pretty","html:reportes/cucumber-html-report/report.html","json:reportes/cucumber.json"}
)
public class Runner {
}
