package Observer;

public class Main {
    public static void main(String[] args) {
        Staff staff = new Staff();
        Notification1 worker1 = new Notification1();
        Notification2 worker2 = new Notification2();
        Notification3 worker3 = new Notification3();
        staff.manager.hire(worker1);
        staff.manager.hire(worker2);
        staff.manager.hire(worker3);
        staff.triggerEvent();
        staff.manager.fire(worker1);
        staff.manager.fire(worker3);
        staff.triggerEvent();
    }
}
