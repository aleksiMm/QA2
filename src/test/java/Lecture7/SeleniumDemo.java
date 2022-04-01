package Lecture7;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.assertj.core.api.Assertions.assertThat;
import org.openqa.selenium.support.ui.Select;

public class SeleniumDemo {

    @Test
    public void firstSeleniumDemoTest() {
//        Configure path to driver location
        String driverPath = "C:\\Users\\a.sviridovics\\IdeaProjects\\QA2\\src\\test\\resources\\chromedriver.exe";
//Configure system for driver location in system
        System.setProperty("webdriver.chrome.driver", driverPath);
//        Create driver object using path from system location
        ChromeDriver driver = new ChromeDriver();
//        Open url using newly created object
        driver.get("https://www.1a.lv/");
//        Wait for 5 seconds
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        Close driver
        driver.quit();
    }
}