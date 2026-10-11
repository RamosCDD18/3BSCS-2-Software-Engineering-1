public class Valet implements HotelService {
    public void pickUpVehicle(String plateNumber) {
        System.out.println("Valet: Vehicle with plate number " + plateNumber + " is being brought up.");
    }
}
