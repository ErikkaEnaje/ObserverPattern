package ObservePattern;
import java.util.*;

public class subscribers implements subscriber {
    private String name;
    private List<String> preferencesList = new ArrayList<>();
    public subscribers(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public void update(String news) {
        System.out.println("\t" + name + " received breaking news: " + news);
    }

    public void modifyPreferenceses(List<String> updatePreference) {
        preferencesList = updatePreference;
        System.out.println("\t" + name + "'s preference updated to: " + preferencesList);
    }
}

