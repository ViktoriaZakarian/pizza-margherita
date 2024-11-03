package by.pizzatempo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest {

    LoginPage loginPage = new LoginPage(webDriver);

    @Test
    @DisplayName("Зайти в раздел 'Пиццы', выбрать пиццу 'Маргарита', " +
            "выбрать любой размер, добавить в корзину, проверить, " +
            "что пицца есть в заказе")
    public void test1() {
        loginPage
                .clickButtonPizza()
                .clickButtonToOrder()
                .clickButtonChooseSize()
                .clickButtonToOrder()
                .clickButtonBasket();

        Assertions.assertEquals(LoginMessage.TEXT_PIZZA_MARGHERITA, loginPage.getTextPizzaMargherita());
    }
}
