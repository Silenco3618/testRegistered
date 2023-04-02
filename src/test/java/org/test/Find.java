package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Find {
    public WebDriver driver;

    public void find() {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        ArrayList<String> obtainedList = new ArrayList<>();
        List<WebElement> listText = driver.findElements(By.xpath("//tbody[@class='ng-binding']"));
        for (int i = 1; i + 3 < listText.size(); i++) {
        }
        ArrayList<String> sortedList = new ArrayList<>();
        for (String s : obtainedList) {
            sortedList.add(s);
            Collections.sort(sortedList);
        }
    }
}
