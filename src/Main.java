public class Main {

    public static void main(String[] args) {
        int currentAccount = 100;
        int payment = 1100;
        if (payment >= 1000) {
            int bonus = payment / 100;
            int totalAccount = currentAccount + payment + bonus;
            System.out.println("Начисленно " + bonus + " бонусных рублей");
            System.out.println("Итоговая сумма на счету = " + totalAccount);
        } else {
            int totalAccount = currentAccount + payment;
            System.out.println("Пополнение счета менее 1000 рублей. Бонусных рублей не начисленно");
            System.out.println("Итоговая сумма на счету = " + totalAccount);
        }
    }
}
