
public class GasolineCar extends Car 
{
    private double gasTankSize;
    public GasolineCar(String makeAndModel, int maximumNumberOfPassengers, int numberOfDoors, double gasTankSize)
    {
        super(makeAndModel, maximumNumberOfPassengers, numberOfDoors);
        this.gasTankSize = gasTankSize;
    }
    public double getGasTankSize()
    {
        return this.gasTankSize;
    }
    public void setGasTankSize(double b)
    {
        this.gasTankSize = b;
    }
    public String toString()
    {
        return super.toString() + "\n Gas Tank Size: " + this.gasTankSize;
    }
}
