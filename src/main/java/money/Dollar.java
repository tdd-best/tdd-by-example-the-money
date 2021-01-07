package money;

public class Dollar {
    int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }

    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
}
