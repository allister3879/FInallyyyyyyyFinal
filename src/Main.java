import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User information
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();
        System.out.print("Enter your phone number: ");
        String userPhone = scanner.nextLine();

        // Appointment date
        System.out.print("Enter appointment date (dd.mm): ");
        String date = scanner.nextLine();

        // Retrieve available masters and times (you need to implement this logic)
        System.out.println("Available Masters: Alua, Polina");
        // ... Show available masters

        System.out.print("Choose a master: ");
        String selectedMaster = scanner.nextLine();

        System.out.println("Available Times for " + selectedMaster + " on " + date + " - 12:00, 15:00, 17:00");
        // ... Show available times for the selected master

        System.out.print("Choose a time: ");
        String selectedTime = scanner.nextLine();

        // Payment method using Factory Pattern
        System.out.println("Choose payment method:");
        System.out.println("1. Credit Card");
        System.out.println("2. Cash");
        int paymentChoice = scanner.nextInt();
        PaymentStrategy paymentStrategy = PaymentStrategyFactory.createPaymentStrategy(paymentChoice, "1234");

        // Decorator pattern for nail appointment
        System.out.println("Do you want to add design to your nails?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int nailChoice = scanner.nextInt();
        NailMaster nailMaster;
        if (nailChoice == 2) {
            nailMaster = new RegularNailMaster();
        } else {
            // Decorate with GelNailDecorator
            nailMaster = new GelNailDecorator(new RegularNailMaster());
        }

        // Book appointment
        nailMaster.bookAppointment(date, selectedTime);

        // Payment
        paymentStrategy.pay( 100);

        // Observer Pattern for notification
        NotificationManager notificationManager = NotificationManager.getInstance();
        notificationManager.addObserver(NotificationManager.getInstance());

        // Notify user
        notificationManager.notifyObservers("Your appointment is scheduled for " + date + " at " + selectedTime);

        // Command Pattern for thanking the user
        AppointmentCommand thankYouCommand = new ThankYouCommand(userName);
        thankYouCommand.execute();
    }
}