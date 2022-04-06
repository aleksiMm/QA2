package l8Homework;

import l8Homework.pages.BasePage;
import l8Homework.pages.cinemaLogin;
import l8Homework.pages.profilePage;


import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.assertj.core.api.Assertions.assertThat;

import org.openqa.selenium.support.ui.Select;

public class forumCinemaTest {

    BasePage base = new BasePage();
    cinemaLogin login = new cinemaLogin();
    profilePage profile = new profilePage();


    @Test
    public void forumCinemaTest() {
        base.openChromeByUrl("https://www.forumcinemas.lv/rus");
        base.cLogin();

        login.enterUsername("smithalek777@gmail.com");
        login.enterPassword("testingforum1");
        login.clickLogin();
        login.clickProfile();

        profile.clearFirst();
        profile.changeFirstname("Ale");
        profile.changeLastname("Smit");
        profile.changeNumber("12345678");
        profile.changeCity("Rio");
        profile.clickSave();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        base.closeChrome();
    }
}
