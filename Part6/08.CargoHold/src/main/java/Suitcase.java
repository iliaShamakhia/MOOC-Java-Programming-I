import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    
    public Suitcase(int maxWeight){
        this.items = new ArrayList();
        this.maxWeight = maxWeight;
    }
    
    public void addItem(Item item){
        if((this.totalWeight() + item.getWeight()) <= this.maxWeight){
            this.items.add(item);
        }
    }
    
    public int totalWeight(){
        int weight = 0;
        for(Item item : items){
            weight += item.getWeight();
        }
        return weight;
    }
    
    public String toString(){
        if(this.items.isEmpty())return "no items (0 kg)";
        return this.items.size() + (this.items.size()==1?" item ":" items ") + "(" + this.totalWeight() + " kg)";
    }
    
    public void printItems(){
        for(Item item : items){
            System.out.println(item);
        }
    }
    
    public Item heaviestItem(){
        if(this.items.isEmpty())return null;
        Item heaviest = this.items.get(0);
        for(Item item : items){
            if(item.getWeight() > heaviest.getWeight()){
                heaviest = item;
            }
        }
        return heaviest;
    }
}
