
public class ChekingAccount {

    private int money;
    private int balance;


    public void balance() {
        balance += money;
        System.out.println("Баланс карты равен: " + balance);
    }

    public void withdrawMoney( int money) {
        System.out.println("Вы снимаете " +money);
         balance -= money;
        if (balance < 0) {
            balance += money;
            System.out.println("Недостаточно средств!\nСчет не может быть отрицательным");
        }
    }

    public void depositMoney (int money) {
        System.out.println("Пополнение карты на сумму " + money);
        balance += money;
    }
}
