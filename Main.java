import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Laptop myLaptop = new Laptop();
        Refrigerator myFridge = new Refrigerator();
        SmartphoneCharger myPhoneCharger = new SmartphoneCharger();

        List<PowerOutlet> outlets = new ArrayList<>();
        outlets.add(new LaptopAdapter(myLaptop));
        outlets.add(new RefrigeratorAdapter(myFridge));
        outlets.add(new SmartphoneAdapter(myPhoneCharger));

        System.out.println("--- Plugging devices into standard power outlets ---");
        for (PowerOutlet outlet : outlets) {
            outlet.plugIn();
        }
    }
}