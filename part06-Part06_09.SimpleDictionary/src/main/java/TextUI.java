import java.util.Scanner;

public class TextUI {
    private Scanner sc;
    private SimpleDictionary sDicti;

    public TextUI(Scanner sc, SimpleDictionary sDicti) {
        this.sc = sc;
        this.sDicti = sDicti;
    }
    
    public void start(){
        while(true){
            System.out.println("Command:");
            String command = sc.nextLine();
            if(command.equals("end")){
                System.out.println("Bye bye!");
                break;
            }
            this.menu(command);
        }
    }

    private void menu(String command) {
        switch(command){
            case "add":
                System.out.println("Word:");
                String word = sc.nextLine();
                System.out.println("Translation:");
                String translation = sc.nextLine();
                this.sDicti.add(word, translation);
                break;
            
            case "search":
                System.out.println("To be translated:");
                String translated = sc.nextLine();
                System.out.print("Translation: ");
                String translate = this.sDicti.translate(translated);
                System.out.print(translate == null ? "Word " + translated + " was not found" : translate + "\n");
                
            default:
                System.out.println("Unknown command");
                break;
        }
    }
    
}
