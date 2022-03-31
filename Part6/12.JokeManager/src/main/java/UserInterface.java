import java.util.Scanner;

public class UserInterface {
    private Scanner scan;
    private JokeManager manager;
    
    public UserInterface(JokeManager manager, Scanner scan){
        this.scan = scan;
        this.manager = manager;
    }
    
    public void start(){
        while(true){
            printCommands();
            String command = scan.nextLine();
            if (command.equals("X")) {
                break;
            }
            if (command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = scan.nextLine();
                manager.addJoke(joke);
                continue;
            }
            if (command.equals("2")) {
                System.out.println("Drawing a joke.");
                String joke = manager.drawJoke();
                System.out.println(joke);
                continue;
            }
            if (command.equals("3")) {
                System.out.println("Printing the jokes.");
                manager.printJokes();
                continue;
            }
        }
    }
    
    public void printCommands(){
        System.out.println("Commands:");
        System.out.println(" 1 - add a joke");
        System.out.println(" 2 - draw a joke");
        System.out.println(" 3 - list jokes");
        System.out.println(" X - stop");
    }
}
