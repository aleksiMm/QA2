//package Lecture7;
//
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
//import static org.assertj.core.api.Assertions.assertThat;
//
//
//public class SeleniumTask1 {
//
//    @Test
//    public void ssLvTest(){
//
//        String driverPath = "C:\\Users\\a.sviridovics\\IdeaProjects\\QA2\\src\\main\\resources\\chromedriver.exe";
//        System.setProperty("webdriver.chrome.driver", driverPath);
//        ChromeDriver driver = new ChromeDriver();
//        driver.get("https://www.ss.lv/");
//        // Maximize window
//        driver.manage().window().maximize();
//        // Find and click suni un kuci
//        driver.findElement(By.id("mtd_300")).click();
//        String currentUrl = driver.getCurrentUrl();
//        assertThat(currentUrl).isEqualTo("https://www.ss.com/lv/animals/dogs/");
//
//
//
//
//
//    }
//
//
//
//}
//
//
//
//
////      driver.manage().window().fullscreen();
////      driver.manage().window().maximize();
