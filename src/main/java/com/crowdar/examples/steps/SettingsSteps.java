package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.HomeService;
import com.crowdar.examples.services.SettingsService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

/**
 * This class handles the steps in the features files and connects with the service in case of having business logic.
 * Otherwise, if it is a simple action, like clicking a button and it has nothing related to business logic, is correct to put here.
 */
public class SettingsSteps extends PageSteps {

    @And("The user clicks on Enable dark mode toggle icon")
    public void theUserClicksOnEnableDarkModeToggleIcon() {SettingsService.clickOnEnableDarkMode();
    }

    @Then("The dark mode is on")
    public void theDarkModeIsOn() {SettingsService.isDarkModeOn();
    }
}
