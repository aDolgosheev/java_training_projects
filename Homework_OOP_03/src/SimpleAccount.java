public class SimpleAccount extends Account {

    public SimpleAccount(long balance) {
        super(balance);
    }

    @Override
    public boolean add(long amount) {
        setBalance(getBalance() + amount);
        return true;
    }

    @Override
    public boolean pay(long amount) {
        if (getBalance() - amount >= 0) {
            setBalance(getBalance() - amount);
            return true;
        } else {
            return false;
        }
    }
}
