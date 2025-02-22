import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String t = scanner.nextLine();
            if(t.equals("")){
                break;
            }
            int pages = Integer.parseInt(scanner.nextLine());
            int pY = Integer.parseInt(scanner.nextLine());
            books.add(new Book(t, pages, pY));
        }

        System.out.println("What informstion will be printed");
        String d = scanner.nextLine();
        for (Book book : books) {
            if (d.equals("everything")) {
                System.out.println(book);
            }else{
                System.out.println(book.getTitle());
            }
        }

    }
}
