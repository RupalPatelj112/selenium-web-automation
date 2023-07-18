import Driver.DriveHelper;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks{
    public DriveHelper driver = new DriveHelper();

@Before
public void setUp()
{
    System.out.println("Open browser");
    driver.openBrowser("chrome");
    driver.maximiseScreen();
    driver.navigateToUrl("https://www.google.com/");
}

@After
public void tearDown()
{
    System.out.println("Close browser");
    driver.closeBrowser();
}
}
