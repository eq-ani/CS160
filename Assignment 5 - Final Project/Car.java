public class Car {
    protected int id;
    protected int powerSource;
    protected float pricePerDay;
    public Car(int id, int powerSource, float pricePerDay){
        this.id = id;
        this.powerSource = powerSource;
        this.pricePerDay = pricePerDay;
    }
    public int getId()
    {
        return this.id;
    }
    public void setId(int x)
    {
        this.id = x;
    }
    public int getPowerSource()
    {
        return this.powerSource;
    }
    public void setPowerSource(int x)
    {
        this.powerSource = x;
    }
    public float getPricePerDay()
    {
        return this.pricePerDay;
    }
    public void setPricePerDay(float x)
    {
        this.pricePerDay = x;
    }

    public String toString(){
        String typeCar = "Unknown";
        if (this.powerSource == 1)
        {
            typeCar = "Gasoline";
        }
        else if (this.powerSource == 2)
        {
            typeCar = "Hybrid";
        }
        else if (this.powerSource == 3)
        {
            typeCar = "Electric";
        }
        return "ID: " + this.id + "\nType of Car: " + typeCar + "\nPrice per day: $" + String.format("%.2f",this.pricePerDay) + "\n";
    }
    
}

