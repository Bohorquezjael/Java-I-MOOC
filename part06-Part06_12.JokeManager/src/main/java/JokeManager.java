
import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokes;
    
    public JokeManager(){
        this.jokes = new ArrayList<>();
    }
        

    public void addJoke(String joke){
        this.jokes.add(joke);
    }
    
    public String drawJoke(){
        String jokeSelected;
        if(jokes.isEmpty()){
            jokeSelected = "Jokes are in short supply.";
        }else{
            Random r = new Random();
            jokeSelected = this.jokes.get(r.nextInt(this.jokes.size()));
        }
        return jokeSelected;
    }
    
    public void printJokes(){
        for (String joke : jokes) {
            System.out.println(joke);
        }
    }
}
