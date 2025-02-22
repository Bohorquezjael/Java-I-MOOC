
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()){
            String[] words = scanner.nextLine().split(" "); 
        for (String word : words) {
            System.out.println(word);
        }
        }
    }
}
