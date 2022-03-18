package money;

public class Money {
    protected int amount;
    public boolean equals(Object object) {
        Money money = (Money)object;
        return amount == money.amount;
    }

    static Dollar dollar(int amount) {
        return new Dollar(amount);
    }
}
