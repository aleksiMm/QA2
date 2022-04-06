package l8Homework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class cinemaLogin extends BasePage {

    By uName = By.xpath("//input[@name='userName']");

    By pswd = By.xpath("//input[@name='password']");

    By loginBtn = By.xpath(" //button[@class='btn btn-primary btn-lg']");

    By enterProfile = By.xpath("//button[@class='btn btn-success']");

    public void enterUsername(String user) {driver.findElement(uName).sendKeys(user);}
    public void enterPassword(String pass) { driver.findElement(pswd).sendKeys(pass);}

    public void clickLogin() {driver.findElement(loginBtn).click();}
    public void clickProfile() {driver.findElement(enterProfile).click();}

}