import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CarTests {

    @Test 
    public void carConstructorTest()
    {
        Car car = new Car(0 , 1, 10);
        assertEquals("ID: 0\nType of Car: Gasoline\nPrice per day: $10.00\n",car.toString());
    }

    @Test 
    public void getIdTest()
    {
        Car car = new Car(0 , 1, 10);
        assertEquals(0, car.getId());
    }

    @Test 
    public void setIdTest()
    {
        Car car = new Car(0 , 1, 10);
        car.setId(1);
        assertEquals(1, car.getId());
    }

    @Test 
    public void getPowerSourceTest()
    {
        Car car = new Car(0 , 1, 10);
        assertEquals(1, car.getPowerSource());
    }

    @Test 
    public void setPowerSourceTest()
    {
        Car car = new Car(0 , 1, 10);
        car.setPowerSource(2);
        assertEquals(2, car.getPowerSource());
    }

    @Test 
    public void getPricePerDayTest()
    {
        Car car = new Car(0 , 1, 10);
        assertEquals(10, car.getPricePerDay(), .01);
    }

    @Test 
    public void setPricePerDayTest()
    {
        Car car = new Car(0 , 1, 10);
        car.setPricePerDay(1);
        assertEquals(1, car.getPricePerDay(), .01);
    }
}
