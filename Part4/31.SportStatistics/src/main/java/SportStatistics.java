
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        int matchesPlayed = 0;
        int wins = 0;
        int losses = 0;
        try{
            Scanner sc = new Scanner(Paths.get(file));
            while(sc.hasNextLine()){
                String[] data = sc.nextLine().split(",");
                if(data[0].equals(team)){
                    if(Integer.valueOf(data[2]) > Integer.valueOf(data[3])){
                        wins++;
                    }else{
                        losses++;
                    }
                    matchesPlayed++;
                }
                if(data[1].equals(team)){
                    if(Integer.valueOf(data[3]) > Integer.valueOf(data[2])){
                        wins++;  
                    }else{
                        losses++;
                    }
                    matchesPlayed++;
                }
            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Games: " + matchesPlayed);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

}
