
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalNums = 0;
        while(true){
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());
            if(input == 0){
                System.out.println("Number of negative numbers: " + totalNums);;
                break;
            }
            if(input < 0){
                totalNums = totalNums + 1;
            }
        }
    }
}
