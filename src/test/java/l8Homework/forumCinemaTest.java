package l8Homework;

import l8Homework.pages.BasePage;
import l8Homework.pages.cinemaLogin;
import l8Homework.pages.profilePage;


import org.junit.Test;


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
        profile.validateFn();
        profile.changeLastname("Smit");
        profile.validateLn();
        profile.changeNumber("12345678");
        profile.validatePhone();
        profile.changeCity("Rio");
        profile.validateCity();
        profile.clickSave();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        base.closeChrome();
    }
}
