
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n  = 1;
        while(n != 0){
            System.out.println("Give a number:");
            n = scanner.nextInt();
            if(n < 0){
                System.out.println("Unsuitable number");
            }else if(n > 0){
                System.out.println(Math.pow(n, 2));
            }
        }
    }
}
