package mavenpackage.Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage extends Page {
    String baseURL = "https://xndev.com/palindrome";

    By palindromeTextBox = By.id("originalWord");
    By submitPalindrome = By.id("button1");
    By palindromeResult = By.id("palindromeResult");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage goToExcelonPalindrome() {
        driver.get(baseURL);

        return this;
    }

    public HomePage takeHomeScreenShot() throws IOException {
        waitVisibility(palindromeTextBox);
        screenShot.takeSnapshot("Home_Screen");

        return this;
    }

    public HomePage verifyPalindrome(String text) {
        writeText(palindromeTextBox, text);
        click(submitPalindrome);
        
        Assert.assertTrue(isPalandrome(text));
        Assert.assertTrue(getPalandromeMessage().contains("Yes!"));

        return this;
    }

    public HomePage verifyNotPalindrome(String text) {
        writeText(palindromeTextBox, text);
        click(submitPalindrome);
        
        Assert.assertFalse(isPalandrome(text));
        Assert.assertTrue(getPalandromeMessage().contains("No!"));

        return this;
    }

    private Boolean isPalandrome(String text) {
        String reversedText = getReverseText(text);

        if (reversedText == text)
            return true;
        else
            return false;
    }

    private String getReverseText (String text) {
        StringBuilder word = new StringBuilder();
        word.append(text);

        return word.reverse().toString();
    }

    private String getPalandromeMessage() {
        String palindromeText = readText(palindromeResult);

        return palindromeText;
    }

}
