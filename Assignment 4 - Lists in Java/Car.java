
public class Car {

    private String makeAndModel;
    private int maximumNumberOfPassengers;
    private int numberOfDoors;

    Car(String makeAndModel, int maximumNumberOfPassengers, int numberOfDoors){
        this.makeAndModel = makeAndModel;
        this.maximumNumberOfPassengers = maximumNumberOfPassengers;
        this.numberOfDoors = numberOfDoors;
    }
    
    public String getMakeAndModel(){
        return this.makeAndModel;
    }
    public int getMaximumNumberOfPassengers(){
        return this.maximumNumberOfPassengers;
    }
    public int getNumberOfDoors(){
        return this.numberOfDoors;
    }
    public void setMakeAndModel(String m){
        this.makeAndModel = m;
    }
    public void setMaximumNumberOfPassengers(int m){
        this.maximumNumberOfPassengers = m;
    }
    public void setNumberOfDoors(int m){
        this.numberOfDoors = m;
    }
    public String toString(){
        return "Make and Model: " + this.makeAndModel + "\nMaximum Number of Passengers: " + this.maximumNumberOfPassengers + "\nNumber of Doors: " + this.numberOfDoors + "\n";
    }
}
