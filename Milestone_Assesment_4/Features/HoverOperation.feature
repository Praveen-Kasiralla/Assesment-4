Feature: Hover menu

Scenario: Open MACH3 page from home hover menu
Given Initialize the "chrome" browser
Then navigate to "https://www.gillette.co.in/en-in" website
When user hovers on about out story is displayed and click on the link
Then verify if "100 years" is present in our story
And exit the browser 