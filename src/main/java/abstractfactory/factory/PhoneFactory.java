package abstractfactory.factory;

import abstractfactory.interfaces.AbstractGadget;
import abstractfactory.interfaces.IGadget;
import abstractfactory.phones.ApplePhone;
import abstractfactory.phones.SamsungPhone;

public class PhoneFactory implements AbstractGadget {
    public IGadget getTablet(String tabletType) {
        return null;
    }

    public IGadget getPhone(String phoneType) {
        if (phoneType.equals("iPhone")) return new ApplePhone();
        if (phoneType.equals("samsung")) return new SamsungPhone();
        return null;
    }
}
