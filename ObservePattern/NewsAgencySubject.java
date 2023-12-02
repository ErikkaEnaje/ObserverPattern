package ObservePattern;

public interface NewsAgencySubject {
    void subscribe(subscribers subscriber);
    void unsubscribe(subscribers subscriber);
    void notifySubscribers(String news);

    void newsUpdate(String latestNews);
}
