
import java.util.ArrayList;

public class Stack {
    private ArrayList<String> list;
    
    public Stack(){
        this.list = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        return this.list.isEmpty();
    }
    
    public void add(String value){
        this.list.add(value);
    }
    
    public ArrayList<String> values(){
        return new ArrayList(list);
    }
    
    public String take(){
        String value = this.list.get(this.list.size() - 1);
        this.list.remove(this.list.size() - 1);
        return value;
    }
}
