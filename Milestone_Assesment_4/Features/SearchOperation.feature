Feature: search items

Scenario: Searching items in gillette
Given Initialize  the "chrome" browser
Then navigate  to "https://www.gillette.co.in/en-in" website
When searching for "foam" in search bar
Then verify if search heading is correct and contains "foam"
And exit  the browser