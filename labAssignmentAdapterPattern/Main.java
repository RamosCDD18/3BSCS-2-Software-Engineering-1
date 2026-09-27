import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<PowerOutlet> devices = new ArrayList<>();

        devices.add(new LaptopAdapter(new Laptop()));
        devices.add(new RefrigeratorAdapter(new Refrigerator()));
        devices.add(new SmartphoneAdapter(new SmartphoneCharger()));

        for (PowerOutlet device : devices) {
            device.plugIn();
        }
    }
}
