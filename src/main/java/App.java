import abstractfactory.GadgetFactory;
import abstractfactory.interfaces.AbstractGadget;
import abstractfactory.phones.ApplePhone;
import builder.Director;
import builder.PhoneAbstractBuilder;
import builder.StandardIphone;

public class App {
    public static void main(String[] args) {

        /* Abstract Factory*/
        AbstractGadget abstractGadget = GadgetFactory.getFactory("phone");
        System.out.println(abstractGadget.getClass().toString());

        /* Builder*/
        Director director = new Director();
        PhoneAbstractBuilder builder = new StandardIphone();
        builder.setApplePhone(new ApplePhone());
        director.setConstructor(builder);
        director.buildApplePhone("red", "X");

        ApplePhone applePhone = director.getApplePhone();
        System.out.println(applePhone);
    }



}
