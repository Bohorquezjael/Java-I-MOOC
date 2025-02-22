
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 1;
        int sum = 0;
        while (n != 0) {
            System.out.println("Give a number:");
            n = scanner.nextInt();
            sum += n;
        }
        System.out.println("Sum of the numbers: " + sum);
    }
}
