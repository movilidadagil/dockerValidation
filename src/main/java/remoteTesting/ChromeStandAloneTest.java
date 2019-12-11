package remoteTesting;

/* Created by JavaUnifiedTester   hasanaligul  2019-12-11  */

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;


public class ChromeStandAloneTest {


   public static void main(String[] args) throws MalformedURLException {
       URL url = new URL("http://localhost:4545/wd/hub");


       DesiredCapabilities cap=DesiredCapabilities.chrome();
       RemoteWebDriver driver = new RemoteWebDriver(url,cap);
       driver.get("http://javaunifiedtester.com/force");
       System.out.println(driver.getTitle());
   }

}
