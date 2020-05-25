package org.example.PageObjectPackage;

import org.apache.commons.io.FileUtils;
import org.example.BaseclassPackage.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.File;
import java.io.IOException;

public class Homepage extends DriverFactory {

    public void homePageURL() {
        String actualurl = driver.getCurrentUrl();
        Assert.assertThat(actualurl, Matchers.containsString("iceland"));
    }
    @FindBy(xpath = "//a[@class='header-nav-link expandable-menu-toggle d-none d-md-block']")
    WebElement menu;
    public void Menu(){
        menu.click();
    }
    @FindBy(xpath = "//a[@id='PRO_nav_link']")
    WebElement specialoffers;
    public void specialOffersMenu(){
        specialoffers.click();
    }
    @FindBy(xpath = "//li[@class='menu-category-item expandable-menu-wrapper active']//div[@class='menu-category-level-2 expandable-menu']//div[@class='menu-category-panel-wrapper']//ul[@class='menu-sub-cat-list']//li//a[@class='menu-sub-cat-link'][contains(text(),'View all')]")
    WebElement allSpecialOffers;
    public void AllSpecialOffersMenu(){
        allSpecialOffers.click();
    }
    public void ResultPageURL() {
        String actualurl = driver.getCurrentUrl();
        Assert.assertThat(actualurl, Matchers.containsString("offers"));
    }
    public void homepageScreenShot() throws IOException {
        TakesScreenshot screenshot = ((TakesScreenshot)driver);
        File sourcefile = screenshot.getScreenshotAs(OutputType.FILE);
        File destionationfile = new File("C:\\Users\\Chirag\\Desktop\\Icelandhome.png");
        FileUtils.copyFile(sourcefile,destionationfile);
    }

}
