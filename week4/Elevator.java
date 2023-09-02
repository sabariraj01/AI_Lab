
import java.util.Random;

class Elevator {
    private int numFloors;
    private int currentFloor;
    private String direction;

    public Elevator(int numFloors) {
        this.numFloors = numFloors;
        this.currentFloor = 1;
        this.direction = "UP";
    }

    public void move() {
        if ("UP".equals(direction)) {
            currentFloor++;
        } else {
            currentFloor--;
        }
    }

    public void processRequest(int currentFloor, int destinationFloor) {
        System.out.println("Elevator is on floor " + currentFloor + ".");
        System.out.println("Request from floor " + currentFloor + " to go to floor " + destinationFloor + ".");
        int floorsMoved = 0;

        if (this.currentFloor < currentFloor) {
            direction = "UP";
            while (this.currentFloor < currentFloor) {
                move();
                floorsMoved++;
            }
        } else if (this.currentFloor > currentFloor) {
            direction = "DOWN";
            while (this.currentFloor > currentFloor) {
                move();
                floorsMoved++;
            }
        }

        System.out.println("Elevator moved " + floorsMoved + " floor(s) " + direction + ".");
        System.out.println("Elevator has arrived at floor " + currentFloor + ".");
        
        direction = (destinationFloor > currentFloor) ? "UP" : "DOWN";
        floorsMoved = 0;

        while (this.currentFloor != destinationFloor) {
            move();
            floorsMoved++;
        }

        System.out.println("Elevator moved " + floorsMoved + " floor(s) " + direction + ".");
        System.out.println("Elevator has arrived at floor " + destinationFloor + ".");
    }
}

public class Main {
    public static void main(String[] args) {
        int numFloors = 10;
        Elevator elevator = new Elevator(numFloors);
        int numRequests = 3;
        Random rand = new Random();

        for (int i = 0; i < numRequests; i++) {
            int currentFloor = rand.nextInt(numFloors) + 1;
            int destinationFloor = rand.nextInt(numFloors) + 1;
            elevator.processRequest(currentFloor, destinationFloor);
        }
    }
}
