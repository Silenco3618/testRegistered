package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchCustomer {
    public WebDriver driver;

    @FindBy(xpath = "//input[@type='text']")
    private WebElement pressSearchCustomer;

    @FindBy(xpath = "//a[@ng-click='sortType = 'lName'; sortReverse = !sortReverse']")
    private WebElement pressLastName;

    @FindBy(xpath = "//a[@ng-click='sortType = 'postCd'; sortReverse = !sortReverse']")
    private WebElement pressPostCode;

    public SearchCustomer(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setPressSearchCustomer(String sCustomer) {
        pressSearchCustomer.click();
        pressSearchCustomer.sendKeys(sCustomer);
    }
}