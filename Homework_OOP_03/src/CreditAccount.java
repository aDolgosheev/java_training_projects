public class CreditAccount extends Account {
    private long limit;

    public CreditAccount(long balance, long limit) {
        super(balance);
        this.limit = limit;
    }

    @Override
    public boolean add(long amount) {
        if (getBalance() + amount >= limit && getBalance() + amount <= 0) {
            setBalance(getBalance() + amount);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean pay(long amount) {
        if (getBalance() - amount >= limit && getBalance() - amount <= 0) {
            setBalance(getBalance() - amount);
            return true;
        } else {
            return false;
        }
    }
}
