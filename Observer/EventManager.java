package Observer;

import java.util.ArrayList;
import java.util.List;

public class EventManager {
    List<EventListener> workers = new ArrayList<>();

    public void hire(EventListener worker) {
        workers.add(worker);
        System.out.println("We have a new member!");
    }

    public void fire(EventListener worker) {
        workers.remove(worker);
        System.out.println("Worker has been fired");
    }

    public void notify(String actionType) {
        for (EventListener worker : workers) {
            worker.action(actionType);
        }
    }
}
