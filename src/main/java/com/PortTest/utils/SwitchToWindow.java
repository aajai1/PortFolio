package com.PortTest.utils;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class SwitchToWindow {
	
	public static String switchToWindow(WebDriver driver) {
        Set<String> handles = driver.getWindowHandles();  // Get all window handles
        String[] handleArray = handles.toArray(new String[0]);
        driver.switchTo().window(handleArray[handleArray.length - 1]);  // Switch to the latest window
        return driver.getCurrentUrl();  // Return the URL of the current window
    }

}
