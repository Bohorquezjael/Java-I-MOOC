
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String n = scanner.nextLine();
            if(n.equals("")){
                break;
            }
            items.add(new Item(n));
        }
        for (Item item : items) {
            System.out.println(item);
        }
    }
}
