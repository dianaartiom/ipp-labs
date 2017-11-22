package builder;

import abstractfactory.phones.ApplePhone;

public class Director {
    PhoneAbstractBuilder phoneAbstractBuilder;

    public void setConstructor(PhoneAbstractBuilder phoneAbstractBuilder) {
        this.phoneAbstractBuilder = phoneAbstractBuilder;
    }

    public ApplePhone getApplePhone() {
        return phoneAbstractBuilder.getApplePhone();
    }

    public void buildApplePhone(String color, String moderl) {
        this.phoneAbstractBuilder.buildSetColor(color);
        this.phoneAbstractBuilder.buildSetModel(moderl);
    }
}
