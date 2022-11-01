package Observer;

public class Notification1 implements EventListener{
    @Override
    public void action(String actionType) {
        System.out.println("Worker 1 reacts");
    }
}
