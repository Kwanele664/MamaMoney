package mavenpackage.tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.*;

public class PalindromeTest extends BaseTest{
    @Test
    public void Word_That_Is_A_Palandrome() throws IOException{
        homePage //always use Home Page as your starting point
            .goToExcelonPalindrome()
            .takeHomeScreenShot()
            .verifyPalindrome("level");
    }

    @Test
    public void Phrase_That_Is_A_Palandrome() throws IOException{
        homePage 
            .goToExcelonPalindrome()
            .takeHomeScreenShot()
            .verifyPalindrome("step on no pets");
    }

    @Test
    public void Word_That_Is_Not_A_Palandrome() throws IOException{
        homePage
            .goToExcelonPalindrome()
            .takeHomeScreenShot()
            .verifyNotPalindrome("mama");
    }

    @Test
    public void Number_That_Is_Not_A_Palandrome() throws IOException{
        homePage
            .goToExcelonPalindrome()
            .takeHomeScreenShot()
            .verifyNotPalindrome("2021");
    }

    @Test
    public void Number_That_Is_A_Palandrome() throws IOException{
        homePage
            .goToExcelonPalindrome()
            .takeHomeScreenShot()
            .verifyPalindrome("1881");
    }

    @Test
    public void Date_That_Is_A_Palandrome() throws IOException{
        homePage
            .goToExcelonPalindrome()
            .takeHomeScreenShot()
            .verifyPalindrome("12/11/21");
    }

    @Test
    public void Date_That_Is_Not_A_Palandrome() throws IOException{
        homePage
            .goToExcelonPalindrome()
            .takeHomeScreenShot()
            .verifyNotPalindrome("12/10/21");
    }

    @Test
    public void Mixture_Of_Character_And_Numbers_That_Is_A_Palandrome() throws IOException{
        homePage
            .goToExcelonPalindrome()
            .takeHomeScreenShot()
            .verifyPalindrome("2aba2");
    }

    @Test
    public void First_Letter_Case_Sensetive_Word_That_Is_Not_Palandrome() throws IOException{
        homePage
            .goToExcelonPalindrome()
            .takeHomeScreenShot()
            .verifyNotPalindrome("Madam");
    }

    @Test
    public void Case_Sensetive_Word_All_Letters_That_Is_A_Palandrome() throws IOException{
        homePage
            .goToExcelonPalindrome()
            .takeHomeScreenShot()
            .verifyPalindrome("MADAM");
    }

}

