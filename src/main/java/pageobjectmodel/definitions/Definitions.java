package pageobjectmodel.definitions;

import io.cucumber.java.StepDefinitionAnnotation;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjectmodel.task.HomeArrivals;

public class Definitions {

    WebDriver driver = new ChromeDriver();
    HomeArrivals inHomeArrival = new HomeArrivals();//driver);
    @Given("^Open the browser")
    public void openTheBrowser(){
        driver.get("http://practice.automationtesting.in/");
    }

    @And("^Enter the URL “http://practice.automationtesting.in/”")
    public void enterNextUrl(){

    }
    @And("Click on Shop Menu")
    public void clickOnShopMenu(){
      //  inHomeArrival.insertName(text);
    }
    @And("^Now click on Home menu button")
    public void nowClickOnHomeMenuButton(){

    }
    @And("^Test whether the Home page has Three Arrivals only")
    public void testWhetherTheHomePageHasThreeArrivalsOnly(){

    }
    @And("^The Home page must contains only three Arrivals")
    public void theHomePageMustContainsOnlyThreeArrivals(){

    }
    @And("^Now click the image in the Arrivals")
    public void nowClickTheImageInTheArrivals(){

    }
    @And("^Test whether it is navigating to next page where the user can add that book into his basket")
    public void testWhetherItIsNavigatingToNextPageWhereTheUserCanAddThatBookIntoHisBasket(){

    }
    @Then("^Image should be clickable and should navigate to next page where user can add that book to his basket")
            public void imageShouldBeClickableAndShouldNavigateToNextPageWhereUserCanAddThatBookToHisBasket(){

            }
    @When("^Click on the Add To Basket button which adds that book to your basket")
            public void clickOnTheAddToBasketButtonWhichAddsThatBookToYourBasket(){

            }
    @Then("^User can view that Book in the Menu item with price")
            public void userCanViewThatBookInTheMenuItemWithPrice(){

            }
    @And("^Now click on Item link which navigates to proceed to check out page")

            public void nowClickOnItemLinkWhichNavigatesToProceedToCheckOutPage(){

            }
    @And("^Click on textbox value under quantity in Check out page to add or subtract books")
            public void clickOnTextboxValueUnderQuantity(){

            }
    @And("^Now after the above change ‘Update Basket’ button will turn into Clickable mode")
            public void nowAfterTheAboveChangeUpdateBasketButtonWillTurnIntoClickableMode(){

            }
    @And("^Now click on Update Basket to reflect those changes")
            public void nowClickOnUpdateBasketToReflectThoseChanges(){

            }
    @Then("User has the feasibility to Update Basket at the time of check out.")
            public void userHasTheFeasibilityToUpdateBasketAtTheTimeOfCheckOut(){

            }
}
