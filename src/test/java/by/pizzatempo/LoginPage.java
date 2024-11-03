package by.pizzatempo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver webDriver;

    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public LoginPage clickButtonPizza() {
        webDriver.findElement(By.xpath(LoginXpath.BUTTON_PIZZA_XPATH)).click();
        return this;
    }

    public LoginPage clickButtonToOrder() {
        webDriver.findElement(By.xpath(LoginXpath.BUTTON_TO_ORDER_XPATH)).click();
        return this;
    }

    public LoginPage clickButtonChooseSize() {
        webDriver.findElement(By.xpath(LoginXpath.BUTTON_CHOOSE_SIZE_XPATH)).click();
        return this;
    }

    public LoginPage clickButtonToOrder2() {
        webDriver.findElement(By.xpath(LoginXpath.BUTTON_TO_ORDER_2_XPATH)).click();
        return this;
    }

    public LoginPage clickButtonBasket() {
        webDriver.findElement(By.xpath(LoginXpath.BUTTON_BASKET_XPATH)).click();
        return this;
    }

    public String getTextPizzaMargherita() {
        return webDriver.findElement(By.xpath(LoginXpath.TEXT_PIZZA_MARGHERITA_XPATH)).getText();
    }

    public LoginPage clickButtonDrinks() {
        webDriver.findElement(By.xpath(LoginXpath.BUTTON_DRINKS_XPATH)).click();
        return this;
    }

    public LoginPage clickButtonToOrderFanta() {
        webDriver.findElement(By.xpath(LoginXpath.BUTTON_TO_ORDER_FANTA_XPATH)).click();
        return this;
    }

    public String getTextFanta() {
        return webDriver.findElement(By.xpath(LoginXpath.TEXT_FANTA_XPATH)).getText();
    }
}
