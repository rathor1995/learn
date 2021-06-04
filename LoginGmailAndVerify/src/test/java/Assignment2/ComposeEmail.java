package Assignment2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComposeEmail {
    @FindBy(xpath="//div[@class='T-I T-I-KE L3']") private WebElement compose;
    @FindBy(xpath ="//textarea[@rows='1']") private WebElement To;
    @FindBy(xpath = "//input[@name='subjectbox']") private WebElement Subject;
    @FindBy(xpath= "//div[@id=':rp']") private  WebElement Body;
    @FindBy(xpath="//div[@id=':sp']")private WebElement click;
    @FindBy(xpath="//div[@class='J-Ph Gi J-N J-Ph-Kq J-N-JT']")private WebElement lebel;
    @FindBy(xpath="//div[@class='J-LC-Jz']") private WebElement social;
    @FindBy(xpath="//div[@id=':qa']") private WebElement send;
    @FindBy(xpath="//div[@id=':1u']") private WebElement social2;


    public ComposeEmail(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
    public void clickOnCompose()
    {compose.click();}
    public void EnterTo(String ToEmail)
    {To.sendKeys(ToEmail);}
    public void messageSubject(String msg)
    {Subject.sendKeys(msg);}
    public void messageBody(String bodymsg)
    {Body.sendKeys(bodymsg);}
   public void clickOnButtons() throws InterruptedException {click.click();
   lebel.click();
   social.click();
   send.click();
   Thread.sleep(4000);
    social2.click();}



}
