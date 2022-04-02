
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private ArrayList<Bird> birds;
    
    public UserInterface(Scanner scanner){
        this.scanner = scanner;
        this.birds = new ArrayList();
    }
    public void start(){
        readInput();
    }
    public void readInput(){
        while(true){
            System.out.println("?");
            String command = scanner.nextLine();
            if(command.equals("Quit")){
                break;
            }
            if(command.equals("Add")){
                System.out.println("Name:");
                String name = scanner.nextLine();
                System.out.println("Name in Latin:");
                String latinName = scanner.nextLine();
                birds.add(new Bird(name, latinName));
            }
            if(command.equals("Observation")){
                System.out.println("Bird?");
                String bird = scanner.nextLine();
                addObservation(bird);
            }
            if(command.equals("All")){
                printAllBirds();
            }
            if(command.equals("One")){
                System.out.println("Bird?");
                String bird = scanner.nextLine();
                printBird(bird);
            }
        }
    }
    private void addObservation(String bird){
        for(Bird brd : birds){
            if(brd.getName().equals(bird)){
                brd.addObservation();
                return;
            }
        }
        System.out.println("Not a bird!");
    }
    private void printAllBirds(){
        for(Bird bird : birds){
            System.out.println(bird);
        }
    }
    private void printBird(String bird){
        for(Bird brd : birds){
            if(brd.getName().equals(bird)){
                System.out.println(brd);
                return;
            }
        }
    }
}
