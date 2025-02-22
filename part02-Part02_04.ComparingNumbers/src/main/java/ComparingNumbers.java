
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        if(a < b){
            System.out.print(a + " is smaller than " + b);
        }else if(a > b){
            System.out.print(a + " is greater than " + b);
        }else{
            System.out.print(a + " is equal to " + b);
        }
    }
}
