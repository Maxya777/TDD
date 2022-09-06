import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalcTest {

    @Test
    @DisplayName("Расчет месячного платежа")
    public void monthlyPayment() {
        Calculator calc = null;
        int creditAmount = 100000;
        double interestRate = 20;
        int numberMonths = 12;

        Assertions.assertNotNull(calc.creditPayment(creditAmount, interestRate, numberMonths));
        Assertions.assertEquals(10000, calc.creditPayment(creditAmount, interestRate, numberMonths));

    }

    @Test
    @DisplayName("Расчет общей суммы к возврату в банк")
    public void refundToTheBank() {
        Calculator calc = null;
        int creditAmount = 100000;
        double interestRate = 20;
        int numberMonths = 12;

        Assertions.assertNotNull(calc.refundToTheBank(creditAmount, interestRate, numberMonths));
        Assertions.assertEquals(120000, calc.refundToTheBank(creditAmount, interestRate, numberMonths));
    }

    @Test
    @DisplayName("Расчет переплаты за весь период")
    public void calculationOfOverpayment() {
        Calculator calc = null;
        int creditAmount = 100000;
        double interestRate = 20;
        int numberMonths = 12;

        Assertions.assertNotNull(calc.calcOverpayment(creditAmount, interestRate, numberMonths));
        Assertions.assertEquals(20000, calc.calcOverpayment(creditAmount, interestRate, numberMonths));
    }
}
