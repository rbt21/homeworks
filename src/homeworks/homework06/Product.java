package homeworks.homework06;

public class Product {
        private String name;
        private double price;
        private boolean isAvailableForChildren;

        public Product(String name, double price, boolean isAvailableForChildren) {
            if (name == null || name.trim().isEmpty() || name.matches("\\d+")) {
                throw new IllegalArgumentException("Недопустимое название продукта");
            }
            if (price <= 0) {
                throw new IllegalArgumentException("Недопустимая стоимость продукта");
            }
            this.name = name;
            this.price = price;
            this.isAvailableForChildren = isAvailableForChildren;
        }


        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public boolean isAvailableForChildren() {
            return isAvailableForChildren;
        }


        public void setName(String name) {
            if (name == null || name.trim().isEmpty() || name.matches("\\d+")) {
                throw new IllegalArgumentException("Недопустимое название продукта");
            }
            this.name = name;
        }

        public void setPrice(double price) {
            if (price <= 0) {
                throw new IllegalArgumentException("Недопустимая стоимость продукта");
            }
            this.price = price;
        }

        public String toString() {
            return "Продукт: " + name + ", Цена: " + price + " руб., Доступно для детей: " + isAvailableForChildren;
        }


        public void setAvailableForChildren(boolean availableForChildren) {
            isAvailableForChildren = availableForChildren;
        }
    }
