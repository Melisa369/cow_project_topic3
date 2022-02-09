package uni.fmi.project;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/uni/fmi/register", 
                 monochrome = true, 
                 plugin = {"pretty", "html:target/raports"})


public class ProjectStarter {

}
