
public class Container {
    private int liters;
    
    public Container(){
        this.liters = 0;
    }
    public int contains(){
        return this.liters;
    }
    public void add(int amount){
        if(amount > 0){
            int sum = this.liters + amount;
            if(sum >= 100){
                this.liters = 100;
            }else{
                this.liters = sum;
            }
        }
    }
    public void remove(int amount){
        if(amount > 0){
            int difference = this.liters - amount;
            if(difference < 0){
                this.liters = 0;
            }else{
                this.liters = difference;
            }
        }
    }
    public String toString(){
        return this.liters + "/100";
    }
}
