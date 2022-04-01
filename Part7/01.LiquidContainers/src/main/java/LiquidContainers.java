
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;
        System.out.println("First: " + first + "/100");
        System.out.println("Second: " + second + "/100");

        while (true) {
            System.out.print("> ");
            
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] inputs = input.split(" ");
            String command = inputs[0];
            int amount = Integer.valueOf(inputs[1]);
            
            if(command.equals("add")){
                if(amount > 0){
                    int sum = first + amount;
                    if(sum >= 100){
                        first = 100;
                    }else{
                        first = sum;
                    }
                }
                System.out.println("First: " + first + "/100");
                System.out.println("Second: " + second + "/100");
                continue;
            }
            if(command.equals("move")){
                if(first != 0){
                    if(amount > 0){
                        int sum = 0;
                        if(amount >= first){
                            sum = first + second;
                            first = 0;
                        }else{
                            first -= amount;
                            sum = amount + second; 
                        }
                        if(sum >= 100){
                            second = 100;
                        }else{
                            second = sum;
                        }
                    }
                }
                System.out.println("First: " + first + "/100");
                System.out.println("Second: " + second + "/100");
                continue;
            }
            if(command.equals("remove")){
                if(second !=0){
                    if(amount > 0){
                        if(amount >= second){
                            second = 0;
                        }else{
                            second -= amount;
                        }
                    }
                }
                System.out.println("First: " + first + "/100");
                System.out.println("Second: " + second + "/100");
                continue;
            }
        }
    }

}
