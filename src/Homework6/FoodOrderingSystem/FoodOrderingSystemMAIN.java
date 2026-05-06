package Homework6.FoodOrderingSystem;

public class FoodOrderingSystemMAIN {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("Pizza" , 40, 4, 3);
        Burger burger = new Burger("Burger", 53);

        System.out.println("Normal prices");
        pizza.displayInfo(false);
        burger.displayInfo(false);

        System.out.println("Discounted");
        pizza.displayInfo(true);
        burger.displayInfo(true);

    }
}
