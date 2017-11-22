package builder;

import abstractfactory.interfaces.IGadget;
import abstractfactory.phones.ApplePhone;

public abstract class PhoneAbstractBuilder {
    protected ApplePhone applePhone;

    public ApplePhone getApplePhone() {
        return this.applePhone;
    }

    public void setApplePhone(IGadget applePhone) {
        this.applePhone = (ApplePhone) applePhone;
    }

    public abstract void buildSetModel(String model);
    public abstract void buildSetColor(String color);
}
