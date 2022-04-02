
import java.util.Scanner;

public class UserInterface {
    private Grades grades;
    private Scanner scanner;

    public UserInterface(Grades grades, Scanner scanner) {
        this.grades = grades;
        this.scanner = scanner;
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        readPoints();
        System.out.println("");
        printPointsAverage();
        printPassingPointsAverage();
        printPassingPercentage();
        printGradeDistribution();
    }

    public void readPoints() {
        while (true) {
            //System.out.print("Points: ");
            String input = scanner.nextLine();
            if (input.equals("-1")) {
                break;
            }

            int points = Integer.valueOf(input);

            if (points < 0 || points > 100) {
                System.out.println("Impossible number.");
                continue;
            }

            this.grades.addGradeBasedOnPoints(points);
        }
    }

    public void printGradeDistribution() {
        int grade = 5;
        while (grade >= 0) {
            int stars = grades.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printStars(stars);
            System.out.println("");

            grade = grade - 1;
        }
    }

    public static void printStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }

    private void printPointsAverage() {
        double avg = grades.pointAverage();
        System.out.println("Point average (all): " + avg);
    }
    private void printPassingPointsAverage() {
        double avg = grades.passingPointAverage();
        System.out.println("Point average (passing): " + avg);
    }

    private void printPassingPercentage() {
        double percentage = grades.passingPercentage();
        System.out.println("Pass percentage: " + percentage);
    }
}
