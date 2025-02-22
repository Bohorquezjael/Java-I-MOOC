
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
    }
    public static void removeLast(ArrayList<Integer> nums){
        if(!nums.isEmpty()){
            nums.remove(nums.size() - 1);
        }
    }

}
