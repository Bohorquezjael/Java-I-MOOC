
import java.util.ArrayList;
import java.util.Scanner;

public class Searching {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book(24875, "Jole Smokes"));
        int idToSearchFor = 24875;
        int binarySearchId = binarySearch(books, idToSearchFor);
        if (binarySearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchId));
        }

    }

    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        for (int i = 0; i < books.size(); i++) {
            if (searchedId == books.get(i).getId()) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(ArrayList<Book> books, int searchedId) {
        int begin = 0;
        int end = books.size() - 1;
        int middle = 0;
        while (begin <= end) {
            middle = (end + begin) / 2;
            if (books.get(middle).getId() == searchedId) {
                return middle;
            }
            if (books.get(middle).getId() < searchedId) {
                begin = middle + 1;
            }
            if (books.get(middle).getId() > searchedId) {
                end = middle - 1;
            }

        }
        return -1;
    }
}