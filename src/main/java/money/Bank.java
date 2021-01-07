package money;

import java.util.Hashtable;

public class Bank {
    private Hashtable rates = new Hashtable();

    public Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

    public void addRate(String source, String to, int rate) {

    }

    int rate(String from, String to) {
        return (from.equals("CHF") && to.equals("USD"))
                ? 2
                : 1;
    }

    private class Pair {
        private String from;
        private String to;

        Pair(String from, String to) {
            this.from = from;
            this.to = to;
        }

        public boolean equals(Object object) {
            Pair pair = (Pair) object;
            return from.equals(pair.from) && to.equals(pair.to);
        }

        public int hashCode() {
            return 0;
        }
    }
}
