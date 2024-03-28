public class CreditPaymentService {
    public int calculate(int credit, int term) {
        double rate = 9.99;
        double rateMonth = rate / 1200;
        double coefficient = Math.pow(1 + rateMonth, term) / ((Math.pow(1 + rateMonth, term)) - 1);
        int payment = (int) (credit * rateMonth * coefficient);
        return payment;

    }
}
