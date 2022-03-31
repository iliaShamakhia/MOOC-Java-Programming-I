import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokes;
    
    public JokeManager(){
        this.jokes = new ArrayList();
    }
    
    public void addJoke(String joke){
        this.jokes.add(joke);
    }
    
    public String drawJoke(){
        int total = jokes.size();
        if(total == 0)return "Jokes are in short supply.";
        Random draw = new Random();
        int index = draw.nextInt(total);
        String joke = jokes.get(index);
        return joke;
    }
    
    public void printJokes(){
        for(String joke : jokes){
            System.out.println(joke);
        }
    }
}
