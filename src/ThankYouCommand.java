class ThankYouCommand implements AppointmentCommand {
    private String userName;

    ThankYouCommand(String userName) {
        this.userName = userName;
    }

    @Override
    public void execute() {
        System.out.println("Thank you, " + userName + "! Your appointment is confirmed.");
    }
}
