package ge.guka.springbootdemo.cars.model;

public class Car {

    private String model;
    private int year;
    private boolean driveable;
    private Engine engine;

    public Car(String model, int year, boolean driveable, Engine engine) {
        this.model = model;
        this.year = year;
        this.driveable = driveable;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public boolean isDriveable() {
        return driveable;
    }

    public Engine getEngine(){
        return engine;
    }

    public void printDetails() {
        System.out.println("Car model: " + model);
        System.out.println("Engine info: ");
        engine.printInfo();
    }
}
