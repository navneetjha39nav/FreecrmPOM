package com.crm.pages;

import com.crm.baseclass.TestBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;
import java.io.IOException;

public class Loginpage extends TestBaseClass {

    public Loginpage() throws IOException {
        @FindBy(XPath="//*[@href=\"https://ui.freecrm.com\"]");
        WebElement LogIn;
        LogIn.click();


    }
}
