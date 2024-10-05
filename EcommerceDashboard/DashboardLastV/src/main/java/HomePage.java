import org.checkerframework.checker.units.qual.N;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends  DriverForAllPage{


    public HomePage(WebDriver driver) {
        super(driver);
    }

    private By LocateNumberOfCustomerOBG  = By.cssSelector("#root > div > div > div.bg-\\[\\#F4F5FA\\] > div > div > div.md\\:col-span-11.px-4 > div > div:nth-child(3) > div.grid.grid-cols-1.gap-3 > div > div > div.flex.items-center.justify-between.gap-12 > div:nth-child(1) > p") ;
    WebElement ReturnNumOfCustomerInSystem() {
        WebElement C  = driver.findElement(LocateNumberOfCustomerOBG);
        return  C ;
    }

    private By LoacteNumerOfCustomerUnBlockedOBG = By.cssSelector("#root > div > div > div.bg-\\[\\#F4F5FA\\] > div > div > div.md\\:col-span-11.px-4 > div > div:nth-child(3) > div.grid.grid-cols-1.gap-3 > div > div > div.flex.items-center.justify-between.gap-12 > div:nth-child(2) > p");
    WebElement ReturnNumOfUnBoackedCustomer(){
        WebElement x = driver.findElement(LoacteNumerOfCustomerUnBlockedOBG);
        return  x  ;
    }

    private By LocateBlockedCustomer = By.cssSelector("#root > div > div > div.bg-\\[\\#F4F5FA\\] > div > div > div.md\\:col-span-11.px-4 > div > div:nth-child(3) > div.grid.grid-cols-1.gap-3 > div > div > div.flex.items-center.justify-between.gap-12 > div:nth-child(3) > p");
    WebElement returnBlockedCustomer(){
        WebElement x  = driver.findElement(LocateBlockedCustomer);
        return  x  ;
    }

    private By NumOfAllOredersOBG = By.cssSelector("#root > div > div > div.bg-\\[\\#F4F5FA\\] > div > div > div.md\\:col-span-11.px-4 > div > div:nth-child(3) > div.grid.grid-cols-1.gap-3 > div > div > div.flex.items-center.justify-between.gap-12 > div:nth-child(4) > p");
    WebElement ReturnNumOfAllOreders(){
        WebElement x = driver.findElement(NumOfAllOredersOBG);
        return  x ;
    }


    private By NumOfOrderPendingOBG = By.cssSelector("#root > div > div > div.bg-\\[\\#F4F5FA\\] > div > div > div.md\\:col-span-11.px-4 > div > div:nth-child(3) > div.grid.grid-cols-1.gap-3 > div > div > div.flex.items-center.justify-between.gap-12 > div:nth-child(5) > p") ;
    WebElement ReturnNumOfPendingOrders(){
        WebElement x = driver.findElement(NumOfOrderPendingOBG);
        return  x ;
    }
    private By NumOfOrderCancledOBG = By.cssSelector("#root > div > div > div.bg-\\[\\#F4F5FA\\] > div > div > div.md\\:col-span-11.px-4 > div > div:nth-child(3) > div.grid.grid-cols-1.gap-3 > div > div > div.flex.items-center.justify-between.gap-12 > div:nth-child(7) > p");
    WebElement ReturnNumOfOrderCancled(){
        WebElement x = driver.findElement(NumOfOrderCancledOBG);
        return  x ;
    }
    private By NumOfOrderCompletedOBG = By.cssSelector("#root > div > div > div.bg-\\[\\#F4F5FA\\] > div > div > div.md\\:col-span-11.px-4 > div > div:nth-child(3) > div.grid.grid-cols-1.gap-3 > div > div > div.flex.items-center.justify-between.gap-12 > div:nth-child(6) > p");
   WebElement ReturnNumOfOrderCompleted(){
       WebElement c = driver.findElement(NumOfOrderCompletedOBG) ;
       return c ;
   }


   private By GetRecentProductAddedOBG = By.cssSelector("#root > div > div > div.bg-\\[\\#F4F5FA\\] > div > div > div.md\\:col-span-11.px-4 > div > div:nth-child(3) > div.grid.grid-cols-1.gap-5.md\\:grid-cols-5.mt-5 > div.md\\:col-span-2.md\\:h-full > div > div > div:nth-child(1)");
   WebElement ReturnLastProductAddedToSystem(){
       WebElement RecentProduct = driver.findElement(GetRecentProductAddedOBG);
       return RecentProduct ;
   }

     By ListFilter = By.cssSelector("ul[id=\":rr:\"] li") ;
   public  By returnListFilter(){
       return  ListFilter ;
   }











}
