package exc10Discount;

public class Client {
    private String firstName;
    private String lastName;
    private boolean isPremium;

    public Client(String fisrstName, String lastName, boolean isPremium) {
        this.firstName = fisrstName;
        this.lastName = lastName;
        this.isPremium = isPremium;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean premium) {
        isPremium = premium;
    }
}
