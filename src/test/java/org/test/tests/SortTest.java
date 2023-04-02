package org.test.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.test.BaseTest;
import org.test.ChooseTabs;

import org.test.Sort;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SortTest extends BaseTest {

    @Test
    public void sortStraightBack() {
        ChooseTabs chooseTabs = new ChooseTabs(driver);
        chooseTabs.clickCustomers();
        Sort sort = new Sort(driver);
        sort.clickFirstName();
        Sort sort1 = new Sort(driver);
        sort1.find();
        Collections.reverse(sortedList);
        Assert.assertTrue(sortedList.equals(obtainedList));
    }

    @Test
    public void sortStraight() {
        ChooseTabs chooseTabs = new ChooseTabs(driver);
        chooseTabs.clickCustomers();
        Sort sort = new Sort(driver);
        sort.clickFirstNameTwice();
        Sort sort2 = new Sort(driver);
        sort2.clickFirstNameTwice();
        Sort sort1 = new Sort(driver);
        sort1.find();
        Assert.assertTrue(sortedList.equals(obtainedList));
    }
}