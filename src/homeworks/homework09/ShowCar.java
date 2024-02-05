package homeworks.homework09;

public class ShowCar extends Car {
    private int stars;

    // Конструктор без параметров
    public ShowCar() {
        super();
        this.stars = 0;
    }

    // Конструктор с параметрами
    public ShowCar(String brand, String model, int year, int horsepower, int acceleration, int suspension, int durability, int stars) {
        super(brand, model, year, horsepower, acceleration, suspension, durability);
        this.stars = stars;
    }

    // Геттер и сеттер для stars
    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    // Переопределение метода toString()
    @Override
    public String toString() {
        return "ShowCar{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", year=" + getYear() +
                ", horsepower=" + getHorsepower() +
                ", acceleration=" + getAcceleration() +
                ", suspension=" + getSuspension() +
                ", durability=" + getDurability() +
                ", stars=" + stars +
                '}';
    }

    // Переопределение методов equals() и hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ShowCar)) return false;
        if (!super.equals(o)) return false;
        ShowCar showCar = (ShowCar) o;
        return stars == showCar.stars;
    }

    @Override
    public int hashCode() {
        return 31 * super.hashCode() + stars;
    }
}
