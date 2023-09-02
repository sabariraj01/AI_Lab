import java.io.*;

class Elevator 
{
    int numFloors = 10;
    int currentFloor;
    String direction;
    int tempCurr;

    public void move() 
    {
        if ("UP".equals(direction)) 
        {
            currentFloor++;
        } 
        else 
        {
            currentFloor--;
        }
    }

    public void processRequest(int destinationFloor) 
    { 
        System.out.println("Elevator is on floor " + currentFloor);
        System.out.println("Request from floor " + destinationFloor);
        int floorsMoved = 0;
        tempCurr=destinationFloor;

        if (this.currentFloor < destinationFloor) 
        {
            direction = "UP";
            while (this.currentFloor < destinationFloor) 
            {
                move();
                floorsMoved++;
            }
        } 
        else if (this.currentFloor > destinationFloor) 
        {
            direction = "DOWN";
            while (this.currentFloor > destinationFloor) 
            {
                move();
                floorsMoved++;
            }
        }

        System.out.println("Elevator moved " + floorsMoved + " floor(s) " + direction+"\n");
        currentFloor=tempCurr;
    }
}

public class asgn4_2 
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br=new BufferedReader(new FileReader("lift.txt"));
        Elevator elevator = new Elevator(); 
        int r;
        while((r=br.read())!=-1)
        {
            int destinationFloor=Character.getNumericValue(r);
            elevator.processRequest(destinationFloor); 
        }
        br.close();
    }
}
