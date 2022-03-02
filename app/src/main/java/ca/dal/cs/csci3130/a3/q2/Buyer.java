package ca.dal.cs.csci3130.a3.q2;

public class Buyer extends AppUser{
    public Buyer(String userType) {
        super(userType);
    }

    public void setAccessLevel(){
        this.accessLevel = AccessLevel.buyerAccessLevel;
    }
}
