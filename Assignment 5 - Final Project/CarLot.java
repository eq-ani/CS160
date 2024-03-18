import java.util.*;
public class CarLot {
    Queue<Car> electric;
    Queue<Car> hybrid;
    Queue<Car> gas;

    public CarLot()
    {
        electric = new Queue<>();
        hybrid = new Queue<>();
        gas = new Queue<>();
    }

    public boolean addCar(Car z)
    {
        if (z.getPowerSource() == 1)
        {
            gas.enqueue(z);
            return true;
        }
        else if (z.getPowerSource() == 2)
        {
            hybrid.enqueue(z);
            return true;
        }
        else if (z.getPowerSource() == 3)
        {
            electric.enqueue(z);
            return true;
        }
        return false;
    }

    public List<Car> processRequests(CarRequests reqs)
    {
        List<Car> listofcars = new ArrayList<>();
        int req;
        while (reqs.hasPendingRequests())
        {
            req = reqs.getRequest();
            if (req == 1)
            {
                if (gas.isEmpty())
                {
                    listofcars.add(new Car(0,0,0));
                }
                else
                {
                    listofcars.add(gas.dequeue());
                }
            }
            if (req == 2)
            {
                if (hybrid.isEmpty())
                {
                    listofcars.add(new Car(0,0,0));
                }
                else
                {
                    listofcars.add(hybrid.dequeue());
                }
            }
            if (req == 3)
            {
                if (electric.isEmpty())
                {
                    listofcars.add(new Car(0,0,0));
                }
                else
                {
                    listofcars.add(electric.dequeue());
                }
            }
        }
        return listofcars;
    }

    public String toString()
    {
        return "Gasoline: \n" + gas + "Hybrid: \n" + hybrid + "Electric: \n" + electric;
    }
    
}