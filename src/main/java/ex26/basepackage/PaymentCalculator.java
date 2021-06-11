package ex26.basepackage;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.lang.Math;
public class PaymentCalculator {
    public float calculateMonthsUntilPaidOff(String b, String a, String p){
        float balance = Float.parseFloat(b);
        float apr = Float.parseFloat(a) / 100;
        float payment = Float.parseFloat(p);

        BigDecimal rBalance = new BigDecimal(balance);
        rBalance = rBalance.setScale(2, RoundingMode.CEILING);
        balance = rBalance.floatValue();

        BigDecimal rPayment = new BigDecimal(payment);
        rPayment = rPayment.setScale(2, RoundingMode.CEILING);
        payment = rPayment.floatValue();

        float number = (float) (-1.0/30.0);
        float i = apr/365;
        float numerator = (float) Math.log10(1 + balance/payment * (1 - Math.pow(1 + i, 30)));
        float denominator = (float) Math.log10(1 + i);
        float months = number * numerator/denominator;

        return (float) Math.ceil(months);
    }
}
