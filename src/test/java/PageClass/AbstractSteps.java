package PageClass;

import Driver.DriveHelper;
import org.openqa.selenium.By;

public class AbstractSteps extends DriveHelper{

    public void clickAcceptAll(){
        //Landing on google and receive Accepl all button
        driver.findElement(By.xpath("//button//div[contains(text(),'Accept all')]")).click();
    }

    public void getSearchbar(String listofplatform)
    {
        //Search bar text box locator
        driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys(listofplatform);
        System.out.println("In Searchbar");
    }

}
