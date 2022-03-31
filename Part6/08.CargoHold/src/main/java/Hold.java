import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> hold;
    private int maxWeight;
    
    public Hold(int maxWeight){
        this.hold = new ArrayList();
        this.maxWeight = maxWeight;
    }
    
    public void addSuitcase(Suitcase suitcase){
        if((this.totalWeight() + suitcase.totalWeight()) <= maxWeight){
            this.hold.add(suitcase);
        }
    }
    
    public int totalWeight(){
        int weight = 0;
        for(Suitcase suitcase : hold){
            weight += suitcase.totalWeight();
        }
        return weight;
    }
    
    public String toString(){
        if(this.hold.isEmpty())return "no suitcases (0kg)";
        return this.hold.size() + (this.hold.size()==1?" suitcase ":" suitcases ") + "(" + this.totalWeight() + " kg)";
    }
    
    public void printItems(){
        for(Suitcase suitcase : hold){
            suitcase.printItems();
        }
    }
}
