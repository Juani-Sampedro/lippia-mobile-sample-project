package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.EntryService;
import com.crowdar.examples.services.HomeService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

/**
 * This class handles the steps in the features files and connects with the service in case of having business logic.
 * Otherwise, if it is a simple action, like clicking a button and it has nothing related to business logic, is correct to put here.
 */
public class EntrySteps extends PageSteps {



    @And("The user add the hour")
    public void theUserAddTheHour() {
        EntryService.addHour();
    }

    @And("The user selects the project")
    public void theUserSelectsTheProject() {
        EntryService.clickProject();

    }
    @And("The user press on Tasks option with: (.*)")
    public void theUserPressOnTasksOptionWithNombretarea(String nombretarea) {EntryService.clickTask(nombretarea);
    }

    @And("The user clicks on Save button")
    public void theUserClicksOnSaveButton() {EntryService.clickSave();
    }

    @Then("The task is created")
    public void theTaskIsCreated() {EntryService.isTaskCreated();
    }
}
