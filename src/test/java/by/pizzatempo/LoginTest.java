package by.pizzatempo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.testng.annotations.BeforeMethod;

public class LoginTest extends BaseTest {

    private LoginPage loginPage;

    @BeforeMethod
    public void setLoginPage() {
        loginPage = new LoginPage(webDriver);
        loginPage.clickButtonPizza();
    }

    @Test
    @DisplayName("Зайти в раздел 'Пиццы', выбрать пиццу 'Маргарита', " +
            "выбрать любой размер, добавить в корзину, проверить, " +
            "что пицца есть в заказе")
    public void test1() {
        loginPage
                .clickButtonToOrder()
                .clickButtonChooseSize()
                .clickButtonToOrder()
                .clickButtonBasket();

        Assertions.assertEquals(LoginMessage.TEXT_PIZZA_MARGHERITA, loginPage.getTextPizzaMargherita());
    }
}
