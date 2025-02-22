
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    @Override
    public String toString(){
        String s = "";
        if(this.elements.isEmpty()){
            s += "The collection " + this.name + " is empty.";
        }else{
            s += "The collection " + this.name + " has " + this.elements.size() + " element";
            s += this.elements.size() > 1 ? "s:\n" : ":\n";
            for (String element : elements) {
                s += element;
                if(this.elements.indexOf(element) < this.elements.size() - 1){
                    s += "\n";
                }
            }
        }
        
        return s;
    }
    
}
