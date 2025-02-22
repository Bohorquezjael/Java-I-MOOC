import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String s = scanner.nextLine();
            if(s.equals("")){
                break;
            }
            int duration = Integer.parseInt(scanner.nextLine());
            programs.add(new TelevisionProgram(s, duration));
        }

        System.out.println("Program´s maximum duration");
        int d = Integer.parseInt(scanner.nextLine());
        for (TelevisionProgram program : programs) {
            if (program.getDuration() <= d) {
                System.out.println(program);
            }
        }
    }
}
