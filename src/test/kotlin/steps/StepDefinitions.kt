import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When


class StepDefinitions {

    @Given("I have {int} cukes in my belly")
    fun iHaveCukesInMyBelly(cukes: Int) {
        val belly = Belly()
        belly.eat(cukes)
    }

    @When("I wait {int} hour")
    fun waitOneHour(hour: Int): Boolean {
        return true
    }

    @Then("my belly should growl")
    fun myBellyShouldGrow(): Boolean {
        return true
    }
}
