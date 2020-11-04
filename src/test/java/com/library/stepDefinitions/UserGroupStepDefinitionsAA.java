package com.library.stepDefinitions;

import com.library.pages.SelectUserAA;
import com.library.utilities.Driver;
import com.library.utilities.Waits;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class UserGroupStepDefinitionsAA {
   SelectUserAA selectUser= new SelectUserAA();
    

    @When("user clicks on user module")
    public void user_clicks_on_user_module() {
        Waits.wait(3);

       selectUser.userModule.click();
    }

    @When("user selects students option")
    public void user_selects_students_option() {
        Select select=new Select(selectUser.choseUserGroup);
        Waits.wait(3);
        select.selectByVisibleText("Students");
        Waits.wait(1);

    }
    @Then("user should be able to see only students")
    public void user_should_be_able_to_see_only_students() {

        Waits.wait(1);

        String expected="Students";
        String actual=selectUser.verifyStudentInTable.getText();

        System.out.println(actual);
        System.out.println(expected);
       // Assert.assertTrue(selectUser.verifyStudentUser.isDisplayed());
       // Assert.assertTrue("Students are not displayed. Verification Failed!!",selectUser.verifyStudentInTable.equals("Students"));
       Assert.assertEquals("Verification Failed!",expected,actual);

    }


}
