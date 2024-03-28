//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println();
        System.out.println("Кредит 1 000 000 руб. на 12 мес. Платеж:");
        System.out.println(service.calculate(1000000, 12));

        System.out.println();
        System.out.println("Кредит 1 000 000 руб. на 24 мес. Платеж:");
        System.out.println(service.calculate(1000000, 24));

        System.out.println();
        System.out.println("Кредит 1 000 000 руб. на 36 мес. Платеж:");
        System.out.println(service.calculate(1000000, 36));
    }
}