import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class DepositAccount extends ChekingAccount {
    private LocalDate depositDate;

    public void setDepositDate(LocalDate depositDate) {
        this.depositDate = depositDate;
    }

    @Override
    public void depositMoney(int money) {
        depositDate = LocalDate.now();
        super.depositMoney(money);
    }

    @Override
    public void withdrawMoney(int money) {
                if (LocalDate.now().isAfter(depositDate.plusMonths(1))) {
                    super.withdrawMoney(money);
                } else {
                    long daysBetween = DAYS.between(depositDate,LocalDate.now());
                    int daysLeft = (depositDate.plusMonths(1).getDayOfYear() - LocalDate.now().getDayOfYear());
                    System.out.println("Со дня пополнения прошло " + daysBetween + " дней!\nВы сможете забрать деньги через " + daysLeft);
                }
    }
}
