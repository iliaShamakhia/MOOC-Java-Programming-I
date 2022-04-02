
import java.util.ArrayList;

public class Recipe {
    private String name;
    private int cookTime;
    private ArrayList<String> ingredients;
    
    public Recipe(String name, int cookTime){
        this.name = name;
        this.cookTime = cookTime;
        this.ingredients = new ArrayList();
    }
    
    public void addIngredient(String ingredient){
        this.ingredients.add(ingredient);
    }
    public String getName(){
        return name;
    }
    public int getCookTime(){
        return cookTime;
    }
    public ArrayList<String> getIngredients(){
        return ingredients;
    }
    public String toString(){
        String res = "";
        for(String rec : ingredients){
            res += rec + " ";
        }
        return res;
    }
}
