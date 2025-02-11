public class Main {
    public static void main(String[] args) {
        Product electronics = new Electronics();
        Clothing clothing = new Clothing();
        Food food = new Food();

       System.out.println("electronics: " + electronics.getFinalPrice(90));
       System.out.println("closing: " + clothing.getFinalPrice(90));
       System.out.println("food: " + food.getFinalPrice(90));
    }
}

interface Product {
    double getFinalPrice(double price);
}

class Electronics implements Product {
    public double getFinalPrice(double price) {
        return price - (price * 0.1);
    }
}

class Clothing implements Product {
    public double getFinalPrice(double price) {
        return price - (price * 0.15);
    }
}

class Food implements Product {
    public double getFinalPrice(double price) {
        return price;
    }
}