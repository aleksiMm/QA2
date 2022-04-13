//package lecture10.steps;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import Lecture8.pages.BasePage;
//import Lecture8.pages.HomePagePom;
//
//public class HomePageSteps {
//
//    BasePage basePage = new BasePage();
//    HomePagePom homePagePom = new HomePagePom();
//
//    @Given("Open HomePage")
//    public void openHomePage() {
//        basePage.openChromeByUrl("https://www.ss.com/lv/");
//    }
//
//
//    @And("Open Dog category")
//    public void openDogCategory() {
//        homePagePom.openPageByCategory("dogs");
//    }
//
//    @And("Close web-driver")
//    public void closeWebDriver() {
//        basePage.closeChrome();
//    }
//
//    @And("Open Cars category")
//    public void openCarsCategory() {
//        homePagePom.openPageByCategory("cars");
//    }
//}