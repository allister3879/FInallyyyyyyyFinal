import java.util.ArrayList;
import java.util.List;

class NotificationManager implements AppointmentObserver {
    private static NotificationManager instance;
    private List<AppointmentObserver> observers;

    private NotificationManager() {
        observers = new ArrayList<>();
    }

    public static synchronized NotificationManager getInstance() {
        if (instance == null) {
            instance = new NotificationManager();
        }
        return instance;
    }

    public void addObserver(AppointmentObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(AppointmentObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (AppointmentObserver observer : observers) {
            observer.update(message);
        }
    }

    @Override
    public void update(String message) {
        System.out.println("Notification: " + message);
    }
}
