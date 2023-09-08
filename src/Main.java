public class Main {
    public static void main(String[] args) {
        int initialBalance = 100; // Начальная сумма на счету клиента
        int rechargeAmount = 1299; // Сумма пополнения

        // Расчёт бонусных рублей
        int bonus = 0;
        if (rechargeAmount > 1000) {
            bonus = (rechargeAmount) / 100;
        }

        //  Итоговый баланс
        int finalBalance = initialBalance + rechargeAmount + bonus;

        //  Вывод
        System.out.println("Баланс: " + finalBalance + " рублей");
        System.out.println("Бонусные рубли: " + bonus + " рублей");

    }
}
