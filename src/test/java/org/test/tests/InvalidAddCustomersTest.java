package org.test.tests;

import org.junit.jupiter.api.Test;
import org.test.BaseTest;
import org.test.ChooseTabs;
import org.test.Registration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvalidAddCustomersTest extends BaseTest {

    @Test
    public void addCustomerInEnglishFirstName() {
        ChooseTabs chooseTabs = new ChooseTabs(driver);
        chooseTabs.clickAddCustomers();
        Registration registration = new Registration(driver);
        registration.inputRightRegistration("Ekaterina", "Иванова", "123456");
        String expected = "Введите имя на русском языке";
        String actual = driver.switchTo().alert().getText();
        assertEquals(expected, actual);
    }

    @Test
    public void addCustomerInEnglishLastName() {
        ChooseTabs chooseTabs = new ChooseTabs(driver);
        chooseTabs.clickAddCustomers();
        Registration registration = new Registration(driver);
        registration.inputRightRegistration("Екатерина", "Ivanova", "123456");
        String expected = "Введите фамилию на русском языке";
        String actual = driver.switchTo().alert().getText();
        assertEquals(expected, actual);
    }

    @Test
    public void addCustomerFirstNameSpace() {
        ChooseTabs chooseTabs = new ChooseTabs(driver);
        chooseTabs.clickAddCustomers();
        Registration registration = new Registration(driver);
        registration.inputRightRegistration("Екатерина Юлия", "Иванова", "123456");
        String expected = "Введите валидное имя";
        String actual = driver.switchTo().alert().getText();
        assertEquals(expected, actual);
    }

    @Test
    public void addCustomerLastNameSpace() {
        ChooseTabs chooseTabs = new ChooseTabs(driver);
        chooseTabs.clickAddCustomers();
        Registration registration = new Registration(driver);
        registration.inputRightRegistration("Екатерина", "Иванова Щербакова", "123456");
        String expected = "Введите валидную фамилию";
        String actual = driver.switchTo().alert().getText();
        assertEquals(expected, actual);
    }

    @Test
    public void addCustomerFirstNameLittleLetter() {
        ChooseTabs chooseTabs = new ChooseTabs(driver);
        chooseTabs.clickAddCustomers();
        Registration registration = new Registration(driver);
        registration.inputRightRegistration("екатерина", "Иванова", "123456");
        String expected = "Введите имя с большой буквы";
        String actual = driver.switchTo().alert().getText();
        assertEquals(expected, actual);
    }

    @Test
    public void addCustomerLastNameLittleLetter() {
        ChooseTabs chooseTabs = new ChooseTabs(driver);
        chooseTabs.clickAddCustomers();
        Registration registration = new Registration(driver);
        registration.inputRightRegistration("Екатерина", "иванова", "123456");
        String expected = "Введите фамилию с большой буквы";
        String actual = driver.switchTo().alert().getText();
        assertEquals(expected, actual);
    }

    @Test
    public void addCustomerFirstNameEmpty() {
        ChooseTabs chooseTabs = new ChooseTabs(driver);
        chooseTabs.clickAddCustomers();
        Registration registration = new Registration(driver);
        registration.inputRightRegistration("", "Иванова", "123456");
        String expected = "Введите имя";
        String actual = driver.switchTo().alert().getText();
        assertEquals(expected, actual);
    }

    @Test
    public void addCustomerLastNameEmpty() {
        ChooseTabs chooseTabs = new ChooseTabs(driver);
        chooseTabs.clickAddCustomers();
        Registration registration = new Registration(driver);
        registration.inputRightRegistration("Екатерина", "", "123456");
        String expected = "Введите фамилию";
        String actual = driver.switchTo().alert().getText();
        assertEquals(expected, actual);
    }

    @Test
    public void addCustomerPageCodeEmpty() {
        ChooseTabs chooseTabs = new ChooseTabs(driver);
        chooseTabs.clickAddCustomers();
        Registration registration = new Registration(driver);
        registration.inputRightRegistration("Екатерина", "Иванова", "");
        String expected = "Введите код";
        String actual = driver.switchTo().alert().getText();
        assertEquals(expected, actual);
    }
}
