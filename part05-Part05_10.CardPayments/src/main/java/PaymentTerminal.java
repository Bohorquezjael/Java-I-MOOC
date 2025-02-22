
public class PaymentTerminal {

    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        double change;
        if (payment >= 2.50) {
            this.money += 2.50;
            change = payment - 2.50;
            this.affordableMeals++;
        } else {
            change = payment;
        }

        return change;
    }

    public double eatHeartily(double payment) {
        double change;
        if (payment >= 4.30) {
            this.money += 4.30;
            change = payment - 4.30;
            this.heartyMeals++;
        } else {
            change = payment;
        }

        return change;
    }

    public boolean eatAffordably(PaymentCard card) {
        boolean enoughFunds = card.takeMoney(2.50);
        if (enoughFunds) {
            this.affordableMeals++;
        }
        return enoughFunds;
    }

    public boolean eatHeartily(PaymentCard card) {
        boolean enoughFunds = card.takeMoney(4.30);
        if (enoughFunds) {
            this.heartyMeals++;
        }
        return enoughFunds;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if(sum > 0){
        card.addMoney(sum);
        this.money += sum;           
        }
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
