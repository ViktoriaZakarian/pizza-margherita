package by.pizzatempo;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    private LoginPage loginPage;

    @BeforeMethod
    public void setLoginPage() {
        loginPage = new LoginPage(webDriver);
        loginPage.clickButtonPizza();
    }

    @Test(testName = "Зайти в раздел 'Пиццы', выбрать пиццу 'Маргарита', " +
            "выбрать любой размер, добавить в корзину, проверить, " +
            "что пицца есть в заказе")
    public void test1() {
        loginPage
                .clickButtonToOrder()
                .clickButtonChooseSize()
                .clickButtonToOrder2()
                .clickButtonBasket();

        Assert.assertEquals(loginPage.getTextPizzaMargherita(), LoginMessage.TEXT_PIZZA_MARGHERITA);
    }

    @Test(testName = "Добавить пиццу \"Маргариту\" любого размера в корзирну, добавить любой напиток в корзину, " +
            "перейти в корзину, проверить заказ")
    public void test2() {
        loginPage
                .clickButtonToOrder()
                .clickButtonChooseSize()
                .clickButtonToOrder2()
                .clickButtonDrinks()
                .clickButtonToOrderFanta()
                .clickButtonBasket();

        Assert.assertEquals(loginPage.getTextPizzaMargherita(), LoginMessage.TEXT_PIZZA_MARGHERITA);
        Assert.assertEquals(loginPage.getTextFanta(), LoginMessage.TEXT_FANTA);
    }
}
