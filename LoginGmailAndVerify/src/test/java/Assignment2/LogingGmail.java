package Assignment2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogingGmail {
    @FindBy(xpath="//input[@type='email']") private WebElement id;
    @FindBy(xpath="//span[@jsname='V67aGc']") private WebElement next1;
    @FindBy(xpath="//input[@type='password']") private WebElement password;
    @FindBy(xpath="//div[@class='VfPpkd-RLmnJb']") private WebElement next2;

    public LogingGmail(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public void EnterEmail(String username)
    {id.sendKeys(username);}
    public void ClickOnNext1()
    {next1.click();}
    public void EnterPassword(String PWD)
    {password.sendKeys(PWD);}
    public void ClickOnNext2()
    {next2.click();}

}
