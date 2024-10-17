package by.teachmeskills.yadevich.lesson6.task2;
/** Напишите программу, которая создает три объекта класса CreditCard у которых заданы номер счета и начальная сумма.
 * Тестовый сценарий для проверки:
 * Положите деньги на первые две карточки и снимите с третьей.
 * Выведите на экран текущее состояние всех трех карточек.
 */
public class Runner {
    public static void main(String[] args) {

        CreditCard card1 = new CreditCard("99747475858", 100.00); // объект типа CreditCard
        CreditCard card2 = new CreditCard("36756733585", 90.50);
        CreditCard card3 = new CreditCard("67976747475", 120.05);

        TransferService transfer = new TransferService();  // создали объект для разных действия с картами

        transfer.addMoney(10, card1);
        transfer.addMoney(100, card2);
        //System.out.println();

        transfer.reduceMoney(120, card3);

        //transfer.transferFromCardToCard(card1, card2, 10);

        transfer.currentInformation(card1);
        transfer.currentInformation(card2);
        transfer.currentInformation(card3);


    }
}
