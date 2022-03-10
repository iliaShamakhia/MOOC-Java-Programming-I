
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalNums = 0;
        int sum = 0;
        while(true){
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());
            if(input == 0){
                double average = (double)sum / totalNums;
                System.out.println("Average of the numbers: " + average);
                break;
            }
            if(input != 0){
                totalNums = totalNums + 1;
                sum = sum + input;
            }
        }
    }
}
