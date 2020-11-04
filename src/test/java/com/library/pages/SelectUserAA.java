package com.library.pages;

import com.library.utilities.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectUserAA extends BasePage {

    @FindBy(xpath = "(//span[@class='title'])[2]")
    public WebElement userModule;

    @FindBy(xpath = "//select[@id='user_groups']")
    public WebElement choseUserGroup;

    @FindBy(xpath = "//div[@class='col-md-5 col-sm-5']")
    public WebElement verifyLibraryUser;
    //tr[1]/td[5]
    @FindBy(xpath = "//table//tr[1]/td[5]")
    public WebElement verifyStudentInTable;

    @FindBy(id = "tbl_users_info")
    public WebElement verifyStudentUser;

}




