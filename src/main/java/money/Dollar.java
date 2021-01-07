package money;

public class Dollar extends Money {

    public Dollar(int amount) {
        this.amount = amount;
    }

    @Override
    public String currency() {
        return "USD";
    }

    public Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
}
