package test.java.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"steps"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
