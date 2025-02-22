
import java.util.ArrayList;
import java.util.List;

public class PrintInRange {

    public static void main(String[] args) {
    }
    
    public static void printNumbersInRange(ArrayList<Integer> list, int lowerLimit, int upperLimit){
        System.out.println("The numbers in the range [" +  lowerLimit + ", " + upperLimit + "]");
        for (Integer integer : list) {
            if(integer <= upperLimit && integer >= lowerLimit){
                System.out.println(list.get(list.indexOf(integer)));
            }
        }
    }
}
