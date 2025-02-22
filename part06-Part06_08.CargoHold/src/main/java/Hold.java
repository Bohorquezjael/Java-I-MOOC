import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suits;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suits = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.sumWeights() + suitcase.totalWeight() <= this.maxWeight) {
            this.suits.add(suitcase);
        }
    }

    private int sumWeights() {
        int sumOfWeight = 0;
        for (Suitcase suit : suits) {
            sumOfWeight += suit.totalWeight();
        }
        return sumOfWeight;
    }

    public void printItems() {
        for (Suitcase suit : suits) {
            suit.printItems();
        }
    }

    public String toString() {
        return this.suits.size() + "suitcases (" + this.sumWeights() + " kg)";
    }
}