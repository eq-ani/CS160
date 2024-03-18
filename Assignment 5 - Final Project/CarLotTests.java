import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CarLotTests {
    @Test 
    public void carLotConstructorTest()
    {
        CarLot lot = new CarLot();
        lot.addCar(new Car(69,1,24));
        lot.addCar(new Car(20,2,14));
        lot.addCar(new Car(90,3,90));
        assertEquals("Gasoline: \nID: 69\nType of Car: Gasoline\nPrice per day: $24.00\n\nHybrid: \nID: 20\nType of Car: Hybrid\nPrice per day: $14.00\n\nElectric: \nID: 90\nType of Car: Electric\nPrice per day: $90.00\n\n", lot.toString());

    }

    @Test 
    public void addCarTest()
    {
        CarLot lot = new CarLot();
        assertEquals(true, lot.addCar(new Car(10,2,10)));
    }

    @Test
    public void processRequestTest()
    {
        CarLot lot = new CarLot();
        lot.addCar(new Car(69,1,24));
        lot.addCar(new Car(20,2,14));
        lot.addCar(new Car(90,3,90));
        lot.addCar(new Car(100, 1, 178));
        CarRequests carreq = new CarRequests();
        carreq.addRequest(1);
        carreq.addRequest(2);
        carreq.addRequest(3);
        carreq.addRequest(1);
        assertEquals("[ID: 69\nType of Car: Gasoline\nPrice per day: $24.00\n, ID: 20\nType of Car: Hybrid\nPrice per day: $14.00\n, ID: 90\nType of Car: Electric\nPrice per day: $90.00\n, ID: 100\nType of Car: Gasoline\nPrice per day: $178.00\n]", lot.processRequests(carreq).toString());
    }
}    