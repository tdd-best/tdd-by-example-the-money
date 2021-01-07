package money;

public class Dollar extends Money {

    public Dollar(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object object) {
        Money dollar = (Dollar) object;
        return amount == dollar.amount;
    }

    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
}
