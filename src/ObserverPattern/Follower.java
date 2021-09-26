package ObserverPattern;

import java.util.List;

import static ObserverPattern.IGAccount.POST;
import static ObserverPattern.IGAccount.VIDEO;

public class Follower implements IObserver {
    String name;

    public Follower(String name){
        this.name = name;
    }

    @Override
    public void update(String eventType, List<String> post) {
        if(eventType == POST){
            System.out.println("Dear " + name + "\nToday we have new posts:\n"+post+"\n=======================\n");
        }else if(eventType == VIDEO){
            System.out.println("Dear " + name + "\nToday we have new videos:\n"+post+"\n=======================\n");
        }
    }
}
