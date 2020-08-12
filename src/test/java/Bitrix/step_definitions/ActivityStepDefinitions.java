package Bitrix.step_definitions;

import Bitrix.pages.ActivityStreamPage;
import Bitrix.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class ActivityStepDefinitions {
    ActivityStreamPage activityStreamPage = new ActivityStreamPage();

    @When("user clicks on send message button")
    public void user_clicks_on_send_message_button() {
       activityStreamPage.clickOnSendMassageInput();
    }

    @And("updates following file:")
    public void updatesFollowingFile(Map<String, String> dataTable) {
        activityStreamPage.uploadFile(dataTable.get("File path"));
        BrowserUtils.waitFor(2);
    }

    @Then("user clicks on send button")
    public void userClicksOnSendButton() {
        activityStreamPage.clickOnSendButton();

        }
    }

