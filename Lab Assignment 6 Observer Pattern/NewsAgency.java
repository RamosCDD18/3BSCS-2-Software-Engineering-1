package newsSubscription;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class NewsAgency implements NewsSubject {

    private String agencyName;

    private List<SubscriberObserver> subscriberList = new CopyOnWriteArrayList<>();

    public NewsAgency(String agencyName) {
        this.agencyName = agencyName;
    }

    public String getAgencyName() {
        return agencyName;
    }

    @Override
    public void attach(SubscriberObserver subscriber) {
        if (!subscriberList.contains(subscriber))
            subscriberList.add(subscriber);
    }

    @Override
    public void detach(SubscriberObserver subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override
    public void notifySubscribers(String category, String headline) {
        for (SubscriberObserver subscriber : subscriberList) {
            try {
                subscriber.update(category, headline);
            } catch (Exception e) {
                System.out.println("Could not deliver news to one subscriber: " + e.getMessage());
            }
        }
    }

    public void publishNews(String category, String headline) {
        System.out.println("\n" + agencyName + " BREAKING NEWS [" + category + "]: " + headline);
        notifySubscribers(category, headline);
    }

    public int getSubscriberCount() {
        return subscriberList.size();
    }
}
