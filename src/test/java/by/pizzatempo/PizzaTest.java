package by.pizzatempo;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PizzaTest extends BaseTest {

    private PizzaPage loginPage;

    @BeforeMethod
    public void setLoginPage() {
        loginPage = new PizzaPage(webDriver);
        loginPage.clickButtonPizza();
    }

    @Test(testName = "Зайти в раздел 'Пиццы', выбрать пиццу 'Маргарита', " +
            "выбрать любой размер, добавить в корзину, проверить, " +
            "что пицца есть в заказе")
    public void test1() {
        loginPage
                .clickButtonToOrder()
                .clickButtonChooseSize()
                .clickButtonToConfirmOrder()
                .clickButtonBasket();

        Assert.assertEquals(loginPage.getTextPizzaMargherita(), PizzaMessage.TEXT_PIZZA_MARGHERITA);
    }

    @Test(testName = "Добавить пиццу \"Маргариту\" любого размера в корзирну, добавить любой напиток в корзину, " +
            "перейти в корзину, проверить заказ")
    public void test2() {
        loginPage
                .clickButtonToOrder()
                .clickButtonChooseSize()
                .clickButtonToConfirmOrder()
                .clickButtonDrinks()
                .clickButtonToOrderFanta()
                .clickButtonBasket();

        Assert.assertEquals(loginPage.getTextPizzaMargherita(), PizzaMessage.TEXT_PIZZA_MARGHERITA);
        Assert.assertEquals(loginPage.getTextFanta(), PizzaMessage.TEXT_FANTA);
    }
}
