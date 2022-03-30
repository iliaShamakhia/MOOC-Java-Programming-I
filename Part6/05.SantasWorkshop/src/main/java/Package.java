import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> gifts;
    
    public Package(){
        this.gifts = new ArrayList();
    }
    
    public void addGift(Gift gift){
        this.gifts.add(gift);
    }
    
    public int totalWeight(){
        if(gifts.size() == 0)return -1;
        int total = 0;
        for(Gift gift : gifts){
            total += gift.getWeight();
        }
        return total;
    }
}
