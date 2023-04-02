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
import org.test.ChooseTabs;
import org.test.Find;
import org.test.Sort;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SortTest {

    private WebDriver driver;

    @BeforeAll
    static void setupAll() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");
        options.addArguments("--headless");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @Test
    public void sortStraightBack() {
        ChooseTabs chooseTabs = new ChooseTabs(driver);
        chooseTabs.clickCustomers();
        Sort sort = new Sort(driver);
        sort.clickFirstName();
        Find find = new Find();
        find.find();
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
        Find find = new Find();
        find.find();
        Assert.assertTrue(sortedList.equals(obtainedList));
    }
}