package ObserverPattern;

import java.util.List;

public interface IObserver {
    public void update(String eventType, List<String> post);

}
