import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends  DriverForAllPage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    // Locate Email input field
    private By EmailField = By.id("email");
    public WebElement ReturnEmailInputField(){
       WebElement EmailEle =driver.findElement(EmailField);
        return  EmailEle ;
    }
    // Locate Password Input Field
    private By LocatePasswordField = By.cssSelector("input[type=\"password\"]");
    public  WebElement ReturnPasswordInputField() {
        WebElement PasswordELE= driver.findElement(LocatePasswordField);
        return PasswordELE  ;
    }

    // Locate Login buton
    By LocateLoginButton = By.cssSelector("button[class=\"w-[180px] py-4 rounded-xl bg-[#5570F1] flex items-center justify-center\"]");
    public  WebElement ReturnLoginButtonEle(){
       WebElement LoginELE = driver.findElement(LocateLoginButton);
       return  LoginELE ;
    }

}
