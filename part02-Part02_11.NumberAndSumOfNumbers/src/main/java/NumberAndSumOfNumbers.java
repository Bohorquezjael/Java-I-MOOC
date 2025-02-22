
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 1;
        int sum = 0, counter = -1;
        while (n != 0) {
            System.out.println("Give a number:");
            n = scanner.nextInt();
            sum += n;
            counter++;
        }
        System.out.println("Number of numbers: " + counter);
        System.out.println("Sum of the numbers: " + sum);
    }
}
