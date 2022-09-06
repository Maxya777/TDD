public class CalculatorImpl implements Calculator {

    @Override
    public double creditPayment(int creditAmount, double interestRate, int numberMonths) {
        return (creditAmount + interestRate * 1000) / numberMonths;
    }

    @Override
    public double refundToTheBank(int creditAmount, double interestRate, int numberMonths) {
        return creditAmount + (interestRate * 1000 * numberMonths / 12);
    }

    @Override
    public double calcOverpayment(int creditAmount, double interestRate, int numberMonths) {
        return (creditAmount + (interestRate * 1000 * numberMonths / 12)) - creditAmount;
    }
}
