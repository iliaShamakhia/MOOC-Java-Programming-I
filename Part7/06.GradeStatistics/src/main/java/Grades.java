
import java.util.ArrayList;

public class Grades {
    private ArrayList<Integer> grades;
    private ArrayList<Integer> passingGrades;
    private ArrayList<Integer> stars;
    
    public Grades(){
        this.grades = new ArrayList();
        this.passingGrades = new ArrayList();
        this.stars = new ArrayList();
    }
    
    public void addGradeBasedOnPoints(int points) {
        this.stars.add(pointsToGrades(points));
        this.grades.add(points);
        if(points >= 50){
            this.passingGrades.add(points);
        }
    }
    
    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received: this.stars) {
            if (received == grade) {
                count++;
            }
        }
        return count;
    }
    
    public static int pointsToGrades(int points) {
        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }
        return grade;
    }
    public double pointAverage(){
        if(grades.size() == 0)return -1;
        int sum = 0;
        for(int grade : grades){
            sum += grade;
        }
        return (1.0 * sum) / grades.size();
    }
    public double passingPointAverage(){
        if(passingGrades.size() == 0)return -1;
        int sum = 0;
        for(int grade : passingGrades){
            sum += grade;
        }
        return (1.0 * sum) / passingGrades.size();
    }
    public double passingPercentage(){
        if(grades.size() == 0)return -1;
        return (1.0 * 100) * passingGrades.size() / grades.size();
    }
}
