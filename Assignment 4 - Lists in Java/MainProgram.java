import java.util.*;

public class MainProgram {
    public static void main(String[] args) {

        FleetOfCars fleet = new FleetOfCars();
        Scanner input = new Scanner(System.in);
        
        while (true){
            
            System.out.println("Enter option from list below: \n 1) Display complete directory \n 2) Enter new Car \n 3) Search for Car \n 4) Modify Car Information \n 5) Delete a record. \n Q) Quit" );
            System.out.println("Enter your option: ");
            String userinp = input.nextLine();
            if (userinp.equals("1"))
            {
                System.out.println(fleet);
            }
            else if (userinp.equals("2"))
            {
                System.out.println("What is the make and model of your car?: ");
                String inp1 = input.nextLine();
                System.out.println("How many passengers can your car hold?: ");
                int inp2 = input.nextInt();
                System.out.println("How many doors does your car have?: ");
                int inp3 = input.nextInt();
                    
                fleet.add(new Car(inp1, inp2, inp3));
            }
            else if (userinp.equals("3"))
            {
                System.out.println("What is the make and model you would like to search for?: ");
                String inp = input.nextLine();
                System.out.println(fleet.search(inp));
            }
            else if (userinp.equals("4"))
            {
                System.out.println("What make and model of car would you like to modify?: ");
                String inp = input.nextLine();

                FleetOfCars changefleet = fleet.search(inp);
                Car currcarr;
                for (int i = 0; i < changefleet.getSize(); i++)
                {   
                    currcarr = changefleet.get(i);
                    System.out.println(changefleet.get(i));

                    System.out.println("Would you to change the above record?: (y/n)");
                    String change = input.next();
                    if (change.toLowerCase().equals("y"))
                    {
                        System.out.println("What would you like to change the make and model to?: ");
                        String ch1 = input.next();
                        currcarr.setMakeAndModel(ch1); 
                        System.out.println("What would you like to change the number of passengers to?: ");
                        int ch2 = input.nextInt();
                        currcarr.setMaximumNumberOfPassengers(ch2); 
                        System.out.println("What would you like to change number of doors to?: ");
                        int ch3 = input.nextInt();
                        currcarr.setNumberOfDoors(ch3);                               
                    }
                }
                System.out.println(changefleet);
            }
            else if (userinp.equals("5"))
            {
                System.out.println("What is the index of the record you want to delete?: ");
                int inp1 = input.nextInt();

                if (inp1 >= 0 && inp1 < fleet.getSize())
                {
                    System.out.println("Would you like to delete this record? (y/n)");
                    String inp2 = input.next();
                    if (inp2.toLowerCase().equals("y"))
                    {
                        fleet.delete(inp1);
                    }
                }
            }
            else if (userinp.toLowerCase().equals("q"))
            {
                input.close();
                break;
            }
            System.out.println("");    
        }
        input.close();
    }
}
