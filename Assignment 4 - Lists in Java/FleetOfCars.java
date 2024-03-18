
import java.util.*;
public class FleetOfCars 
{
    private ArrayList<Car> fleet;
    private int len;
    
    public FleetOfCars()
    {
        fleet = new ArrayList<Car>();
        len = 0;
    }
    public FleetOfCars search(String s)
    {
        FleetOfCars newFleet = new FleetOfCars();
        for (int i = 0; i < fleet.size(); i++)
        {
            
            if (fleet.get(i).getMakeAndModel().equals(s))
            {
                newFleet.add(fleet.get(i));
            }
                
        }
        return newFleet;
    }

    public void add(Car x)
    {
        fleet.add(x);
        len += 1;
    }
    
    public int getSize()
    {
        return len;
    }

    public void delete(int i)
    {
        fleet.remove(i);
        len -= 1;
    }

    public Car get(int i)
    {
        return fleet.get(i);    
    }

    public String toString()
    {
        String retStr = "";
        for (int i = 0; i < fleet.size(); i++)
        {
            retStr += "\n" + fleet.get(i);
        }
        return retStr;
    }
}


