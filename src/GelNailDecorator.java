class GelNailDecorator implements NailMaster {
    private NailMaster nailMaster;

    GelNailDecorator(NailMaster nailMaster) {
        this.nailMaster = nailMaster;
    }

    @Override
    public void bookAppointment(String date, String time) {
        nailMaster.bookAppointment(date, time);
        System.out.println("Added gel design to the appointment");
    }
}
