import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class Locator {

    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        //        1. Open browser
//        2. Go to Vytrack login page
// open browser and go to url
        openBrowserURl ("chrome", "http://qa2.vytrack.com/user/login");
        driver.manage().window().maximize(); //maximize screen
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


//       //By.id
//        WebElement userName = driver.findElement(By.id("prependedInput")); //int i =5;
//       //.By class
//        userName = driver.findElement(By.className("span2"));   //i=6;
//        // By.name
//        userName = driver.findElement(By.name("_username"); //i=8
//        //By.xpath or css
//        userName = driver.findElement(By.xpath("//tagname[@attribute='value']")); //i=10

 //        3. Login as any user
         WebElement userName= driver.findElement(By.id("prependedInput"));
         userName.sendKeys("salesmanager264");  // driver.findElement(By.id("prependedInput")).sendKeys("salesmanager264");

         WebElement password = driver.findElement(By.id("prependedInput2"));
         password.sendKeys("UserUser123"+Keys.ENTER); //password.sendKeys(Keys.ENTER);

        Thread.sleep(5000);
//        4. Click on your name on top right
        WebElement name = driver.findElement(By.className("dropdown-toggle"));
        name.click();

        //        5. Click on My Configuration

        WebElement myConfiguration = driver.findElement(By.linkText("My Configuration"));
        myConfiguration.click();

        Thread.sleep(5000);

//        6. Verify that title start with the same name on top right
        String currentTitle = driver.getTitle();

        if (currentTitle.startsWith("Alex Jones")) {
            System.out.println("Pass");
            System.out.println("Title starts with Alex Jones");
        }else {
            System.out.println("Fail");
            System.out.println("Title does not start with Alex Jones");
        }


        System.out.println( currentTitle.startsWith("Alex Jones")? ("Pass"): ("Fail")) ;


        driver.close(); //driver.quit();


    }

    public static void openBrowserURl (String browser, String url)  {

        switch (browser.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;

            case "ie":
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                break;
                default:

                    System.out.println("Wrong browser");

        }

        driver.get(url);

    }
}
