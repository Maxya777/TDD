public interface Calculator {

    double creditPayment(int creditAmount, double interestRate, int numberMonths);

    double refundToTheBank(int creditAmount, double interestRate, int numberMonths);

    double calcOverpayment(int creditAmount, double interestRate, int numberMonths);
}
