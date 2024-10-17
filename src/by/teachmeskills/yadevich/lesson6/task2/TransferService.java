package by.teachmeskills.yadevich.lesson6.task2;

/** Создайте класс TransferService - сервис переводов.
 * Добавьте метод, который позволяет начислять сумму на кредитную карточку.
 * Метод принимает на вход сумму и карту.
 * Внутри метода создайте код, который добавляет переданную в метод сумму к текущей сумме на переданной в метод карте.
 * Добавьте метод, который позволяет снимать с карточки некоторую сумму.
 * Метод принимает на вход сумму и карту.
 * Внутри метода напишите код, который отнимает переданную сумму от текущей суммы на переданной карте.
 * Добавьте метод, который выводит на консоль текущую информацию о карточке.
 * Продумайте и реализуйте различные проверки внутри методов по снятию/добавлению:
 * например, передана отрицательное число, передан 0, запрос на снятие суммы большей, чем сейчас на карте
 * и другие возможные проверки.
*/
public class TransferService {
        //            сумма пополнения денег на карту     объект, который описывает карту на которую положим деньги
    void addMoney(double replenishmentAmount, CreditCard cardForReplenishment) {
        if (replenishmentAmount <= 0) {
            System.out.println("Error: Incorrect amount of money.");
        } else {
           // System.out.println("Current balance up to: " + cardForReplenishment.currentBalance);
            cardForReplenishment.currentBalance += replenishmentAmount;
            System.out.println("Money added to the card.");
            // System.out.println("Current balance now: " + cardForReplenishment.currentBalance);
        }
    }

        //            сумма уменьшения денег на карте    объект, с которой будем снимать деньги
    void reduceMoney(double amountOfReduction, CreditCard cardForWithdrawal) {
        if (amountOfReduction <= 0) {
            System.out.println("Error: Incorrect amount of money.");
        }else if (amountOfReduction > cardForWithdrawal.currentBalance) {
                System.out.println("Not enough money on the card.");
        } else {
            // System.out.println("Current balance up to: " + cardForWithdrawal.currentBalance);
            cardForWithdrawal.currentBalance -= amountOfReduction;
            System.out.println("Money withdrawn from the card.");
           // System.out.println("Current balance now: " + cardForWithdrawal.currentBalance);
        }
    }
//                             карта, с которой переводят    на которую переводят    сумма, которую переводят
    void transferFromCardToCard(CreditCard givingCard, CreditCard receivingСard, double transferAmount ){
        if(givingCard.currentBalance < transferAmount){
            System.out.println("Not enough money to transfer.");
        }else if(transferAmount <= 0){
            System.out.println("Incorrect transfer amount.");
        }else{
            givingCard.currentBalance-= transferAmount;
            receivingСard.currentBalance += transferAmount;
            // System.out.println("Current balance now: " + receivingСard.currentBalance);
            // System.out.println("Current balance now: " + givingCard.currentBalance);
            System.out.println("The money transfer was successful.");
        }
    }
//                          карта по которой хотим узнать инф-цию
    void currentInformation(CreditCard cardForInformation) {
        System.out.println("Card number: " + cardForInformation.cardNumber + ", current amount of money: "
                + cardForInformation.currentBalance);
    }
}
