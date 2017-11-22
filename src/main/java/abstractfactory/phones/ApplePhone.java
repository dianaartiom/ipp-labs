package abstractfactory.phones;

import abstractfactory.interfaces.IPhone;

public class ApplePhone implements IPhone {

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