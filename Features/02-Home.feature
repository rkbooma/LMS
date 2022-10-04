Feature: HomePage
Scenario: Validate the Homepage
Given User is on the browser
When User landed on the Home page after logging into the LMS website
Then verify that title of the page is "LMS"
Then User should see a button with program text "Program" on the menu bar
When User landed on the Home page after logging into the LMS website
Then User should see a button with batch text "Batch" on the menu bar
When User landed on the Home page after logging into the LMS website
Then User should see a button with user text "User" on the menu bar
When User landed on the Home page after logging into the LMS website
Then User should see a button with assignment text "Assignment" on the menu bar
When User landed on the Home page after logging into the LMS website
Then User should see a button with attendance text "Attendance" on the menu bar
When User landed on the Home page after logging into the LMS website
Then User should see a button with logout text "Logout" on the menu bar