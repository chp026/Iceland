package org.example.PageObjectPackage;

import org.apache.commons.io.FileUtils;
import org.example.BaseclassPackage.DriverFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import java.io.File;
import java.io.IOException;

public class Resultpage extends DriverFactory {

    @FindBy(xpath = "//button[contains(text(),'Shop £1 Value')]")
    WebElement poundproducts;

    public void AllpoundProducts() throws InterruptedException {
        Thread.sleep(2000);
        poundproducts.click();
    }

    public void scrollpage(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600);");
    }
    public void homepageScreenShot1() throws IOException {
        TakesScreenshot screenshot = ((TakesScreenshot)driver);
        File sourcefile = screenshot.getScreenshotAs(OutputType.FILE);
        File destionationfile = new File("C:\\Users\\Chirag\\Desktop\\Icelandresult.png");
        FileUtils.copyFile(sourcefile,destionationfile);
    }
}
