
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNextLine()){
            String[] words = scanner.nextLine().split(" "); 
            System.out.println(words[words.length - 1]);
        }
    }
}
