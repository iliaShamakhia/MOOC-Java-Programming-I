
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("First name:");
            String firstName = scanner.nextLine();
            if(firstName.isEmpty()){
                break;
            }
            System.out.println("Last name:");
            String lastName = scanner.nextLine();
            if(lastName.isEmpty()){
                break;
            }
            System.out.println("Identification number:");
            String id = scanner.nextLine();
            if(id.isEmpty()){
                break;
            }
            infoCollection.add(new PersonalInformation(firstName, lastName, id));
        }
        
        for(PersonalInformation info : infoCollection){
            System.out.println(info.getFirstName() + " " + info.getLastName());
        }

    }
}
