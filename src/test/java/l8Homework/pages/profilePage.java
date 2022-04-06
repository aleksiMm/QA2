package l8Homework.pages;

import org.openqa.selenium.By;

import static org.assertj.core.api.Assertions.assertThat;

import org.openqa.selenium.WebDriver;

public class profilePage extends BasePage {

    By firstName = By.id("inputFirstName");
    By lastName = By.id("inputLastName");
    By phoneNum = By.id("inputMobile");
    By cityCha = By.id("inputCity");
    By saveBtn = By.xpath("//button[@class='btn btn-primary']");


    public void clearFirst() {
     driver.findElement(firstName).clear();
     driver.findElement(lastName).clear();
     driver.findElement(phoneNum).clear();
     driver.findElement(cityCha).clear();

    }

    public void changeFirstname(String firstname) {
        driver.findElement(firstName).sendKeys(firstname);
    }

    public void changeLastname(String lastname) {
        driver.findElement(lastName).sendKeys(lastname);
    }

    public void changeNumber(String phone) {
        driver.findElement(phoneNum).sendKeys(phone);
    }

    public void changeCity(String city) {
        driver.findElement(cityCha).sendKeys(city);
    }

    public void clickSave() {
        driver.findElement(saveBtn).click();
    }


}