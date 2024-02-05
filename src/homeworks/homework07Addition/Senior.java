package homeworks.homework07Addition;

public class Senior extends Person {
    private final double discount = 0.05;

    public Senior(String name, double money, int age, Product[] cart) {
        super(name, money, age, cart);
        if (age < 65) {
            throw new IllegalArgumentException("Недопустимый возраст для пенсионера");
        }
    }

    public void purchaseProducts() {
        for (Product product : cart) {
            if (product instanceof DiscountProduct) {
                double discountedPrice = product.getPrice() * (1 - discount);
                if (money >= discountedPrice) {
                    System.out.println(name + " купил " + product.getName() + " по цене со скидкой: " + discountedPrice);
                    money -= discountedPrice;
                }
            }
        }
    }
}
