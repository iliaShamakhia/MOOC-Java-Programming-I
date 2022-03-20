
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numOfPersons = 0;
        String longestName = "";
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            String[] words = input.split(",");
            String name = words[0];
            int year = Integer.valueOf(words[1]);
            sum += year;
            numOfPersons++;
            if(name.length() > longestName.length()){
                longestName = name;
            }
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (1.0 * sum / numOfPersons));

    }
}
