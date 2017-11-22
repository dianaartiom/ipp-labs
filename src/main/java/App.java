import abstractfactory.GadgetFactory;
import abstractfactory.interfaces.AbstractGadget;

public class App {
    public static void main(String[] args) {

        /* Abstract Factory*/
        AbstractGadget abstractGadget = GadgetFactory.getFactory("phone");
        System.out.println(abstractGadget.getClass().toString());
    }
}
