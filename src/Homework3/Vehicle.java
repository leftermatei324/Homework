package Homework3;

public class Vehicle {
    private String brand;
    private int year;

    //constructorii primii mereu
    public Vehicle() {
    }

    public Vehicle(String brand, int year){
        setBrand(brand);
        setYear(year);
    }

    //getteri-setteri dupa faza 2
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1886){
            this.year = year;
        }else {
            System.out.println("Invalid year! Setting default to 2000.");
        }
    }

    public void displayinfo(){
        System.out.println("Car: " + brand + "(" + year + ")");
    }

    public static void main(String[] args) {
        Car2 car = new Car2();
        car.setBrand("Mercedes");
        car.setModel("GLC");
        car.setYear(2018);


        Motorcycle motorcycle = new Motorcycle();
        motorcycle.setBrand("Yamaha");
        motorcycle.setHasSideCar(false);
        motorcycle.setYear(1700);

        car.displayinfo();
        motorcycle.displayinfo();
    }
}
