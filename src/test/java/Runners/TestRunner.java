package Runners;

import io.cucumber.testng.CucumberOptions;
import test.TestBase;
@CucumberOptions(features = "src/test/java/features",
glue = {"Steps"},
plugin = {"pretty","html:target/cucumber-html-report"})
public class TestRunner extends TestBase {

}
