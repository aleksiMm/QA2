package l8Homework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

    public static ChromeDriver driver;

    public void openChromeByUrl(String url){
        String driverPath = "C:\\Users\\a.sviridovics\\IdeaProjects\\QA2\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }
    By LoginB = By.xpath("//div[@class='btn-login btn btn-default popover-link hidden-xs hidden-sm']");

        public void cLogin() {
            driver.findElement(LoginB).click();
        }
    public void closeChrome(){
        driver.quit();
    }

}