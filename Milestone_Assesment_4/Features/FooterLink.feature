Feature: product page

Scenario: click on footer link
Given Initialize the "firefox"  browser
Then navigate to "https://www.gillette.co.in/en-in"  website
When clicking on terms and conditions link in footer
Then verify if "User Submissions" is present in page
And exit the  browser