package ca.dal.cs.csci3130.a3.q2;

public class AccessLevel {

    public static final AccessLevel buyerAccessLevel = new AccessLevel("buyer");
    public static final AccessLevel sellerAccessLevel = new AccessLevel("seller");
    public static final AccessLevel adminAccessLevel = new AccessLevel("admin");

    String accessLevel;

    public AccessLevel(String userAccessLevel) {
        this.accessLevel = userAccessLevel;
    }

}
