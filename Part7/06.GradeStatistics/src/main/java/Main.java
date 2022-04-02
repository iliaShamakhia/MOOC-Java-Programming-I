
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Grades register = new Grades();

        UserInterface userInterface = new UserInterface(register, scanner);
        userInterface.start();
    }
}
