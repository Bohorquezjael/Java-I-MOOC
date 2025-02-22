
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 1;
        int counter = 0;
        while(n != 0){
            System.out.println("Give a number:");
            n = scanner.nextInt();
            if(n != 0){
                counter++;
            }
        }
        System.out.println("Number of numbers: " + counter);
    }
}
