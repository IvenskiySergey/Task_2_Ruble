public class Main {

    public static void main(String[] args) {
        int CurrentAccount = 100;
        int Payment = 1100;
        if (Payment >= 1000) {
            int Bonus = Payment / 100;
            int TotalAccount = CurrentAccount + Payment + Bonus;
            System.out.println("Начисленно " + Bonus + " бонусных рублей");
            System.out.println("Итоговая сумма на счету = " + TotalAccount);
        } else {
            int TotalAccount = CurrentAccount + Payment;
            System.out.println("Пополнение счета менее 1000 рублей. Бонусных рублей не начисленно");
            System.out.println("Итоговая сумма на счету = " + TotalAccount);
        }
    }
}
