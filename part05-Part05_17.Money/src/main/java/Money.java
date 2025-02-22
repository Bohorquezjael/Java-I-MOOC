
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        Money result = new Money(this.euros + addition.euros, this.cents + addition.cents);
        return result;
    }

    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        } else if (this.euros > compared.euros) {
            return false;
        } else {
            if (this.cents < compared.cents) {
                return true;
            }
            return false;
        }
    }

    public Money minus(Money decreaser) {
        Money result;
        if (this.lessThan(decreaser)) {
            result = new Money(0, 0);
        } else {
            int cents = (this.euros * 100 + this.cents) - (decreaser.euros * 100 + decreaser.cents);
            result = new Money(0, cents);
        }
        return result;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
