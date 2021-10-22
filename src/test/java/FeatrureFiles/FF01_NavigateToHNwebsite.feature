#Author: softwaretestlab
#HN website
  Feature: Website Navigation (user story)
    Scenario: Navigating to HN Website
      Given Open the Browser and enter url and press enter key
      Then System should navigate to HomePage of HN website

#echo website
    @nav
    Scenario: Navigating to echo Website
      Given Open the Browser and enter echourl and press enter key
    #  Then System should navigate to HomePage of HN website