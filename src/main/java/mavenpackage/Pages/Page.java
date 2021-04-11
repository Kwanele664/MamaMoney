package mavenpackage.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import mavenpackage.utilities.CommonUtils.Screenshot;

public class Page {
    WebDriver driver;
    WebDriverWait wait;
    Screenshot screenShot;

    public Page (WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        screenShot = new Screenshot(driver);
    }

    public void click(By elementLocation) {
        waitVisibility(elementLocation);
        driver.findElement(elementLocation).click();
    }
 
    public void writeText(By elementLocation, String text) {
        waitVisibility(elementLocation);
        driver.findElement(elementLocation).sendKeys(text);
    }

    public String readText(By elementLocation) {
        waitVisibility(elementLocation);

        return driver.findElement(elementLocation).getText();
    }

    public boolean isShowing (By elementLocation) {
        waitVisibility(elementLocation);
        if (driver.findElement(elementLocation).isDisplayed()) {
            return true;
        }
        else
            return false;
    }
 
    public void waitVisibility(By by){
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }   
}
