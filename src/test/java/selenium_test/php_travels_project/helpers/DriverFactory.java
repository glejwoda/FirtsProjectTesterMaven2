package selenium_test.php_travels_project.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;

import java.io.File;

public class DriverFactory {

    private static WebDriver driverInstance;

    /*metoda static nie wymaga tworzenia obiektu klasy aby się do niej odwołać */
    public static WebDriver getDriver(DriverType driverType) throws NoSuchDriverExeception {

        if (driverInstance == null) {
            getSpecificDriver(driverType);
            driverInstance.manage().window().maximize();
        }
        return driverInstance;
    }

    private static void getSpecificDriver(DriverType driverType) throws NoSuchDriverExeception {

        switch (driverType) {
            case IE:
                File explorerExe = new File("src/main/resources/executables.drivers/IEDriverServer.exe");
                InternetExplorerDriverService explorerService = new InternetExplorerDriverService.Builder()
                        .usingDriverExecutable(explorerExe)
                        .usingAnyFreePort().build();
                driverInstance = new InternetExplorerDriver(explorerService);
                break;

            case CHROME:
                File chromeExe = new File("src/main/resources/executables.drivers/chromedriver.exe");
                ChromeDriverService chromeService = new ChromeDriverService.Builder()
                        .usingDriverExecutable(chromeExe)
                        .usingAnyFreePort().build();
                driverInstance = new ChromeDriver(chromeService);
                break;

            case FIREFOX:
                File firefoxExe = new File("src/main/resources/executables.drivers/geckodriver.exe");
                GeckoDriverService geckoDriverService = new GeckoDriverService.Builder()
                        .usingDriverExecutable(firefoxExe)
                        .usingAnyFreePort().build();
                driverInstance = new FirefoxDriver(geckoDriverService);
                break;

            default:
                System.out.println("Brak drivera danego typu");
                throw new NoSuchDriverExeception();

        }
    }

    public static void resetDriver() {
        driverInstance = null;
    }
}
