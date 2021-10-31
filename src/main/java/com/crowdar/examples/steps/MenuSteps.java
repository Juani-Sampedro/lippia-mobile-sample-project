package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.HomeService;
import com.crowdar.examples.services.MenuService;
import cucumber.api.java.en.Then;
import io.cucumber.java.en.And;

/**
 * This class handles the steps in the features files and connects with the service in case of having business logic.
 * Otherwise, if it is a simple action, like clicking a button and it has nothing related to business logic, is correct to put here.
 */
public class MenuSteps extends PageSteps {

    @And("The user press on Settings option")
    public void theUserPressOnSettingsOption() {MenuService.clickOnSettingOption();
    }
}
