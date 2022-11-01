package Observer;

public class Notification3 implements EventListener{
    @Override
    public void action(String actionType) {
        System.out.println("Worker 3 reacts");
    }
}
