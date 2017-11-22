package abstractfactory.phones;

import abstractfactory.interfaces.IPhone;

public class ApplePhone implements IPhone {

    private String model;
    private String color;

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMemory(Integer memory) {
        return;
    }

    public Integer getMemory() {
        return 42;
    }

    public void setRam(Integer ram) {

    }

    public Integer getRam() {
        return 42;
    }

    public void setWeight() {

    }

    public Integer getWeight() {
        return 42;
    }
}