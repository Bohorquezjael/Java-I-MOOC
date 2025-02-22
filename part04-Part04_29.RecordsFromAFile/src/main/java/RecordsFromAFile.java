import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        try(Scanner sc = new Scanner(Paths.get(file))){
            while(sc.hasNextLine()){
                String[] s = sc.nextLine().split(","); 
                String ss = s[0] + ",age: " + s[1] + " years";
                System.out.println(Integer.parseInt(s[1]) == 1 ? ss.substring(0, ss.length() - 1) : ss);
            }
        }catch(Exception e){
            System.out.println("error");
        }
        
    }
}
