package ca.dal.cs.csci3130.a3.q4;

public class Customer {

    private String firstName;
    private String lastName;
    private LoyaltyCard loyaltyCard;


    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setLoyaltyCard(int areaCode, int cardNumber, int points){
        loyaltyCard = new LoyaltyCard(areaCode, cardNumber, points);
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public String getFullCardNumber() {
        String formattedNumber = new String();
        formattedNumber = loyaltyCard.getAreaCode() + "-" + loyaltyCard.getLoyaltyCardNumber();
        return formattedNumber;
    }

    public int getLoyaltyPoints() {
        return loyaltyCard.getPoints();
    }
}
