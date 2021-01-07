package money;

class Franc extends Money {
    private int amount;

    Franc(int amount) {
        this.amount = amount;
    }

    public boolean equals(Object object) {
        Franc franc = (Franc) object;
        return amount == franc.amount;
    }

    Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }
}
