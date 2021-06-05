package Assignment2;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.*;

import java.io.IOException;

public class Test extends BaseClass{
    LogingGmail login;
    ComposeEmail compose;

    @BeforeClass
    public void openBrowser()
    {
        BrowserOpen();
         login = new LogingGmail(driver);
         compose = new ComposeEmail(driver);
    }


    @org.testng.annotations.Test
    public void loginToGmail() throws IOException, InvalidFormatException, InterruptedException {
        login.EnterEmail(UtilityClass.getTD(0,0));
        login.ClickOnNext1();
        login.EnterPassword(UtilityClass.getTD(0,1));
        login.ClickOnNext2();

        compose.clickOnCompose();
        compose.EnterTo(UtilityClass.getTD(0,2));
        compose.messageSubject(UtilityClass.getTD(0,3));
        compose.messageBody(UtilityClass.getTD(0,4));






    }





}
