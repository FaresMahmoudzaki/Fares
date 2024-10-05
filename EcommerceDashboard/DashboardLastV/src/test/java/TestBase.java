import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public WebDriver driver ;
    ChromeOptions returnChromOpion() {
        ChromeOptions options =  new ChromeOptions() ;
        options.addArguments("--Headless") ;
         return  options ;
    }

    @BeforeMethod
    public void SetUp(){
        WebDriverManager.chromedriver().setup();
        driver =  new ChromeDriver(returnChromOpion());
        driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS) ;
        driver.get("");
    }

    @AfterMethod
    public void Quit(){
        driver.close();
    }
}
