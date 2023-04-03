package org.test.tests;

import org.junit.jupiter.api.Test;
import org.test.BaseTest;
import org.test.ChooseTabs;
import org.test.Registration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidAddCustomersTest extends BaseTest {

    @Test
    public void successAddCustomer() {
        ChooseTabs chooseTabs = new ChooseTabs(driver);
        chooseTabs.clickAddCustomers();
        Registration registration = new Registration(driver);
        registration.inputRightRegistration("Екатерина", "Иванова", "123456");
        String expected = "Customer added successfully with customer id :6";
        String actual = driver.switchTo().alert().getText();
        assertEquals(expected, actual);

    }

    @Test
    public void addCustomerDiphysisFirstName() {
        ChooseTabs chooseTabs = new ChooseTabs(driver);
        chooseTabs.clickAddCustomers();
        Registration registration = new Registration(driver);
        registration.inputRightRegistration("Екатерина-Юлия", "Иванова", "123456");
        String expected = "Customer added successfully with customer id :6";
        String actual = driver.switchTo().alert().getText();
        assertEquals(expected, actual);
    }

    @Test
    public void addCustomerDiphysisLastName() {
        ChooseTabs chooseTabs = new ChooseTabs(driver);
        chooseTabs.clickAddCustomers();
        Registration registration = new Registration(driver);
        registration.inputRightRegistration("Екатерина", "Иванова-Щербакова", "123456");
        String expected = "Customer added successfully with customer id :6";
        String actual = driver.switchTo().alert().getText();
        assertEquals(expected, actual);
    }

    @Test
    public void addCustomerDiphysisPostCode() {
        ChooseTabs chooseTabs = new ChooseTabs(driver);
        chooseTabs.clickAddCustomers();
        Registration registration = new Registration(driver);
        registration.inputRightRegistration("Екатерина", "Иванова", "12-3456");
        String expected = "Customer added successfully with customer id :6";
        String actual = driver.switchTo().alert().getText();
        assertEquals(expected, actual);
    }

    @Test
    public void addCustomerTwoSymbolsFirstName() {
        ChooseTabs chooseTabs = new ChooseTabs(driver);
        chooseTabs.clickAddCustomers();
        Registration registration = new Registration(driver);
        registration.inputRightRegistration("Ек", "Иванова", "123456");
        String expected = "Customer added successfully with customer id :6";
        String actual = driver.switchTo().alert().getText();
        assertEquals(expected, actual);
    }

    @Test
    public void addCustomerTwoSymbolsLastName() {
        ChooseTabs chooseTabs = new ChooseTabs(driver);
        chooseTabs.clickAddCustomers();
        Registration registration = new Registration(driver);
        registration.inputRightRegistration("Екатерина", "Ив", "123456");
        String expected = "Customer added successfully with customer id :6";
        String actual = driver.switchTo().alert().getText();
        assertEquals(expected, actual);
    }

    @Test
    public void addCustomerTwentySymbolsFirstAndLastName() {
        ChooseTabs chooseTabs = new ChooseTabs(driver);
        chooseTabs.clickAddCustomers();
        Registration registration = new Registration(driver);
        registration.inputRightRegistration("Екатериналбмиатвлюам", "Ивановаваияваяивиаяв", "123456");
        String expected = "Customer added successfully with customer id :6";
        String actual = driver.switchTo().alert().getText();
        assertEquals(expected, actual);
    }
}