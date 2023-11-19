# Final Project

Name of your final project: Nail Salon Appointment System
Group: SE-2217
Team members: Dariga Sekerbek, Diana Narynbekova

Comprehensive Project Documentation: Nail Salon Appointment System

## Introduction
The Nail Salon Appointment System is a Java application designed to streamline the process of booking nail appointments. An exhaustive summary of the features and design patterns included in the code will be given in this documentation.

## Design Patterns
   
2.1 Observer Pattern
The NotificationManager class makes use of the Observation Pattern. Several observers (AppointmentObservers) can listen for changes in the appointment status thanks to this design. The observers are informed when a planned appointment is made, and a notification is produced.

2.2 Command Pattern
The ThankYouCommand class and the AppointmentCommand interface are used to implement the Command Pattern. This pattern allows parameterized execution by encapsulating a command (thanking the user) in an object. A ThankYouCommand is produced and run in the main program, offering a tidy and expandable method for further commands.

2.3 Decorator Pattern
The GelNailDecorator class makes use of the Decorator Pattern to improve the functionality of the NailMaster interface. This design makes it possible to add elements to nail sessions in a dynamic and adaptable way. In this instance, if the user desires, the GelNailDecorator may incorporate gel nail art into a routine nail treatment.

2.4 Factory Pattern
The PaymentStrategyFactory class uses the Factory Pattern to generate PaymentStrategy interface objects depending on user input. In order to provide a centralized method (createPaymentStrategy) for establishing payment strategies, this design encapsulates the instantiation process. It makes code more maintainable and makes adding new payment methods simple.

2.5 Strategy Pattern
The CreditCardPayment class, which implements the PaymentStrategy interface, clearly demonstrates the Strategy Pattern. This design contains all algorithms, defines a family of algorithms, and establishes their interchangeability. In this instance, the user may simply choose between different payment methods (cash and credit card) during runtime.

2.6 Singleton Pattern
The NotificationManager class uses the Singleton Pattern. This design style makes sure the NotificationManager is only used once throughout the whole program. The getInstance() function facilitates centralized appointment notification handling by offering a globally accessible point to acquire the class's single instance.

## Code components

3.1 Interfaces
• AppointmentCommand: Defines the execute() method for executing appointment-related commands.
• AppointmentObserver: Specifies the update(String message) method for notifying observers about appointment changes.
• NailMaster: Describes the interface for booking nail appointments.

3.2 Classes
• CashPayment and CreditCardPayment: Use the PaymentStrategy interface for payments made with cash and credit cards, respectively. A credit card number is included with the payment as a means of identification.
• GelNailDecorator: Participates in regular nail appointments by incorporating gel nail design as a decorator for NailMaster.
• NotificationManager: Oversees observers, applies the AppointmentObserver interface, and alerts observers to modifications in appointments.
• PaymentStrategyFactory: Based on user input, this application uses the Factory Pattern to generate instances of the PaymentStrategy interface.
• RegularNailMaster: This application uses the NailMaster interface to schedule routine nail visits.
• ThankYouCommand: Expresses gratitude to the user by implementing the AppointmentCommand interface. The user's name is one of the customization parameters.

3.3 Main Class (Main)
The Main class serves as the entry point for the application, orchestrating the user input, appointment booking process, payment, and notifications. It demonstrates the integration of various design patterns to create a cohesive and extensible system.

## Usage
4.1 User Input
The application prompts users to input their name, phone number, appointment date, and choose a nail master and time slot. Users also select payment methods and additional nail services.
4.2 Booking Process
The booking process involves creating a NailMaster instance (potentially decorated with additional services), making a payment using the selected payment strategy, notifying observers about the appointment, and executing a thank-you command.

## Conclusion
The Nail Salon Appointment System demonstrates the effective use of design patterns to enhance modularity, flexibility, and maintainability. The structured implementation allows for easy extension with new features and patterns in the future. The clean separation of concerns and encapsulation of functionalities contribute to the readability and scalability of the code
