public class Main {
    public static void main(String[] args) {
        Electronics electronics = new Electronics();
        Clothing clothing = new Clothing();
        Food food = new Food();
        electronics.price = 90;
        clothing.price = 90;
        food.price = 90;
        System.out.println("electronics: " + electronics.getFinalPrice());
        System.out.println("closing: " + clothing.getFinalPrice());
        System.out.println("food: " + food.getFinalPrice());
    }
}

interface Product {
    double getFinalPrice();
}

class Price{
    public double price;
    public double price(double price) {
        this.price = price;
        return price;
    }
}

class Electronics extends Price implements Product {
    public double price(double price) {
        return super.price(price);
    }
    public double getFinalPrice() {
        return price - (price * 0.1);
    }
}

class Clothing extends Price implements Product {
    public double price(double price) {
        return super.price(price);
    }
    public double getFinalPrice() {
        return price - (price * 0.15);
    }
}

class Food extends Price implements Product {
    public double price(double price) {
        return super.price(price);
    }
    public double getFinalPrice() {
        return price;
    }
}