package Observer;

public class Notification2 implements EventListener {
    @Override
    public void action(String actionType) {
        System.out.println("Worker 2 reacts");
    }
}
