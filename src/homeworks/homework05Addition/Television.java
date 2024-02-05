package homeworks.homework05Addition;

import java.util.Objects;

public class Television {
    private String model;
    private int screenSize;
    private boolean isSmart;
    private int channelNumber;
    private int volume;
    private boolean isOn;
    public Television(String model, int screenSize, boolean isSmart, int channelNumber, int volume, boolean isOn) {
        this.model = model;
        this.screenSize = screenSize;
        this.isSmart = isSmart;
        this.channelNumber = channelNumber;
        this.volume = volume;
        this.isOn = isOn;
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

    public void setSmart(boolean smart) {
        isSmart = smart;
    }

    public int getChannelNumber() {
        return channelNumber;
    }

    public void setChannelNumber(int channelNumber) {
        this.channelNumber = channelNumber;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }
      public String toString() {
        return "Телевизор {" +
                "модель = '" + model + '\'' +
                ", размер экрана = " + screenSize +
                ", умный = " + isSmart +
                ", номер канала = " + channelNumber +
                ", громкость = " + volume +
                ", включен = " + isOn +
                '}';
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Television телевизор = (Television) o;
        return screenSize == телевизор.screenSize &&
                isSmart == телевизор.isSmart &&
                channelNumber == телевизор.channelNumber &&
                volume == телевизор.volume &&
                isOn == телевизор.isOn &&
                Objects.equals(model, телевизор.model);
    }
       public int hashCode() {
        return Objects.hash(model, screenSize, isSmart, channelNumber, volume, isOn);
    }
}
