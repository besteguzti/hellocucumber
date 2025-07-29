package hellocucumber;

import io.cucumber.java.en.*;
import static org.assertj.core.api.Assertions.assertThat;

public class CalculadoraStepDefinitions {

    private Calculadora calculadora;
    private int resultado;

    @Given("la calculadora está encendida")
    public void la_calculadora_esta_encendida() {
        calculadora = new Calculadora();
    }

    @When("sumo {int} y {int}")
    public void sumo_y(int a, int b) {
        resultado = calculadora.sumar(a, b);
    }

    @When("resto {int} y {int}")
    public void resto_y(int a, int b) {
        resultado = calculadora.restar(a, b);
    }

    @When("multiplico {int} y {int}")
    public void multiplico_y(int a, int b) {
        resultado = calculadora.multiplicar(a, b);
    }

    @When("divido {int} y {int}")
    public void divido_y(int a, int b) {
        resultado = calculadora.dividir(a, b);
    }

    @Then("el resultado debe ser {int}")
    public void el_resultado_debe_ser(int esperado) {
        assertThat(resultado).isEqualTo(esperado);
    }
}
