package mm;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import com.sun.jndi.toolkit.url.Uri;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RecalculateArrayOfLoansProd {
    private WebDriver driver;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    private static final List<Integer> ids = Arrays.asList(1199238,1198915,1198779,1197829,1196929,1196789,1196643,1196001,1195660,1194460,1193573,1193562,1193122,1192421,1192152,1192059,1191327,1190849,1190479,1190335,1190314,1190313,1190068,1190018,1189937,1189250,1189237,1188723,1188396,1188393,1188020,1187104,1186990,1186978,1186695,1186569,1186545,1186281,1186224,1186153,1186114,1185789,1184646,1183642,1183535,1178767,1176611,1175428,1175385,1154577,1154518,1152358);

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        //System.setProperty("webdriver.chrome.driver","C:\\git\\java_for_qa\\addressbook-web-tests\\chromedriver.exe");
       //WebDriver driver = new ChromeDriver();
        URL uri = new URL("https://www.moneyman.pl/secure/new-admin/index.html#/loans/");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(300000, TimeUnit.SECONDS);
    }

    @Test
    public void testGg() throws Exception {
        // ERROR: Caught exception [ERROR: Unsupported command [getEval | ids.length | ]]

        for (Integer id : ids) {
            driver.get("https://www.moneyman.pl/secure/new-admin/index.html#/loans/loan/" + id);
            Thread.sleep(5000);
            driver.findElement(By.xpath("//div[17]")).click();
            driver.findElement(By.linkText("Recalculate")).click();
            System.out.println("done for loan " + id + " ");
            Thread.sleep(5000);
        }

    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }
}