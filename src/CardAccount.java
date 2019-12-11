public class CardAccount extends ChekingAccount {

    @Override
    public void withdrawMoney(int money) {
        super.withdrawMoney(money + ((money*1)/100));
    }

}
