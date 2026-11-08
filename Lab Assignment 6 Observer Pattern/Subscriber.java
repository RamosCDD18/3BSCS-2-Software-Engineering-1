package newsSubscription;

import java.util.HashSet;
import java.util.Set;

public class Subscriber implements SubscriberObserver {

    private String subscriberName;

    private Set<String> preferences = new HashSet<>();

    public Subscriber(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    public String getSubscriberName() {
        return subscriberName;
    }

    public void addPreference(String category) {
        preferences.add(category);
    }

    public void removePreference(String category) {
        preferences.remove(category);
    }

    public void clearPreferences() {
        preferences.clear();
    }

    @Override
    public void update(String category, String headline) {
        if (!preferences.isEmpty() && !preferences.contains(category))
            return;

        System.out.println("  Hey, " + subscriberName + "! [" + category + "] " + headline);
    }
}
