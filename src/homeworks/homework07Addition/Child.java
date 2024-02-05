package homeworks.homework07Addition;

public class Child extends Person {
    public Child(String name, double money, int age, Product[] cart) {
        super(name, money, age, cart);
        if (age < 0 || age > 17) {
            throw new IllegalArgumentException("Недопустимый возраст для ребенка");
        }
    }


    public void purchaseProducts() {
        if (age < 6) {
            System.out.println(name + " не может покупать товары");
            return;
        }
    }
}