package ca.dal.cs.csci3130.a3.q4;

public class Customer {

    private String firstName;
    private String lastName;
    private int areaCode;
    private int loyaltyCardNumber;
    private int points;


    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public void setLoyaltyCard(int areaCode, int cardNumber, int points) {
        this.areaCode = areaCode;
        this.loyaltyCardNumber = cardNumber;
        this.points = points;
    }

    public String getFullCardNumber() {
        String formattedNumber = new String();
        formattedNumber = this.areaCode + "-" + this.loyaltyCardNumber;
        return formattedNumber;
    }

    public int getLoyaltyPoints() {
        return this.points;
    }
}
