Feature: A/B Testing and Frame Navigation

  Scenario: Verify A/B Testing and Frames
    Given I launch the URL "http://the-internet.herokuapp.com/"
    Then I verify the title is "The Internet"
    When I click on "A/B Testing" link
    Then I verify the page text is "A/B Test Variation 1"
    When I navigate back to Home page
    And I click on link "Dropdown"
    And I select "Option 1" from the dropdown
    Then I confirm "Option 1" is selected
    When I navigate back to Home page
    And I click on "Frames"
    Then I verify the hyperlinks "Nested Frames" and "iFrame" are present
