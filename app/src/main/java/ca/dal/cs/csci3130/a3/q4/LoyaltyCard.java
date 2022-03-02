package ca.dal.cs.csci3130.a3.q4;

public class LoyaltyCard {
    private int areaCode;
    private int loyaltyCardNumber;
    private int points;

    LoyaltyCard(int areaCode, int cardNumber, int points){
        this.areaCode = areaCode;
        this.loyaltyCardNumber = cardNumber;
        this.points = points;
    }

    public int getAreaCode() {
        return areaCode;
    }

    public int getLoyaltyCardNumber() {
        return loyaltyCardNumber;
    }

    public int getPoints() {
        return points;
    }
}
