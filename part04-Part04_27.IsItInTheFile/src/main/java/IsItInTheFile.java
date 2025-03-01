
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IsItInTheFile {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Name of the file:");
            String file = scanner.nextLine();
            
            System.out.println("Search for:");
            String searchedFor = scanner.nextLine();
        try (Scanner sc = new Scanner(Paths.get(file))){
            boolean found = false;
            while(sc.hasNextLine() && !found){
                if(sc.nextLine().equals(searchedFor)){
                    found = true;
                }
            }
            System.out.println(found ? "Found!" : "Not found.");
        } catch (IOException ex) {
            System.out.println( "Reading the file " + file + " failed.");
        }
        
    }
}
