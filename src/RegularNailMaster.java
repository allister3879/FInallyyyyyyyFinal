class RegularNailMaster implements NailMaster {
    @Override
    public void bookAppointment(String date, String time) {
        System.out.println("Booked regular nail appointment on " + date + " at " + time);
    }
}
