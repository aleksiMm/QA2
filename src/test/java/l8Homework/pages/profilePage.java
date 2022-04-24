package l8Homework.pages;

import org.openqa.selenium.By;
import static org.assertj.core.api.Assertions.assertThat;


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

    public void validateFn (){
        String newText = driver.findElement(firstName).getAttribute("value");
        assertThat(newText).isEqualTo("Ale");
    }


    public void changeLastname(String lastname) { driver.findElement(lastName).sendKeys(lastname); }

    public void validateLn (){
        String newText = driver.findElement(lastName).getAttribute("value");
        assertThat(newText).isEqualTo("Smit");
    }

    public void changeNumber(String phone) {
        driver.findElement(phoneNum).sendKeys(phone);
    }
    public void validatePhone (){
        String newText = driver.findElement(phoneNum).getAttribute("value");
        assertThat(newText).isEqualTo("12345678");
    }

    public void changeCity(String city) {
        driver.findElement(cityCha).sendKeys(city);
    }
    public void validateCity (){
        String newText = driver.findElement(cityCha).getAttribute("value");
        assertThat(newText).isEqualTo("Rio");
    }

    public void clickSave() {
        driver.findElement(saveBtn).click();
    }


}