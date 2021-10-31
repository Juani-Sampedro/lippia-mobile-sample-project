package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.HomeConstants;
import com.crowdar.examples.constants.SettingsConstants;
import org.testng.Assert;

/**
 * This class contains the business logic.
 * We can have querys, requests or steps to do certain things (how to log into the app).
 * If we need to only complete a field or click a button, we can put it in the steps.
 */
public class SettingsService {
    public static void isDarkModeOn() {
        Assert.assertTrue(MobileActionManager.getElement(SettingsConstants.ENABLE_DARK_MODE_OPTION).getAttribute("text").contains("ACTIVAR"));
    }
    public static void clickOnEnableDarkMode() {
        MobileActionManager.click(SettingsConstants.ENABLE_DARK_MODE_OPTION);
    }
}
