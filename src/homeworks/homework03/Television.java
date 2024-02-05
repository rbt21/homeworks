package homeworks.homework03;

public class Television {
    private String model;
    private int screenSize;
    private boolean isSmart;

    public Television(String model, int screenSize, boolean isSmart) {
        this.model = model;
        this.screenSize = screenSize;
        this.isSmart = isSmart;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getScreenSize() {
        return screenSize;
    }
    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }
    public boolean isSmart() {
        return isSmart;
    }
    public void setSmart(boolean Smart) {
        this.isSmart = Smart;
    }
    public String toString() {
        return "Телевизор {" +
                "Модель = '" + model + '\'' +
                ", размер экрана = " + screenSize +
                ", умный = " + isSmart +
                '}';
    }
}
