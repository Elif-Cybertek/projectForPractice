
  Feature:User should be able to use the filter and select only Students.
    @librarianStudent
    Scenario: click on user student
      Given user on the login page
      When user logs in as a "librarian"
      When user clicks on user module
      And user selects students option
      Then user should be able to see only students

    @StudentStudent
    Scenario: click on user student
      Given user on the login page
      When user logs in as a "student"
      Then user should not be able to see user tab

