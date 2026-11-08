package newsSubscription;

public interface NewsSubject {
    public void attach(SubscriberObserver subscriber);
    public void detach(SubscriberObserver subscriber);
    public void notifySubscribers(String category, String headline);
}
