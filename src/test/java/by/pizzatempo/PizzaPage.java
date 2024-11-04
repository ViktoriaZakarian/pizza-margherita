package by.pizzatempo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PizzaPage {
    private WebDriver webDriver;

    public PizzaPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public PizzaPage clickButtonPizza() {
        webDriver.findElement(By.xpath(PizzaXpath.BUTTON_PIZZA_XPATH)).click();
        return this;
    }

    public PizzaPage clickButtonToOrder() {
        webDriver.findElement(By.xpath(PizzaXpath.BUTTON_TO_ORDER_XPATH)).click();
        return this;
    }

    public PizzaPage clickButtonChooseSize() {
        webDriver.findElement(By.xpath(PizzaXpath.BUTTON_CHOOSE_SIZE_XPATH)).click();
        return this;
    }

    public PizzaPage clickButtonToConfirmOrder() {
        webDriver.findElement(By.xpath(PizzaXpath.BUTTON_TO_CONFIRM_ORDER_XPATH)).click();
        return this;
    }

    public PizzaPage clickButtonBasket() {
        webDriver.findElement(By.xpath(PizzaXpath.BUTTON_BASKET_XPATH)).click();
        return this;
    }

    public String getTextPizzaMargherita() {
        return webDriver.findElement(By.xpath(PizzaXpath.TEXT_PIZZA_MARGHERITA_XPATH)).getText();
    }

    public PizzaPage clickButtonDrinks() {
        webDriver.findElement(By.xpath(PizzaXpath.BUTTON_DRINKS_XPATH)).click();
        return this;
    }

    public PizzaPage clickButtonToOrderFanta() {
        webDriver.findElement(By.xpath(PizzaXpath.BUTTON_TO_ORDER_FANTA_XPATH)).click();
        return this;
    }

    public String getTextFanta() {
        return webDriver.findElement(By.xpath(PizzaXpath.TEXT_FANTA_XPATH)).getText();
    }
}
