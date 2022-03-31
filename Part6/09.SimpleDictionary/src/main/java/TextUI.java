import java.util.Scanner;

public class TextUI {
    private Scanner scan;
    private SimpleDictionary dictionary;
    
    public TextUI(Scanner scan, SimpleDictionary dictionary){
        this.scan = scan;
        this.dictionary = dictionary;
    }
    
    public void start(){
        while(true){
            System.out.println("Command:");
            String command = scan.nextLine();
            
            if(command.equals("end")){
                System.out.println("Bye bye!");
                break;
            }
            
            if(command.equals("add")){
                System.out.println("Word:");
                String word = scan.nextLine();
                System.out.println("Translation:");
                String translation = scan.nextLine();
                this.dictionary.add(word, translation);
                continue;
            }
            
            if(command.equals("search")){
                System.out.println("To be translated:");
                String word = scan.nextLine();
                String translated = this.dictionary.translate(word);
                if(translated == null){
                    System.out.println("Word " + word + " was not found");
                }else{
                    System.out.println("Translation: " + translated);
                }
                continue;
            }
            
            System.out.println("Unknown command");
        }
    }
}
