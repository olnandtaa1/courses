package Observer;

public class Staff {
    public EventManager manager;

    public Staff() {
        this.manager = new EventManager();
    }

    public void triggerEvent() {
        System.out.println("Event is triggered");
        manager.notify("Success");


    }
}
