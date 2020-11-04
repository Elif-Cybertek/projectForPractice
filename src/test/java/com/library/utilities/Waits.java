package com.library.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class Waits {

    private static WebDriverWait wait=new WebDriverWait(Driver.getDriver(),20);

    public static void wait(int second){

        try{ Thread.sleep(second*1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public static void clickOnElement(WebElement element){

        wait.until(ExpectedConditions.elementToBeClickable(element)).click();

    }
    public static void clickWithJs(WebElement element){
        ((JavascriptExecutor)(Driver.getDriver())).executeScript("argument[0].click",element);
    }

    public static void enterText(WebElement elemt, String text) {

        wait.until(ExpectedConditions.visibilityOf(elemt));
        elemt.clear();
        elemt.sendKeys(text);
        //this is for entering the text fully
        wait.until(ExpectedConditions.attributeToBe(elemt, "value", text));
        System.out.println("Enter text: " + text);
    }

}