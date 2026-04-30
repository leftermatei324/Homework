package Homework6.SchoolManagementSystem.FoodOrderingSystem;

public class Pizza extends FoodItem implements Discountable{
    int toppings;
    double toppingPrice;

    public Pizza(String name, double price, int toppings, double toppingPrice){
        super(name, price);
        this.toppings = toppings;
        this.toppingPrice = toppingPrice;
    }

    public double calculatePrice(){
        return getPrice() + toppings * toppingPrice;
    }


    @Override
    public double applyDiscount() {
        double total = calculatePrice();
        return total * 0.9;
    }
}
