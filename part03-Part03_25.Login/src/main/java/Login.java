
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String u1 = "alex";
        String u1p = "sunshine";
        
        String u2 = "emma";
        String u2p = "haskell";
        
        String user = scanner.nextLine();
        String pass = scanner.nextLine();
        if(user.equals(u1) || user.equals(u2)){
            if(pass.equals(u1p) || pass.equals(u2p)){
                System.out.println("You have successfully logged in!");
            }else{
                System.out.println("Incorrect username or password!");
            }
        }else{
            System.out.println("Incorrect username or password!");
        }
    }
}
