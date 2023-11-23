package HomeTask_4.Task_2.test.card;

import org.junit.jupiter.api.Test;

import HomeTask_4.Task_2.main.card.CreditCard;
import HomeTask_4.Task_2.main.card.PaymentForm;

import static org.assertj.core.api.Assertions.*;
import static  org.mockito.Mockito.*;

class PaymentFormTest {

    /**
     * 4.2. Используя библиотеку Mockito, напишите модульные тесты для проверки функциональности формы оплаты на сайте.
     * * Вместо реальной кредитной карты используйте мок-объект.
     * Создайте класс `CreditCard` с методами `getCardNumber()`, `getCardHolder()`, `getExpiryDate()`, `getCvv()`, `charge(double amount)`.
     * Создайте класс `PaymentForm` с методом `pay(double amount)`.
     * В тестовом классе, создайте мок-объект для класса `CreditCard`.
     * Определите поведение мок-объекта с помощью метода `when()`.
     * Создайте объект класса `PaymentForm`, передайте ему мок-объект в качестве аргумента.
     * Вызовите метод `pay()` и убедитесь, что мок-объект вызывает метод `charge()`
     */
    @Test
    void testPaymenForm(){
        CreditCard creditCard = mock(CreditCard.class);
        when(creditCard.getCardNumber()).thenReturn("123321");
        when(creditCard.getCardHolder()).thenReturn("Test Human");
        when(creditCard.getExpiryDate()).thenReturn("05/25");
        when(creditCard.getCvv()).thenReturn("222");

        PaymentForm paymentForm = new PaymentForm(creditCard);
        paymentForm.pay(100);
        verify(creditCard, times(1)).charge(100);
    }



}
