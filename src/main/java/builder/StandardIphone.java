package builder;

public class StandardIphone extends PhoneAbstractBuilder {

    public void buildSetModel(String model) {
        this.applePhone.setModel("X");
    }

    public void buildSetColor(String color) {
        this.applePhone.setColor(color);
    }
}
