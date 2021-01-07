package money;

class Franc extends Money {

    Franc(int amount) {
        this.amount = amount;
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount;
    }

    Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }
}
