package Homework3;

public class Motorcycle extends Vehicle{
    private boolean hasSideCar;

    public boolean isHasSideCar() {
        return hasSideCar;
    }

    public void setHasSideCar(boolean hasSideCar) {
        this.hasSideCar = hasSideCar;
    }

    public Motorcycle(){}

    public Motorcycle(String brand, boolean hasSideCar, int year){
        super(brand,year);
        setHasSideCar(hasSideCar);
    }

    @Override
    public void displayinfo() {
            System.out.println("Motorcycle: " + getBrand() + " (" + getYear() + "), Sidecar: " );
            ///????????????/ here we need to do a verification but i dont know how
    }
}
