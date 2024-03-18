
public class ElectricCar extends Car 
{
    private double batterySize;
    public ElectricCar(String makeAndModel, int maximumNumberOfPassengers, int numberOfDoors, double batterySize)
    {
        super(makeAndModel, maximumNumberOfPassengers, numberOfDoors);
        this.batterySize = batterySize;
    }
    public double getBatterySize()
    {
        return this.batterySize;
    }
    public void setBatterySize(double b)
    {
        this.batterySize = b;
    }
    public String toString()
    {
        return super.toString() + "\n Battery Size: " + this.batterySize;
    }
}
