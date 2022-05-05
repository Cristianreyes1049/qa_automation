Feature: Login functionality
  Background:


  @SmokeTest
  Scenario: TC-001 Successfully login



  Scenario Outline: <tesdata> User and Password validation

    Examples:
      |tesdata    |


  Scenario: TC-007 Password should be masked


  Scenario: TC-008 Sign out should close the session


  Scenario: Home-Arrivals-Add to Basket-Items-Addbook 12

    Given Open the browser
    And Enter the URL “http://practice.automationtesting.in/”
    And Click on Shop Menu
    And Now click on Home menu button
    And Test whether the Home page has Three Arrivals only
    And The Home page must contains only three Arrivals
    And Now click the image in the Arrivals
    And Test whether it is navigating to next page where the user can add that book into his basket.
    Then Image should be clickable and should navigate to next page where user can add that book to his basket
    When Click on the Add To Basket button which adds that book to your basket
    Then User can view that Book in the Menu item with price.
    And Now click on Item link which navigates to proceed to check out page.
    And Click on textbox value under quantity in Check out page to add or subtract books.
    And Now after the above change ‘Update Basket’ button will turn into Clickable mode.
    And Now click on Update Basket to reflect those changes
    Then User has the feasibility to Update Basket at the time of check out.



