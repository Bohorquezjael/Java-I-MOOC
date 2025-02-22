
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Which file should have its contents printed?");
            String p = sc.nextLine();
            Scanner fsc = new Scanner(Paths.get(p));
            while(fsc.hasNextLine()){
                System.out.println(fsc.nextLine());
            }
        } catch (Exception ex) {
            System.out.println("error");
        }
    }
}
