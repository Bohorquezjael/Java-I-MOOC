import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (this.totalWeight() + item.getWeight() <= this.maxWeight) {
            this.items.add(item);
        }
    }

    public int totalWeight() {
        int sum = 0;
        for (Item item : items) {
            sum += item.getWeight();
        }
        return sum;
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public Item heaviestItem() {
        Item i = null;
        if (!this.items.isEmpty()) {
            i = this.items.get(0);
            for (Item item : items) {
                if (item.getWeight() > i.getWeight()) {
                    i = item;
                }
            }
        }

        return i;
    }

    public String toString() {
        if (this.items.size() == 1) {
            return this.items.size() + " item (" + this.totalWeight() + " kg)";
        }
        if (this.items.size() > 1) {
            return this.items.size() + " items (" + this.totalWeight() + " kg)";
        }
        return "no items (0 kg)";
    }
}