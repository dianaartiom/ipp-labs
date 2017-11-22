package abstractfactory;

import abstractfactory.factory.PhoneFactory;
import abstractfactory.factory.TabletFactory;
import abstractfactory.interfaces.AbstractGadget;

public class GadgetFactory {
    public static AbstractGadget getFactory(String gadgetType) {
        if(gadgetType.equals("tablet")) {
            return new TabletFactory();
        }
        if (gadgetType.equals("phone")) {
            return new PhoneFactory();
        }
        return null;
    }
}