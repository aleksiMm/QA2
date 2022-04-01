package Lecture7;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.assertj.core.api.Assertions.assertThat;
import org.openqa.selenium.support.ui.Select;

public class AliTest {

    @Test
    public void aliTatoo() {
        String driverPath = "C:\\Users\\a.sviridovics\\IdeaProjects\\QA2\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.aliexpress.com/");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();

    }
}

