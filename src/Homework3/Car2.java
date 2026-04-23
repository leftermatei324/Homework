package Homework3;

public class Car2 extends Vehicle{
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Car2(){}

    public Car2(String brand, String model, int year){
        super(brand,year);
        setModel(model);
    }

    @Override
    public void displayinfo() {
        System.out.println("Car: " + getBrand() + " " + getModel() + " (" + getYear() + ")");
    }
}
