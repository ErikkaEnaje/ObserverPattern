package ObservePattern;
import java.util.*;

public interface SubscriberObserve {
    void update(String news);
    void modifyPreference(List<String> preferences);

}
