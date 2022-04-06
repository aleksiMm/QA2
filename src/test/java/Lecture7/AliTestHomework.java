package Lecture7;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.assertj.core.api.Assertions.assertThat;

public class AliTestHomework {

    @Test
    public void aliTatoo() {

        String driverPath = "C:\\Users\\a.sviridovics\\IdeaProjects\\QA2\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.aliexpress.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//img[@class='_24EHh']")).click();
        driver.findElement(By.xpath("//img[@class='btn-close']")).click();
        driver.findElement(By.xpath("//img[@class='close-btn']")).click();
        driver.findElement(By.id("search-key")).sendKeys("tattoo");
        String searchingFor = driver.findElement(By.id("search-key")).getAttribute("value");
        assertThat(searchingFor).isEqualTo("tattoo");
        driver.findElement(By.xpath("//input[@class = 'search-button']")).click();
        driver.findElement(By.xpath("//input[@placeholder= 'min']")).sendKeys("10");
        driver.findElement(By.xpath("//input[@placeholder= 'max']")).sendKeys("20");
        driver.findElement(By.xpath("//a[@class= 'ui-button narrow-go']")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();

    }
}

