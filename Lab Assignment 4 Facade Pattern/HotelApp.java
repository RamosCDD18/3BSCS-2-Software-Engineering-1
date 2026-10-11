public class HotelApp {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();

        System.out.println("Guest check-in:");
        frontDesk.requestRoomCleaning(204);
        frontDesk.requestLuggageCarts(2);

        System.out.println();

        System.out.println("Guest check-out:");
        frontDesk.requestVehicle("ABC-1234");
    }
}
