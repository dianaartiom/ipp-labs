package abstractfactory.interfaces;

public interface AbstractGadget {
    public abstract IGadget getTablet(String tabletType);
    public abstract IGadget getPhone(String phoneType);
}