package com.cybertek.library.pages;

import com.cybertek.library.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage extends PageBase {
    public DashBoardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }




}
