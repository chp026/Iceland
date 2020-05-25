package org.example.BaseclassPackage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class Hooks {
    DriverFactory driverFactory = new DriverFactory();

    @Before
    public void setup(){
        driverFactory.openBrowser();
    }
    @After
    public void teardown() throws InterruptedException, IOException {
        driverFactory.closeBrowser();
    }
}
