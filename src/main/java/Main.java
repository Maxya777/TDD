public class Main {

    public static void main(String[] args) {

        Calculator calc = new CalculatorImpl();

        System.out.println("Сумма ежемесячного платежа "
                + calc.creditPayment(100000, 18.8, 36) + " рублей");
        System.out.println("Полная сумма кредита "
                + calc.refundToTheBank(100000, 18.8, 36) + " рублей");
        System.out.println("Сумма переплат по кредиту "
                + calc.calcOverpayment(100000, 18.8, 36) + " рублей");
    }
}
