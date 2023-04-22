package exceptions;

public class Account {
    private final String name;
    private long balance;

    public Account(String name, long balance) {
        this.name = name;
        if (balance > 0) {
            this.balance = balance;
        }
    }

    public void withdraw(String name, long amount) throws NotEnoughFundsException {
        if (!name.equals(this.name)) {
            throw new IncorrectNameException("The name of user is not correct");
        }
        if (this.balance < amount) {
            throw new NotEnoughFundsException("Not enough funds on the account");
        } else {
            balance -= amount;
        }
    }
}
