package Homework3;

public class Car {
    String brand;
    String mode1;
    int year;

    public Car(String brand, String mode1, int year){
        this.brand = brand;
        this.mode1 = mode1;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMode1() {
        return mode1;
    }

    public void setMode1(String mode1) {
        this.mode1 = mode1;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", mode1='" + mode1 + '\'' +
                ", year=" + year +
                '}';
    }

    public void displayinfo(){
        System.out.println("Car: " + brand + mode1 + "(" + year + ")");
    }
    public static void main(String[] args) {
        Car car1 = new Car("Mercedes ", "GLC ", 2018);
        Car car2 = new Car("Audi ", "Q5 ", 2013);

        car1.displayinfo();
        car1.displayinfo();
    }

}


