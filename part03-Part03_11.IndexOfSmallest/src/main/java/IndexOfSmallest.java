
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        ArrayList<Integer> list = new ArrayList<>();
        int n = 0;
        while(scanner.hasNextLine()){
            n = Integer.valueOf(scanner.nextLine());
            if(n == 999){
                break;
            }
            list.add(n);
        }
        System.out.println("Smallest number: " + Collections.min(list));
        System.out.println("Found at index: ");
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) == Collections.min(list)){
                System.out.println(i);
            }
        }
    }
}
