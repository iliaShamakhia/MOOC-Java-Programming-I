
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private ArrayList<Recipe> recipes;
    
    public UserInterface(Scanner scanner){
        this.scanner = scanner;
        this.recipes = new ArrayList();
    }
    
    public void start(){
        readFile();
        readCommands();
    }
    public void readFile(){
        System.out.println("File to read:");
        String file = scanner.nextLine();
        try (Scanner scan = new Scanner(Paths.get(file))) {
            while (scan.hasNextLine()) {
                String name = scan.nextLine();
                int time = Integer.valueOf(scan.nextLine());
                Recipe recipe = new Recipe(name, time);
                String line = scan.nextLine();
                
                while(!line.isEmpty() && scan.hasNextLine()){
                    recipe.addIngredient(line);
                    line = scan.nextLine();
                }
                if(!line.isEmpty()){
                    recipe.addIngredient(line);
                }
                recipes.add(recipe);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public void readCommands(){
        while(true){
            printCommands();
            System.out.println("Enter command:");
            String command = scanner.nextLine();
            if(command.equals("stop")){
                break;
            }
            if(command.equals("list")){
                printRecipes();
            }
            if(command.equals("find name")){
                System.out.println("Searched word:");
                String word = scanner.nextLine();
                printRecipesByName(word);
            }
            if(command.equals("find cooking time")){
                System.out.println("Max cooking time:");
                int time = Integer.valueOf(scanner.nextLine());
                printRecipesByTime(time);
            }
            if(command.equals("find ingredient")){
                System.out.println("Ingredient:");
                String ingredient = scanner.nextLine();
                printRecipesByIngredient(ingredient);
            }
        }
    }
    private void printCommands(){
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
    }

    private void printRecipes() {
        if(recipes.size() == 0){
            System.out.println("Recipe book is empty");
            return;
        }
        System.out.println("Recipes:");
        for(Recipe recipe : recipes){
            System.out.println(recipe.getName() + ", cooking time: " + recipe.getCookTime());
        }
    }
    private void printRecipesByName(String word){
        if(recipes.size() == 0){
            System.out.println("Recipe book is empty");
            return;
        }
        System.out.println("Recipes:");
        for(Recipe recipe : recipes){
            if(recipe.getName().contains(word)){
                System.out.println(recipe.getName() + ", cooking time: " + recipe.getCookTime());
            }
        }
    }
    private void printRecipesByTime(int time){
        if(recipes.size() == 0){
            System.out.println("Recipe book is empty");
            return;
        }
        System.out.println("Recipes:");
        for(Recipe recipe : recipes){
            if(recipe.getCookTime() <= time){
                System.out.println(recipe.getName() + ", cooking time: " + recipe.getCookTime());
            }
        }
    }
    private void printRecipesByIngredient(String ingredient){
        if(recipes.size() == 0){
            System.out.println("Recipe book is empty");
            return;
        }
        System.out.println("Recipes:");
        for(Recipe recipe : recipes){
            ArrayList<String> ingredients = recipe.getIngredients();
            if(ingredients.contains(ingredient)){
                System.out.println(recipe.getName() + ", cooking time: " + recipe.getCookTime());
            }
        }
    }
}
