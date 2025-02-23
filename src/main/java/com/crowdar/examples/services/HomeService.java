package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.HomeConstants;
import org.testng.Assert;

/**
 * This class contains the business logic.
 * We can have querys, requests or steps to do certain things (how to log into the app).
 * If we need to only complete a field or click a button, we can put it in the steps.
 */
public class HomeService {

    public static void isViewLoaded() {
        MobileActionManager.waitVisibility(HomeConstants.TEXT_HOME_PAGE);
        Assert.assertTrue(MobileActionManager.isVisible(HomeConstants.TEXT_HOME_PAGE), HomeConstants.VIEW_NOT_DISPLAYED_MESSAGE);
    }
    public static void clickOnMenuIcon() {
        MobileActionManager.click(HomeConstants.MENU_ICON);
    }
    public static void clickOnPlusIcon() {
        MobileActionManager.click(HomeConstants.PLUS_ICON);
    }
}
