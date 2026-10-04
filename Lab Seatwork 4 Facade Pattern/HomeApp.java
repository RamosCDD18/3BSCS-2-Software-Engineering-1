public class HomeApp {
    public static void main(String[] args) {
        HomeInterface homeInterface = new HomeInterface();

        System.out.println("Turning everything on:");
        homeInterface.turnOnAll();

        System.out.println();

        System.out.println("Turning everything off:");
        homeInterface.turnOffAll();
    }
}
