package abstractfactory.factory;

import abstractfactory.interfaces.AbstractGadget;
import abstractfactory.interfaces.IGadget;
import abstractfactory.tablets.ApplePad;
import abstractfactory.tablets.HuaweiTablet;

public class TabletFactory implements AbstractGadget {
    public IGadget getTablet(String tabletType) {
        if (tabletType.equals("huawei")) return new HuaweiTablet();
        if (tabletType.equals("iPad")) return new ApplePad();
        return null;
    }

    public IGadget getPhone(String phoneType) {
        return null;
    }
}
