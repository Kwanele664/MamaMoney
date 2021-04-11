package mavenpackage.tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.*;

public class PalindromeTest extends BaseTest{


    @Test
    public void loginWithIncorrectDetails() throws IOException {
        homePage //always use Home Page as your starting point
            .goToExcelonPalindrome()
            .takeHomeScreenShot();
    }

    @Test
    public void loginWithCorrectDetails () {
        
    }
}

