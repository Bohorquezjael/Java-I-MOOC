
import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons = new ArrayList<>();
    
    public void add(Person person){
        this.persons.add(person);
    }
    
    public boolean isEmpty(){
        return this.persons.isEmpty();
    }
    
    public ArrayList<Person> getPersons(){
        return new ArrayList<>(persons);
    }
    
    public Person shortest(){
        Person p = null;
        
        if(!this.isEmpty()){
            p = this.persons.get(0);
            for (Person person : persons) {
                if(person.getHeight() < p.getHeight()){
                    p = person;
                }
            }
        }
        return p;
    }
    
    public Person take(){
        Person takes = this.shortest();
        this.persons.remove(takes);
        return takes;
    }
}
