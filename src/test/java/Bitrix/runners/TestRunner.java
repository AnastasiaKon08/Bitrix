package Bitrix.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions (
        features = "src/test/resources/features",
        glue = "Bitrix/step_definitions",
        plugin = {
                "json:target/cucumber.json"
        },
        //tags = "@fileUploading",
        dryRun = false
)

@RunWith(Cucumber.class)
public class TestRunner {

}
