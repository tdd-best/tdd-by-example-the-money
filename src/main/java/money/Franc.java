package money;

class Franc extends Money {

    Franc(int amount, String currency) {
        this.amount = amount;
        currency = "CHF";
    }

    Money times(int multiplier) {
        return Money.franc(amount * multiplier);
    }
}
