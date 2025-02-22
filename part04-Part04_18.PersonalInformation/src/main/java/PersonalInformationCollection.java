
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class
 
        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String n = scanner.nextLine();
            if(n.equals("")){
                break;
            }
            String l = scanner.nextLine();
            String i = scanner.nextLine();
            infoCollection.add(new PersonalInformation(n, l, i));
        }
        for (PersonalInformation personalInformation : infoCollection) {
            System.out.println(personalInformation.getFirstName() + " " + personalInformation.getLastName());
        }
    }
}
