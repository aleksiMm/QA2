package Lecture7;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.assertj.core.api.Assertions.assertThat;
import org.openqa.selenium.support.ui.Select;


public class SeleniumTask2 {
    @Test
    public void ssLvTest2() {

        String driverPath = "C:\\Users\\a.sviridovics\\IdeaProjects\\QA2\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.ss.lv/");
        driver.findElement(By.id("mtd_97")).click();
        String currentUrl = driver.getCurrentUrl();
        assertThat(currentUrl).isEqualTo("https://www.ss.lv/lv/transport/cars/");
        // price range
        driver.findElement(By.id("f_o_8_min")).sendKeys("6000");
        driver.findElement(By.id("f_o_8_max")).sendKeys("10000");
        // add validation of price
        Select carYear = new Select(driver.findElements(By.className("filter_sel")).get(1));
        carYear.selectByValue("2021");

        driver.quit();

    }
}
