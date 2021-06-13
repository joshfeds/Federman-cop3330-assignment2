package ex26;

import ex26.base.PaymentCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Base26Test {
    @Test
    void default_example_case() {
        PaymentCalculator payment = new PaymentCalculator();

        float expected = 70;
        float actual = payment.calculateMonthsUntilPaidOff("5000", "12", "100");
        assertEquals(expected, actual);
    }
}