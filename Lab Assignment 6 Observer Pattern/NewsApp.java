package newsSubscription;

public class NewsApp {
    public static void main(String[] args) {

        NewsAgency agency = new NewsAgency("PH News Network");

        Subscriber maria = new Subscriber("Maria");
        Subscriber juan = new Subscriber("Juan");
        Subscriber oliver = new Subscriber("Oliver");

        agency.attach(maria);
        agency.attach(juan);
        agency.attach(oliver);

        agency.publishNews("Weather", "Typhoon signal no. 2 raised over Luzon.");

        agency.detach(juan);

        Subscriber jerry = new Subscriber("Jerry");
        agency.attach(jerry);

        agency.publishNews("Politics", "Senate approves new education bill.");

        oliver.addPreference("Sports");

        maria.addPreference("Weather");
        maria.addPreference("Sports");

        agency.publishNews("Sports", "Gilas wins the finals!");
        agency.publishNews("Politics", "Budget hearing starts next week.");

        System.out.println("\nTotal subscribers now: " + agency.getSubscriberCount());
    }
}
