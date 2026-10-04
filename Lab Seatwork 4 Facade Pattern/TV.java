public class TV implements HomeService {
    @Override
    public void turnOn() {
        System.out.println("TV is ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is OFF.");
    }
}
