package ge.guka.springbootdemo.cars.model;

public class Engine {

    private int hoursePower;
    private double capacity;

    public  Engine(int hoursePower, double capacity){
        this.hoursePower = hoursePower;
        this.capacity = capacity;
    }

    public int getHorsePower(){
        return hoursePower;
    }

    public double getCapacity(){
        return capacity;
    }

    public void printInfo(){
        System.out.println("Engine HP: " + hoursePower);
        System.out.println("Engine Capacity: " + capacity);
    }
}
