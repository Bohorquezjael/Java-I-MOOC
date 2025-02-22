
public class Statistics {

    private int counter;
    private int sum;

    public int getCount() {
        return counter;
    }

    public void addNumber(int number) {
        this.counter++;
        this.sum += number;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        if (counter > 0) {
            return this.sum / (this.counter * 1.0);
        }else{
            return 0.0;
        }
    }
}
