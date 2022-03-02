package ca.dal.cs.csci3130.a3.q2;

public class Seller extends AppUser{
    public Seller(String userType) {
        super(userType);
    }

    public void setAccessLevel(){
        this.accessLevel = AccessLevel.sellerAccessLevel;
    }
}
