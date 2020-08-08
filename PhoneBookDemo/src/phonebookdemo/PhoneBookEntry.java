package phonebookdemo;

public class PhoneBookEntry {

    private String name;
    private String phoneNumber;

    /* Parameter Constructor */
    public PhoneBookEntry(String n, String pn) {
        this.name = n;
        this.phoneNumber = pn;
    }

    /* Setters */
    public void setName(String n) {
        this.name = n;
    }

    public void setPhoneNumber(String pn) {
        this.phoneNumber = pn;
    }

    /* Getters */
    public String getName() {
        return this.name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }
}
