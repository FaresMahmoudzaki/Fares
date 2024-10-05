import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Home extends TestBase {
    public HomePage home ;
    @Test
    public void x (){
        List<WebElement> FilterData =driver.findElements(home.ListFilter);
        FilterData.get(0);
    }
}
