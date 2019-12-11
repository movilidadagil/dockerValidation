package remoteTesting;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

/* Created by JavaUnifiedTester   hasanaligul  2019-12-11  */
public class ChromeTest2 {
    @Test
    public void test2()throws MalformedURLException {
        URL url = new URL("http://localhost:4545/wd/hub");


        DesiredCapabilities cap=DesiredCapabilities.chrome();
        RemoteWebDriver driver = new RemoteWebDriver(url,cap);
        driver.get("http://javaunifiedtester.com/force/admin");
        System.out.println(driver.getTitle());
    }
}
