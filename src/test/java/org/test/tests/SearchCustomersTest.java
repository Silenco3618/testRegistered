package org.test.tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.test.BaseTest;
import org.test.ChooseTabs;
import org.test.SearchCustomer;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchCustomersTest  extends BaseTest {

    @Test
    public void successSearchFirstName() {
        ChooseTabs chooseTabs = new ChooseTabs(driver);
        chooseTabs.clickCustomers();
        SearchCustomer searchCustomer = new SearchCustomer(driver);
        searchCustomer.setPressSearchFirstName();
        String expected = "Hermoine";
        String actual = driver.findElement(By.xpath("//td[@class='ng-binding']")).getText().trim();
        assertEquals(expected, actual);
    }

    @Test
    public void successSearchLastName() {
        ChooseTabs chooseTabs = new ChooseTabs(driver);
        chooseTabs.clickCustomers();
        SearchCustomer searchCustomer = new SearchCustomer(driver);
        searchCustomer.setPressSearchLastName();
        String expected = "Granger";
        String actual = driver.findElement(By.xpath("//td[@class='ng-binding'][2]")).getText().trim();
        assertEquals(expected, actual);
    }
    @Test
    public void successSearchPostCode() {
        ChooseTabs chooseTabs = new ChooseTabs(driver);
        chooseTabs.clickCustomers();
        SearchCustomer searchCustomer = new SearchCustomer(driver);
        searchCustomer.setPressSearchPostCode();
        String expected = "E55656";
        String actual = driver.findElement(By.xpath("//td[@class='ng-binding'][3]")).getText().trim();
        assertEquals(expected, actual);
    }
}