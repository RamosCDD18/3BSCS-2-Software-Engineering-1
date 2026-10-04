public class AirConditioning implements HomeService {
    @Override
    public void turnOn() {
        System.out.println("Air Conditioning is ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Air Conditioning is OFF.");
    }
}
