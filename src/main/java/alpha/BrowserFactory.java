package alpha;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by Trupesh on 14/06/2017.
 */
public class BrowserFactory {
    public static WebDriver driver;


    //@BeforeClass
//@Parameters("browser")
    public static WebDriver getbrowser() throws IOException {

        System.setProperty("webdriver.chrome.driver", "C:\\Cucumbe jars\\WebDrivers\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
        /*DesiredCapabilities cap = DesiredCapabilities.chrome();

        cap.setPlatform(Platform.WIN10);

        URL url = new URL("http://192.168.0.19:5555/wd/hub");


        driver = new RemoteWebDriver(url,cap);*/
        //System.setProperty("webdriver.gecko.driver","C:\\WebDrivers\\geckodriver.exe");
        //  WebDriver driver = new FirefoxDriver();
        //Runtime.getRuntime().exec("C:\\AuthenticationHandler\\autoitcode.exe");
        driver.manage().window().maximize();
        driver.get("http://www.bbc.com");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);


        return driver;

    }


   /* public static void seleniumgrid() throws MalformedURLException {
     DesiredCapabilities cap = DesiredCapabilities.chrome();

        cap.setPlatform(Platform.WIN10);

        URL url = new URL("http://192.168.0.19:5555/wd/hub");

        driver = new RemoteWebDriver(url,cap);

    };*/


}
