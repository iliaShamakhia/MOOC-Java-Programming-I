public class Bird {
    private String name;
    private String latinName;
    private int observations;
    
    public Bird(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
        this.observations = 0;
    }
    
    public String getName(){
        return this.name;
    }
    public String getLatinName(){
        return this.latinName;
    }
    public int getObservations(){
        return this.observations;
    }
    public void addObservation(){
        this.observations++;
    }
    public String toString(){
        return this.getName() + "(" + this.getLatinName() + "): " + this.getObservations() + " observations";
    }
}
