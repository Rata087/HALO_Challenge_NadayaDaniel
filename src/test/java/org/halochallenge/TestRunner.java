package org.halochallenge;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = {"org.halochallenge"},
        plugin = {"pretty", "json:target/TestRunner-report.json"},
        tags = "@HaloChallenge"
)

public class TestRunner {
}
