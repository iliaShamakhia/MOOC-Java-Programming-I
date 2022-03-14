
public class AdvancedAstrology {

    public static void printStars(int number) {
        while(number > 0){
            System.out.print("*");
            number--;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        while(number > 0){
            System.out.print(" ");
            number--;
        }
    }

    public static void printTriangle(int size) {
        int stars = 1;
        while(stars <= size){
            printSpaces(size - stars);
            printStars(stars);
            stars++;
        }
    }

    public static void christmasTree(int height) {
        int i = 0;
        int stars = 1;
        while(stars <= height){
            printSpaces(height - stars);
            printStars(stars + i);
            stars++;
            i++;
        }
        for(int j = 0; j < 2; j++){
            printSpaces(height * 2 / 2 - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
