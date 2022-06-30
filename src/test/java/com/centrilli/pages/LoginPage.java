package com.centrilli.pages;

import com.centrilli.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id = "login")
    public WebElement usernameinput;

    @FindBy(id = "password")
    public WebElement passwordinput;

    @FindBy(css = ".btn-primary")
    public WebElement cilickButton;






}
