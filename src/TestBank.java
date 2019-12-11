import java.time.LocalDate;

public class TestBank {
    public static void main(String[] args) {
        ChekingAccount user1 = new ChekingAccount(); //расчетный счет
        user1.balance();
        user1.depositMoney(1000);
        user1.balance();
        user1.withdrawMoney(100);
        user1.balance();
        user1.withdrawMoney(1000);
        user1.balance();
        user1.withdrawMoney(5000);
        user1.balance();
        System.out.println();

        CardAccount user2 = new CardAccount(); //карточный счет
        user2.depositMoney(1000);
        user2.balance();
        user2.withdrawMoney(100);
        user2.balance();
        user2.withdrawMoney(2000);
        user2.balance();
        user2.withdrawMoney(500);
        user2.balance();
        System.out.println();

        DepositAccount user3 = new DepositAccount(); // депозитарный счет
        user3.depositMoney(1000);
        user3.withdrawMoney(500);
        user3.setDepositDate(LocalDate.of(2019,6,10));
        user3.withdrawMoney(500);
        user3.balance();
        user3.setDepositDate(LocalDate.of(2019,7,1));
        user3.withdrawMoney(10);

    }
}
