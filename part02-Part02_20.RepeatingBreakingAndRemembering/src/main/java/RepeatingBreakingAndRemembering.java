
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        int even = 0, odd = 0;
        System.out.println("Give numbers:");
        while (true) {
            int n = scanner.nextInt();
            if (n == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
            if (n % 2 == 0){
                even++;
            } else{
                odd++;
            }
            sum += n;
            counter++;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + counter);
        System.out.println("Average: " + (sum * 1.0) / counter);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
