public class Main {
    public static void main(String[] args) {

        int balance = 10;
        int amount = 1300;
        int bonus;

        if (amount < 1000) {
            bonus = 0;
        } else {
            bonus = amount / 100;
        }

        int finalBalance = balance + amount + bonus;

        System.out.println("Ваш баланс:" + finalBalance);
    }
}

