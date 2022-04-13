//package lecture10.steps;
//
//import io.cucumber.java.en.And;
//import Lecture8.pages.CarPagePom;
//import io.cucumber.java.en.When;
//
//public class CarsPageSteps {
//
//    CarPagePom carPagePom = new CarPagePom();
//
//    @And("Validate that CarsPage is open")
//    public void validateThatCarsPageIsOpen() {
//        carPagePom.validatePageUrl();
//    }
//
//    @When("^Set min price at (.*) and max price at (.*)$")
//    public void setMinPriceAtAndMaxPriceAt(String minPrice, String maxPrice) {
//        carPagePom.setPrice(minPrice, maxPrice);
//    }
//
//    @And("^Set year to start from (.*)$")
//    public void setYearToStartFrom(String year) {
//        carPagePom.selectYearMin("2001");
//    }
//
//
//    @And("^Set engine size max (.*)$")
//    public void setEngineSizeMax(String engineSizeMax) {
//        carPagePom.selectMaxEngine("3.0");
//    }
//
//    @And("Set colour white")
//    public void setColourWhite() {
//        carPagePom.selectColorBalta("6318");
//    }
//
//    @And("^Set min year to (.*)$")
//    public void setMinYearTo(int arg0) {
//    }
//}
