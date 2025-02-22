
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, counter = 0;
        String name = "";
        while (true) {
            String s = scanner.nextLine();
            if(s.equals("")){
                break;
            }
            String[] words = s.split(",");
            if(words[0].length() > name.length()){
                name = words[0];
            }
            sum += Integer.valueOf(words[1]);
            counter++;
        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of birth years: " + (sum * 1.0) / counter);

    }
}
