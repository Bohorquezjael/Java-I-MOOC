
import java.util.Random;
import java.util.Scanner;

public class UserInterface {

    private JokeManager jokeManager;
    private Scanner sc;

    public UserInterface(JokeManager jokeMngr, Scanner sc) {
        this.jokeManager = jokeMngr;
        this.sc = sc;
    }

    public void start() {
        while (true) {
            this.listAllCommands();

            String command = sc.nextLine();

            if (command.equals("X")) {
                break;
            }

            if (command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = sc.nextLine();
                this.jokeManager.addJoke(joke);
            } else if (command.equals("2")) {
                System.out.println("Drawing a joke.");
                System.out.println(this.jokeManager.drawJoke());

            } else if (command.equals("3")) {
                System.out.println("Printing the jokes.");
                this.jokeManager.printJokes();
            }
        }

    }

    private void listAllCommands() {
        System.out.println("Commands:");
        System.out.println(" 1 - add a joke");
        System.out.println(" 2 - draw a joke");
        System.out.println(" 3 - list jokes");
        System.out.println(" X - stop");
    }
}