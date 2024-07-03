import io.cucumber.junit.Cucumber
import io.cucumber.junit.CucumberOptions
import org.junit.runner.RunWith

@RunWith(Cucumber::class)
@CucumberOptions(
    features = ["classpath:features"],
    plugin = ["pretty", "html:target/cucumber/html"],
    tags = "not @Wip" // This will run all scenarios that are not tagged with @Wip
)
class RunCucumberTest
