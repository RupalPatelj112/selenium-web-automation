package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriveHelper{
    public static WebDriver driver;
    private String WEB_DRIVER = "webdriver.chrome.driver";
    public void openBrowser(String browser)
    {
        if(browser == "chrome") {
            System.setProperty(WEB_DRIVER, "/Users/rupalpatel/Documents/workspace/seleniumCucmber/src/chromedriver");
            System.out.println("Launched the webpage");
            WebDriver driver = new ChromeDriver();
        }
        else {
            System.out.println("Download New driver");
        }
    }
    public void maximiseScreen()
    {
        driver.manage().window().maximize();
    }
    public void navigateToUrl(String url)
    {
        driver.get(url);
    }

    public void closeBrowser()
    {
        driver.close();
    }
}
