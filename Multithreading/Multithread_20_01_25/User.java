package Multithread_20_01_25;

class User {
    private String name;
    private VaccineEligibility eligibility;
    private DoseBooking doseBooking;

    public User(String name, int age, boolean hasHealthCondition) {
        this.name = name;
        this.eligibility = new VaccineEligibility(age, hasHealthCondition);
        this.doseBooking = new DoseBooking();
    }

    public boolean isEligible() {
        return eligibility.isEligible();
    }

    public void bookDose() {
        if (!isEligible()) {
            throw new RuntimeException("You are not eligible for the vaccine.");
        }
        doseBooking.bookDose();
    }

    public boolean isDoseBooked() {
        return doseBooking.isDoseBooked();
    }

    public String getName() {
        return name;
    }
}
