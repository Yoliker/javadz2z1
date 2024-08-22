
public class Main {
    public static void main(String[] args) {

        int ticketPaid = 13676; // стоимость оплаченных билетов
        int oneMiles = 20; // стоимость одной мили

        int bonus = ticketPaid / oneMiles;  // количество бонусов

        if (oneMiles < 20) {
            bonus = 0;  // возможно это лишняя функция, но зато можно менять стоимость миль либо в случае ошибок бонусы случайно не начислятся
        }

        System.out.println("Итоговый бонус: " + bonus);

    }
}
