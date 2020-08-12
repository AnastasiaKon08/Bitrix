package Bitrix.step_definitions;

import Bitrix.pages.LoginPage;
import Bitrix.utilities.ConfigurationReader;
import Bitrix.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class Login_stepDefinitions {
    public LoginPage loginPage = new LoginPage();

    @Given("user is on landing page")
    public void user_is_on_landing_page() {
      String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);
    }


    @Given("user logs in as {string}")
    public void user_logs_in_as(String role) {
        loginPage.login(role);

    }

    @And("user navigates to {string}")
    public void userNavigatesTo(String module) {
        loginPage.navigateTo(module);
    }
}
