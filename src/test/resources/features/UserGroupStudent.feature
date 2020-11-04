
  Feature:User should be able to use the filter and select only Students.
    @clickStudent
    Scenario: click on user student
      Given user on the login page
      When user logs in as a "librarian"
      When user clicks on user module
      And user selects students option
      Then user should be able to see only students
