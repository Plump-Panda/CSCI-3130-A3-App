package ca.dal.cs.csci3130.a3.q2;

public class AppUser {

    String userType;
    AccessLevel accessLevel;

    public AppUser(String userType) {
        this.userType = userType;
    }

    public void setAccessLevel() {
        switch (this.userType) {
            case "buyer":
                setAccessLevel(AccessLevel.buyerAccessLevel);
                break;

            case "seller":
                setAccessLevel(AccessLevel.sellerAccessLevel);
                break;

            case "admin":
                setAccessLevel(AccessLevel.adminAccessLevel);
                break;
        }
    }

    public AccessLevel getAccessLevel() {
        return this.accessLevel;
    }

    private void setAccessLevel(AccessLevel accessLevel) {
        this.accessLevel = accessLevel;
    }

    public boolean canPlaceOnlineOrder() {
        if (this.accessLevel.equals(AccessLevel.buyerAccessLevel)) {
            return true;
        } else if (accessLevel.equals(AccessLevel.adminAccessLevel)) {
            return true;
        }
        return false;
    }

    public boolean canPlaceOnlineAd() {
        if (this.accessLevel.equals(AccessLevel.sellerAccessLevel)) {
            return true;
        } else if (accessLevel.equals(AccessLevel.adminAccessLevel)) {
            return true;
        }
        return false;
    }

    public boolean hasAdminAccess() {
        if (this.accessLevel.equals(AccessLevel.adminAccessLevel)) {
            return true;
        }
        return false;
    }
}
