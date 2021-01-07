package money;

class Franc extends Money {

    Franc(int amount) {
        this.amount = amount;
        currency = "CHF";
    }

    Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }
}
