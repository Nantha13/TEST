package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Loginpage {
	WebDriver driver;
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="loginform-username")
	WebElement username;
	@FindBy(id="loginform-password")
	WebElement PASS;
	@FindBy(name="login-button")WebElement sub;
	public void enterusername(String usernamefield,String passwordfield)
	{
		username.sendKeys(usernamefield);
		PASS.sendKeys(passwordfield);
	}
	public void click()
	{
		sub.click();
	}
}
