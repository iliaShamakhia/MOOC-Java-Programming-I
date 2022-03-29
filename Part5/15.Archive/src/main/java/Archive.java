public class Archive {
    private String id;
    private String name;
    
    public Archive(String id, String name){
        this.id = id;
        this.name = name;
    }
    
    public boolean equals(Object other){
        if(this == other)return true;
        if(!(other instanceof Archive))return false;
        Archive that = (Archive)other;
        if(this.id.equals(that.id)){
            return true;
        }
        return false;
    }
    
    public String toString(){
        return this.id + ": " + this.name;
    }
}
