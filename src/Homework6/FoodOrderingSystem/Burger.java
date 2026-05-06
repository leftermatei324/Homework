package Homework6.FoodOrderingSystem;

public class Burger extends FoodItem{
    public Burger(String name, double price){
        super(name, price);
    }

    @Override
    public double calculatePrice() {
        return getPrice();
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
    }
}
