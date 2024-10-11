package ar.edu.ubp.das.appref;

public class PhoneNumber {
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public PhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void updatePhoneNumber(String newPhoneNumber) {
        this.phoneNumber = newPhoneNumber;
    }
}
