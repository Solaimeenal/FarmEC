package com.swarnamythili.farmec;
public class DonarInfo {

    // variables for storing our data.
    private String donarName, donarAddress, donarMobileno,donationAmount;

    public DonarInfo() {
        // empty constructor
        // required for Firebase.
    }

    // Constructor for all variables.
    public DonarInfo(String donarName, String donarAddress, String donarMobileno,String donationAmount) {
        this.donarName = donarName;
        this.donarAddress = donarAddress;
        this.donarMobileno = donarMobileno;
        this.donationAmount = donationAmount;
    }

    // getter methods for all variables.
    public String getdonarName() {
        return donarName;
    }

    public void setdonarName(String donarName) {
        this.donarName = donarName;
    }

    public String getdonarAddress() {
        return donarAddress;
    }

    // setter method for all variables.
    public void setdonarAddress(String donarAddress) {
        this.donarAddress = donarAddress;
    }

    public String getdonarMobileno() {
        return donarMobileno;
    }

    public void setdonarMobileno(String donarMobileno) {
        this.donarMobileno = donarMobileno;
    }
    public String getdonationAmount() {
        return donationAmount;
    }

    public void setdonationAmount(String donationAmount) {
        this.donationAmount = donationAmount;
    }
}
