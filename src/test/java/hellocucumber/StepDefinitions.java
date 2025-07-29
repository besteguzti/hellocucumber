package hellocucumber;

import io.cucumber.java.en.*;
import static org.assertj.core.api.Assertions.assertThat;

public class StepDefinitions {

    private String today;
    private String actualAnswer;

    // Este metodo recibe el día como parámetro desde el feature
    @Given("today is {string}")
    public void today_is(String today) {
        this.today = today;
    }

    // Simula la pregunta "¿Es ya viernes?"
    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_friday_yet() {
        IsItFriday isItFriday = new IsItFriday();
        actualAnswer = isItFriday.isItFriday(today);
    }

    // Verifica la respuesta esperada
    @Then("I should be told {string}")
    public void i_should_be_told(String expectedAnswer) {
        assertThat(actualAnswer).isEqualTo(expectedAnswer);
    }
}
