package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;


/**
 * This class contains the business logic.
 * We can have querys, requests or steps to do certain things (how to log into the app).
 * If we need to only complete a field or click a button, we can put it in the steps.
 */

public class EntryService {

    public static void addHour() {
        MobileActionManager.click(EntryConstants.HOUR);
    }
    public static void clickProject() {
        MobileActionManager.click(EntryConstants.PROJECT);
        MobileActionManager.click(ProjectConstants.SELECT_PROJECT);
    }
    public static void clickTask(String nombretarea) {
        MobileActionManager.click(EntryConstants.TASK);
        MobileActionManager.click(TaskConstants.TASK_BUTTON);
        //MobileActionManager.click(TaskConstants.TASK_NAME);
        MobileActionManager.setInput(TaskConstants.TASK_NAME, nombretarea);
        MobileActionManager.click(TaskConstants.SAVE_BUTTON);
    }
    public static void clickSave() {
        MobileActionManager.click(EntryConstants.SAVE_ICON);
        MobileActionManager.waitVisibility(TaskConstants.TASK_LIST);

    }

    public static void isTaskCreated() {

        Assert.assertTrue(MobileActionManager.isVisible(TaskConstants.TASK_LIST));

    }
}
