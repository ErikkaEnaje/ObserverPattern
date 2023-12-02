package ObservePattern;
import java.util.*;
public class NewsAgency implements NewsAgencySubject {
    private List<ObservePattern.subscribers> subscribers = new ArrayList<>();

    // to find out if the user is a subscriber already.
    @Override
    public void subscribe(ObservePattern.subscribers sub) {
        if (!subscriberChecker(sub.getName())) {
            subscribers.add(sub);
        } else {
            System.out.println(sub.getName() + " has already subscribed.");
        }
    }
    @Override
    public void unsubscribe(ObservePattern.subscribers subscriber) {
        subscribers.remove(subscriber);
    }
    @Override
    public void notifySubscribers(String news) {
        for (ObservePattern.subscribers subscriber : subscribers) {
            subscriber.update(news);
        }
    }
    private boolean subscriberChecker(String name) { // checker of subscriber's name.
        for (ObservePattern.subscribers subscriber : subscribers) {
            if (subscriber.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }
    @Override
    public void newsUpdate(String latestNews) {
        System.out.println("Breaking Latest News! in " + latestNews + " ");
        notifySubscribers(latestNews);
    }

}

