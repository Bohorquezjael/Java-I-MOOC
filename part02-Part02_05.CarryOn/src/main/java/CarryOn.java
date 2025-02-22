
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = "";
        while(!s.equals("no")){
            System.out.println("Shall we carry on?");
            s = scanner.nextLine();
        }
    }
}
