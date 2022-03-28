
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared){
        if(this.squares > compared.squares){
            return true;
        }
        return false;
    }
    
    public int priceDifference(Apartment compared){
        int thisApartment = this.squares * this.princePerSquare;
        int thatApartment = compared.squares * compared.princePerSquare;
        return Math.abs(thisApartment - thatApartment);
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        int thisApartment = this.squares * this.princePerSquare;
        int thatApartment = compared.squares * compared.princePerSquare;
        if(thisApartment > thatApartment){
            return true;
        }
        return false;
    }

}
