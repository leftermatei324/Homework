package Homework6.FoodOrderingSystem;

public abstract class FoodItem {
    private String name;
    private double price;

    public FoodItem(String name, double price){
        this.name  = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "FoodItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public abstract double calculatePrice();

    public void displayInfo(){
        System.out.println("Your food: " + name + " has a price of: " + price);
    }

    // aici m am inspirat, nu eram sigur daca in problmea ni se cere sau nu interafata dar am incercat sa respect!!!!
    public void displayInfo(boolean discounted) {
        double finalPrice = calculatePrice();
        if (discounted && this instanceof Discountable){
            Discountable d = (Discountable) this;
            finalPrice = d.applyDiscount();
        }

        System.out.println("Food: " + name + " | Price: " + finalPrice);

    }
}
