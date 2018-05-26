package stepDefintions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserStepDefinitions {

  @Given("^que escribo mi primera feature$")
  public void que_escribo_mi_primera_feature() throws Throwable {
      // Write code here that turns the phrase above into concrete actions
      System.out.format("mi primera feature\n");
  }

  @When("^compruebo algo$")
  public void compruebo_algo() throws Throwable {
      // Write code here that turns the phrase above into concrete actions
      System.out.format("compruebo algo\n");
  }

  @Then("^el resultado debe ser correcto$")
  public void el_resultado_debe_ser_correcto() throws Throwable {
      // Write code here that turns the phrase above into concrete actions
      System.out.format("todo correcto\n");
  }


}
