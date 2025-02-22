
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 1;
        int sum = 0, counter = 0;
        while (n != 0) {
            System.out.println("Give a number:");
            n = scanner.nextInt();
            if (n > 0) {
                sum += n;
                counter++;
            }
        }
        if (sum == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println((sum * 1.0) / counter);
        }
    }
}
