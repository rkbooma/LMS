Feature: Program
    Scenario: Validate Add New Program
    Given User is on Program page
    When User clicks A New Program button
    Then User lands on Program Details form
  @ValidateandADDNewProgram
    Scenario: Validate Add New Program
    Given User is on Program page
    When User clicks A New Program button
    Then User lands on Program Details form
    When User enters name as "mighty ninja" in text box
    Then User can see Name entered
    When User enters desc as "mighty ninja Description" in text box
    Then User can see Description entered
    When User clicks Save button
    Then User gets message 'Successful Program created'
    @EditProgram
    Scenario: Edit Feature
    Given User is on Program page
    When User clicks on Program Edit button
    Then User lands on Program Details form
    When User edits "Name" and selects the Save button
    Then User can see 'Successful Program Updated' message
    @Search
    Scenario: Search Program By Name
    Given User is on Program page
    When User enters  "name phrase/Program status phase/Description Phase" into search box.
    Then Entries for name phrase are shown
    
    @DeleteProgram
    Scenario: Delete Feature
    Given User is on Program page
    When User clicks on Delete button
    Then User lands on Confirm Deletion form
    When User clicks yes button
    Then User can see "Successful Program Deleted" message
    When User clicks <No> button
    Then User can see confirm deletion form disappears
    When User clicks on <Delete> button on top left corner
    Then User lands on Confirm Deletion form
    When User clicks yes button
    Then User can see "Successful Program Deleted" message
    @Pagination
    Scenario: Verify previous link on the first page
    Given User is logged on to LMS website
    When User is on first page of Manage Program
    Then Verify that previous link is disabled
    When User clicks left navigate > button
    Then User navigated to page number '2'
    When User clicks right navigate < button
    Then User navigated to page number '1'
    Scenario: Verify that the results are displayed in Ascending order of Program name
    Given User is on the Program  page
    When User clicks onthe Ascending arrow (down ) near to the Program name
    Then User can see the results in Ascending order of Program name
    When User clicks onthe Descending arrow (down ) near to the Program Description
    Then  User can see the results in Descending order of Program name










